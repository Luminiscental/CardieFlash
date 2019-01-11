package com.cardium.cardieflash;

import java.util.Arrays;
import java.util.HashMap;

import com.cardium.cardieflash.database.CardDb;
import com.cardium.cardieflash.database.Database;
import com.cardium.cardieflash.database.DeckDb;

public class Main {
  public static void main(String args[]) {
    Database database = new Database("jdbc:sqlite:src/main/resources/db/cards.db");
    database.startConnection();
    CardDb cardDb = new CardDb(database);
    DeckDb deckDb = new DeckDb(database);

  }
}