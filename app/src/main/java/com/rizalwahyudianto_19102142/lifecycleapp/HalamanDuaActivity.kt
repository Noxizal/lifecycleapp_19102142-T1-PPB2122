package com.rizalwahyudianto_19102142.lifecycleapp

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class HalamanDuaActivity {

}
<Button
android:id="@+id/btnPage"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="161dp"
android:layout_marginEnd="162dp"
android:text="@string/change_page"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.491"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)setContentView(R.layout.activity_main)btnPage.setOnClickListener{val intent = Intent(this, HalamanDuaActivity::class.java)
        startActivity(intent)
    }
}