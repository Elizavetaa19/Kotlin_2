class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Можно сделать короткую задержку или сразу запустить MainActivity
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}