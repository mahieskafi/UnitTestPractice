package com.example.unittestpractice.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class NoteTest {

    companion object {
        const val TIMESTAMP_1 = "05-2019"
        const val TIMESTAMP_2 = "04-2019"
    }

    @Test
    fun isNoteEqual_identicalProperties_returnTrue() {
        val note1 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_1)
        val note2 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_2)

        assertEquals(note1, note2)
    }

    @Test
    fun isNoteEqual_differentID_returnFalse() {
        val note1 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_1)
        val note2 =
            Note(id = 2, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_1)

        assertNotEquals(note1, note2)
    }

    @Test
    fun isNoteEqual_differentTimestamps_returnTrue() {
        val note1 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_1)
        val note2 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_2)

        assertEquals(note1, note2)
    }

    @Test
    fun isNoteEqual_differentTitles_returnFalse() {
        val note1 =
            Note(id = 1, title = "Note 1", content = "content note1", timeStamp = TIMESTAMP_1)
        val note2 =
            Note(id = 1, title = "Note 2", content = "content note1", timeStamp = TIMESTAMP_1)

        assertNotEquals(note1, note2)
    }
}