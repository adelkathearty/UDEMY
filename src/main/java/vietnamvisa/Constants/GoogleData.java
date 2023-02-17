package vietnamvisa.Constants;

import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.Sheets;
import com.google.auth.oauth2.GoogleCredentials;

import java.io.FileInputStream;

import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

public class GoogleData {

//    GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(""))
//            .createScoped(Collections.singleton(SheetsScopes.SPREADSHEETS));
//    Sheets sheetsService = new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.getDefaultInstance(), credentials)
//            .setApplicationName("Your Application Name")
//            .build();
//
//    public GoogleData() throws IOException, GeneralSecurityException {
//    }
}
