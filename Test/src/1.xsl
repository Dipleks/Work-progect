<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:orientation="vertical">

    <Button
            android:id="@+id/topButton"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Кнопка сверху" />

    <Button
            android:id="@+id/leftButton"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Кнопка слева" />

    <Button
            android:id="@+id/horizontalButton"
            android:layout_width="250dp"
            android:layout_height="50dp"
            android:text="Кнопка размером 200х50 dp" />

    <Button
            android:id="@+id/largeButton"
            android:layout_width="300dp"
            android:layout_height="200dp"
            android:gravity="center_horizontal"
            android:text="Большая кнопка" />
</LinearLayout>