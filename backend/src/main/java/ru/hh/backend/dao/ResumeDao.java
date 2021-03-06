package ru.hh.backend.dao;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.hh.backend.model.Resume;

import java.util.List;

@Repository
public class ResumeDao {
    private final SessionFactory sessionFactory;

    public ResumeDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Resume create(Resume resume) {
        sessionFactory.getCurrentSession().save(resume);
        return resume;
    }

    @Transactional
    public Resume get(Long id) {
        return sessionFactory.getCurrentSession().get(Resume.class, id);
    }

    @Transactional
    public List<Resume> getAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Resume r", Resume.class)
                .getResultList();
    }

}
