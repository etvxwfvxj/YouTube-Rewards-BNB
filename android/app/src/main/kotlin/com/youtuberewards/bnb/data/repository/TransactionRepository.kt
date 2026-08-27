package com.youtuberewards.bnb.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.youtuberewards.bnb.data.model.Transaction
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class TransactionRepository @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase
) {
    private val transactionsRef = firebaseDatabase.getReference("transactions")

    suspend fun recordTransaction(transaction: Transaction): Result<String> = try {
        val id = transactionsRef.push().key ?: throw Exception("Failed to generate transaction ID")
        transactionsRef.child(id).setValue(transaction).await()
        Result.success(id)
    } catch (e: Exception) {
        Result.failure(e)
    }

    suspend fun getUserTransactions(userId: String): Result<List<Transaction>> = try {
        val snapshot = transactionsRef.orderByChild("userId").equalTo(userId).get().await()
        val transactions = snapshot.children.mapNotNull { it.getValue(Transaction::class.java) }
        Result.success(transactions)
    } catch (e: Exception) {
        Result.failure(e)
    }

    suspend fun updateTransactionStatus(transactionId: String, status: String): Result<Unit> = try {
        transactionsRef.child(transactionId).child("status").setValue(status).await()
        Result.success(Unit)
    } catch (e: Exception) {
        Result.failure(e)
    }
}
