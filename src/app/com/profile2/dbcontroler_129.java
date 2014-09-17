package app.com.profile2;

import android.R.string;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbcontroler_129 extends SQLiteOpenHelper{
	
String Age ,Nickname,Birthday,Tel,Facebook ;

	private static final String DATABASE_NAME = "db129";
	private static final String TABLE_REGISTER = "register";
	private static final int DATABASE_VERSION = 1; 
			
	
	
	public dbcontroler_129(Context context) {
		super(context, TABLE_REGISTER, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE   "+  TABLE_REGISTER 
				+"(registerId INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"Age INTEGER,"
				+"Nickname  TEXT(100),"
				+"Birthday TEXT(100),"
				+"Tel INTEGER,Facebook  TEXT(100));");
		Log.d("CREATE TABLE","Create Table Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS  "+TABLE_REGISTER );
		onCreate(db);
	}

	public long insertData(String Age,String Nickname,String Birthday
			,String Tel,String Facebook){
		try {
			SQLiteDatabase db;
			db=this.getWritableDatabase();
			ContentValues s = new ContentValues();
		
			s.put("Age",Age);
			s.put("Nickname", Nickname);
			s.put("Birthday",Birthday);
			s.put("Tel", Tel);
			s.put("Facebook",Facebook);
			
			long k = db.insert(TABLE_REGISTER, null,s);
			db.close();
			return k ;
			
		} catch (Exception e) {
			// TODO: handle exception
			return -1 ;
		}
	
	
	}
}
	
	
	
	

