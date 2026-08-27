# YouTube Rewards BNB - تطبيق مشاهدة يوتيوب وكسب العملات الرقمية

## 📱 نظرة عامة
تطبيق Android احترافي يتيح للمستخدمين مشاهدة مقاطع YouTube وكسب عملات BNB حقيقية كمكافآت، مع لوحة تحكم شاملة للمسؤولين.

---

## ✨ المميزات الرئيسية

### 👤 للمستخدمين:
- ✅ مشاهدة مقاطع YouTube (7 ثوانٍ كحد أدنى)
- ✅ كسب عملات BNB حقيقية كمكافآت
- ✅ نظام تسجيل دخول آمن
- ✅ محفظة رقمية مدمجة
- ✅ دعم MetaMask و Trust Wallet
- ✅ إحصائيات شخصية وتقارير
- ✅ إشعارات فورية
- ✅ واجهة عربية وإنجليزية

### 👨‍💼 للمسؤول:
- ✅ لوحة تحكم شاملة
- ✅ إدارة مقاطع YouTube
- ✅ تتبع المكافآت والمعاملات
- ✅ إحصائيات المستخدمين
- ✅ إدارة العقد الذكي
- ✅ تقارير مالية

---

## 🛠️ التقنيات المستخدمة

### Backend:
- **Firebase Realtime Database** - قاعدة البيانات
- **Firebase Authentication** - نظام المصادقة
- **Firebase Cloud Functions** - الخوادم السحابية
- **Firebase Cloud Storage** - تخزين الملفات

### Mobile (Android):
- **Kotlin** - لغة البرمجة
- **Jetpack Compose** - واجهة المستخدم
- **Retrofit** - استدعاء APIs
- **Web3j** - التفاعل مع Blockchain

### Blockchain:
- **Binance Smart Chain (BSC)** - الشبكة
- **Solidity Smart Contract** - العقد الذكي
- **BNB Token** - العملة الرقمية

### Admin Dashboard:
- **React.js** - واجهة الويب
- **Firebase SDK** - التكامل مع Firebase
- **Chart.js** - الإحصائيات

---

## 📁 هيكل المشروع

```
YouTube-Rewards-BNB/
├── android/                          # تطبيق Android
│   ├── app/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── kotlin/
│   │   │   │   │   ├── ui/
│   │   │   │   │   ├── viewmodel/
│   │   │   │   │   ├── repository/
│   │   │   │   │   ├── utils/
│   │   │   │   │   └── MainActivity.kt
│   │   │   │   ├── res/
│   │   │   │   ├── AndroidManifest.xml
│   │   │   │   └── google-services.json
│   │   │   └── test/
│   │   └── build.gradle
│   └── settings.gradle
├── admin-dashboard/                  # لوحة تحكم المسؤول
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── App.jsx
│   └── package.json
├── smart-contract/                   # العقد الذكي
│   ├── contracts/
│   │   └── RewardToken.sol
│   ├── scripts/
│   └── hardhat.config.js
├── backend/                          # Cloud Functions
│   ├── functions/
│   │   ├── src/
│   │   │   ├── rewards.js
│   │   │   ├── users.js
│   │   │   └── transactions.js
│   │   └── package.json
│   └── firebase.json
└── docs/
    ├── API_DOCUMENTATION.md
    ├── SETUP_GUIDE.md
    ├── SMART_CONTRACT_GUIDE.md
    └── USER_GUIDE.md
```

---

## 🚀 البدء السريع

### 1️⃣ المتطلبات:
- Android Studio
- Firebase Account
- Node.js 16+
- Hardhat (للعقد الذكي)

### 2️⃣ التثبيت:

```bash
# استنساخ المستودع
git clone https://github.com/etvxwfvxj/YouTube-Rewards-BNB.git
cd YouTube-Rewards-BNB

# تثبيت Firebase CLI
npm install -g firebase-tools

# تثبيت dependencies
npm install
```

### 3️⃣ الإعدادات:

```bash
# تحميل Firebase credentials
firebase login
firebase init

# نشر العقد الذكي
cd smart-contract
npx hardhat deploy --network bsc-testnet
```

### 4️⃣ تشغيل التطبيق:

```bash
# فتح Android Studio وتشغيل المشروع
cd android
./gradlew build
```

---

## 📊 مخطط الهندسة

```
┌─────────────────────────────────────────────────────────────┐
│                    Mobile App (Android)                     │
│  ┌──────────────┬──────────────┬──────────────┐             │
│  │   YouTube    │   Wallet     │  Dashboard   │             │
│  │   Player     │   Manager    │   Stats      │             │
│  └──────────────┴──────────────┴──────────────┘             │
└────────────────────┬──────────────────────────────────────┘
                     │
        ┌────────────┴─────────────┐
        │                          │
        ▼                          ▼
   Firebase               Blockchain (BSC)
   ┌─────────────┐        ┌──────────────┐
   │ Database    │        │Smart Contract│
   │ Auth        │        │BNB Token     │
   │ Storage     │        │MetaMask API  │
   └─────────────┘        └──────────────┘
        │
        ▼
   Admin Dashboard (React)
   ┌──────────────────┐
   │ User Management  │
   │ Video Control    │
   │ Analytics        │
   │ Wallet Control   │
   └──────────────────┘
```

---

## 💰 كيفية عمل نظام المكافآت

1. **المستخدم يشاهد مقطع** (7 ثوانٍ على الأقل)
2. **Firebase تسجل المشاهدة** ✅
3. **العقد الذكي يتحقق** من الشروط
4. **BNB يتم تحويله** للمحفظة الشخصية
5. **إشعار فوري** يصل للمستخدم

---

## 🔒 الأمان

- ✅ Firebase Security Rules
- ✅ Smart Contract Audited
- ✅ Encrypted Wallet Keys
- ✅ Two-Factor Authentication (2FA)
- ✅ Rate Limiting

---

## 📞 الدعم والتوثيق

- 📖 [دليل الإعداد](./docs/SETUP_GUIDE.md)
- 🔌 [توثيق API](./docs/API_DOCUMENTATION.md)
- 📝 [دليل المستخدم](./docs/USER_GUIDE.md)
- 🔗 [دليل العقد الذكي](./docs/SMART_CONTRACT_GUIDE.md)

---

## 📄 الترخيص

هذا المشروع مرخص تحت MIT License

---

## 👨‍💻 المطورون

تم بناء هذا المشروع بواسطة فريق متخصص في تطوير التطبيقات والعملات الرقمية.

---

## 📧 التواصل

للأسئلة والدعم: support@youtuberewards.bnb

---

**آخر تحديث:** أغسطس 2026
