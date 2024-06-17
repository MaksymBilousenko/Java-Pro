package homework.archive_of_dokuments.dao;

import java.time.LocalDate;

public interface ArchiveOperations {
    void addDokument(String dokumentName);

    boolean checkDokument();

    String getDokumentByUser(String userName);

    String getDokumentByDate(LocalDate from, LocalDate to);

    String getDokumentById(int id);

    String searchDokumentByKeyWord(String keyWord);


}
