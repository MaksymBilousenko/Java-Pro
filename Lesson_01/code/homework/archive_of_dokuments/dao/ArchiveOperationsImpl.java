package homework.archive_of_dokuments.dao;

import java.time.LocalDate;

public class ArchiveOperationsImpl implements ArchiveOperations{
    int archiveAmount;
    @Override
    public void addDokument(String dokumentName) {

    }

    @Override
    public boolean checkDokument() {
        return false;
    }

    @Override
    public String getDokumentByUser(String userName) {
        return null;
    }

    @Override
    public String getDokumentByDate(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public String getDokumentById(int id) {
        return null;
    }

    @Override
    public String searchDokumentByKeyWord(String keyWord) {
        return null;
    }
}
