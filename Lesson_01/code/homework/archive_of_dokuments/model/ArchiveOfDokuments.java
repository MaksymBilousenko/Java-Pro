package homework.archive_of_dokuments.model;

import java.time.LocalDate;
import java.util.Objects;

public class ArchiveOfDokuments {
    private int id;
    private String dokumentName;
    private String userName;
    private LocalDate date;

    public ArchiveOfDokuments(int id, String dokumentName, String userName, LocalDate date) {
        this.id = id;
        this.dokumentName = dokumentName;
        this.userName = userName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDokumentName() {
        return dokumentName;
    }

    public void setDokumentName(String dokumentName) {
        this.dokumentName = dokumentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchiveOfDokuments that = (ArchiveOfDokuments) o;
        return id == that.id && Objects.equals(dokumentName, that.dokumentName) && Objects.equals(userName, that.userName) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dokumentName, userName, date);
    }

    @Override
    public String toString() {
        return "ArchiveOfDokuments{" +
                "id=" + id +
                ", dokumentName='" + dokumentName + '\'' +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                '}';
    }
}
