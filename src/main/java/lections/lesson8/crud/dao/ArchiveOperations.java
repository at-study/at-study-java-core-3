package lections.lesson8.crud.dao;

import java.util.List;

import lections.lesson8.crud.dao.crud.Create;
import lections.lesson8.crud.dao.crud.Read;
import lections.lesson8.crud.model.Archive;

public class ArchiveOperations implements Create<Archive>, Read<Archive> {

    @Override
    public void create(Archive entity) {

    }

    @Override
    public List<Archive> read() {
        return null;
    }

    @Override
    public Archive read(int id) {
        return null;
    }

}
