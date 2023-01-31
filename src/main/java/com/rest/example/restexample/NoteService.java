package com.rest.example.restexample;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class NoteService {


    public List<Note> notes = Arrays.asList(
            new Note(
                    UUID.randomUUID().toString(),
                    "persona1",
                    "mensaje1" ),
            new Note(
                    UUID.randomUUID().toString(),
                    "persona2",
                    "mensaje2" ),
            new Note(
                    UUID.randomUUID().toString(),
                    "persona3",
                    "mensaje3" ),
            new Note(
                    UUID.randomUUID().toString(),
                    "persona4",
                    "mensaje4" ));

    public void addNote(Note note){
        this.notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
