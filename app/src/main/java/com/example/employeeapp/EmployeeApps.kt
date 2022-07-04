package com.example.employeeapp

import android.app.Application

class EmployeeApps:Application() {
    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }
}