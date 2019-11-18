package br.edu.ifsp.agendasqlite.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.sql.Blob;

import br.edu.ifsp.agendasqlite.R;

class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "agendanova10.db";
    static final String TABLE_NAME ="contatos";

    static final String KEY_ID = "id";
    static final String KEY_NOME = "nome";
    static final String KEY_FONE = "fone";
    static final String KEY_FONE2 = "fone2";
    static final String KEY_EMAIL = "email";
    static final String KEY_FAVORITO = "favorito";
    static final String KEY_DTANIVERSARIO = "dtaniversario";

    private static final int DATABASE_VERSION = 4;

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + KEY_NOME + " TEXT, "
            + KEY_FONE + " TEXT, "
            + KEY_EMAIL + " TEXT);" ;

    public SQLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String DATABASE_ALTER_CONTATO_1 = "ALTER TABLE "
                + TABLE_NAME + " ADD COLUMN " + KEY_FAVORITO + " TEXT DEFAULT 0;";

        String DATABASE_ALTER_CONTATO_2 = "ALTER TABLE "
                + TABLE_NAME + " ADD COLUMN " + KEY_FONE2 + " TEXT;";

        String DATABASE_ALTER_CONTATO_3 = "ALTER TABLE "
                + TABLE_NAME + " ADD COLUMN " + KEY_DTANIVERSARIO + " TEXT;";

        if (oldVersion == 1){
            db.execSQL(DATABASE_ALTER_CONTATO_1);
            db.execSQL(DATABASE_ALTER_CONTATO_2);
            db.execSQL(DATABASE_ALTER_CONTATO_3);
        } else if (oldVersion == 2){
            db.execSQL(DATABASE_ALTER_CONTATO_2);
            db.execSQL(DATABASE_ALTER_CONTATO_3);
        } else if (oldVersion == 3){
            db.execSQL(DATABASE_ALTER_CONTATO_3);
        }
    }
}
