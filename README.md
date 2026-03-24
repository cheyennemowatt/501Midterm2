# Summary 
Built using Android Studio and Kotlin, this application refactors by moveing the counter state out of the composable into a ViewModel so the UI simply displays the data and sends events, allowing the state to persist and automatically update the screen when it changes.

# Screenshots of the Running App

<img width="229" height="510" alt="Screenshot 2026-03-23 at 10 40 20 PM" src="https://github.com/user-attachments/assets/e451adac-169f-45ad-b6c4-f1827a24c6f0" />

<img width="347" height="159" alt="Screenshot 2026-03-23 at 10 39 38 PM" src="https://github.com/user-attachments/assets/1ef42d53-cfc1-45d6-9ea0-a82d3695cdd2" />




# Details
- Emulator: Medium Phone API 36.1
- SDK Version: Android 16.0 ("Baklava") API Level 36.0


# AI Disclosure

While AI was not utilized to generate any of the code for this problem, I had a problem importing viewmodels so I utilized ChatGPT to fix my gradle and libs.versions.toml files. It suggested these lines which I added: implementation(libs.androidx.lifecycle.viewmodel.compose)  & androidx-lifecycle-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version.ref = "lifecycleRuntimeKtx" }
