package Model;



/**
 * TAchievement entity. @author MyEclipse Persistence Tools
 */

public class TAchievement  implements java.io.Serializable {


    // Fields    

     private Integer achId;
     private Integer diagnosisId;
     private Double score;
     private Integer examId;


    // Constructors

    /** default constructor */
    public TAchievement() {
    }

    
    /** full constructor */
    public TAchievement(Integer diagnosisId, Double score, Integer examId) {
        this.diagnosisId = diagnosisId;
        this.score = score;
        this.examId = examId;
    }

   
    // Property accessors

    public Integer getAchId() {
        return this.achId;
    }
    
    public void setAchId(Integer achId) {
        this.achId = achId;
    }

    public Integer getDiagnosisId() {
        return this.diagnosisId;
    }
    
    public void setDiagnosisId(Integer diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public Double getScore() {
        return this.score;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getExamId() {
        return this.examId;
    }
    
    public void setExamId(Integer examId) {
        this.examId = examId;
    }
   








}