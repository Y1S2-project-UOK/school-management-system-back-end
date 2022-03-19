/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "marks", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marks.findAll", query = "SELECT m FROM Marks m"),
    @NamedQuery(name = "Marks.findByExamCode", query = "SELECT m FROM Marks m WHERE m.marksPK.examCode = :examCode"),
    @NamedQuery(name = "Marks.findByStudentAdmissionNo", query = "SELECT m FROM Marks m WHERE m.marksPK.studentAdmissionNo = :studentAdmissionNo"),
    @NamedQuery(name = "Marks.findBySubjectCode", query = "SELECT m FROM Marks m WHERE m.marksPK.subjectCode = :subjectCode"),
    @NamedQuery(name = "Marks.findByMarks", query = "SELECT m FROM Marks m WHERE m.marks = :marks")})
public class Marks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MarksPK marksPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "marks")
    private Float marks;
    @JoinColumn(name = "exam_code", referencedColumnName = "exam_code", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exam exam;
    @JoinColumn(name = "student_admission_no", referencedColumnName = "student_admission_no", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;
    @JoinColumn(name = "subject_code", referencedColumnName = "subject_code", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Subjects subjects;

    public Marks() {
    }

    public Marks(MarksPK marksPK) {
        this.marksPK = marksPK;
    }

    public Marks(String examCode, String studentAdmissionNo, String subjectCode) {
        this.marksPK = new MarksPK(examCode, studentAdmissionNo, subjectCode);
    }

    public MarksPK getMarksPK() {
        return marksPK;
    }

    public void setMarksPK(MarksPK marksPK) {
        this.marksPK = marksPK;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marksPK != null ? marksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marks)) {
            return false;
        }
        Marks other = (Marks) object;
        if ((this.marksPK == null && other.marksPK != null) || (this.marksPK != null && !this.marksPK.equals(other.marksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Marks[ marksPK=" + marksPK + " ]";
    }
    
}
