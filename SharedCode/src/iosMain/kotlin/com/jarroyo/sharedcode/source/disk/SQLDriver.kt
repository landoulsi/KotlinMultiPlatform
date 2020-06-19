package com.jarroyo.sharedcode.source.disk

import com.jarroyo.sharedcode.Database
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DbArgs()

actual fun getSqlDriver(dbArgs: DbArgs): SqlDriver? {
    return NativeSqliteDriver(Database.Schema, "test.db")
}