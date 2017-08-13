package com.otr.dbms.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "patient_info", schema = "patientdb")
public class PatientInfoEntity {
    private String name;
    private String subjectCode;
    private String idNumber;
    private String phone;
    private Date dateTest;
    private Date birthdate;
    private Integer age;
    private Integer gr;
    private Integer sex;
    private Integer bac;
    private Integer edu;
    private Integer eduY;
    private Integer musEdu;
    private Integer musEduY;
    private Integer hand;
    private String profession;
    private String currentWork;
    private Integer intoxicant;
    private Integer eye;
    private Integer ear;
    private Integer injuryWithFainting;
    private Integer fainting;
    private Integer neurologist;
    private Integer psychiatrist;
    private Integer depression;
    private Integer hypertension;
    private Integer heartAttack;
    private Integer cardiacArrest;
    private Integer cardiacInsuff;
    private Integer kidneysInsuff;
    private Integer liverInsuff;
    private Integer diabetes;
    private Integer thyroid;
    private Integer lungs;
    private Integer neurodegeneration;
    private String otherdisorders;
    private String alcoNow;
    private String alcoPa;
    private Integer drugs;
    private Integer ageOnset;
    private Integer ageDiagnosis;
    private Integer diseaseDurationY;
    private Integer memoryComplains;
    private String otherCognitiveComplains;
    private Integer sideSymptOnSet;
    private String currentSympt;
    private String tkMri;
    private Integer asymmsymptNow;
    private Integer motPhenot;
    private Integer updrsDyskin32333435;
    private Integer updrsMotFluct36373839;
    private Integer updrsFalling13;
    private Integer hallucination2;
    private Integer hallucinationOnSetY;
    private String medications;
    private Double lDopaequiv;
    private String otherTreatment;
    private Integer surg;
    private String surgDesc;
    private Integer adlon;
    private Integer adloff;
    private Integer iadlon;
    private Integer iadloff;
    private Integer hAndYon;
    private Integer hAndYoff;
    private Integer schAndEngOn;
    private Integer schAndEngOff;
    private Integer updrson;
    private Integer updrsoff;
    private Integer updrsion;
    private Integer updrsioff;
    private Integer updrsiion;
    private Integer updrsiioff;
    private Integer updrsiiion;
    private Integer updrsiiioff;
    private Integer updrsSpeech5;
    private Integer updrsSpeech18;
    private Integer updrsFacialExpress19;
    private Integer updrsTremorRest20;
    private Integer updrsEssentialTremor21;
    private Integer updrsRidigity22;
    private Integer updrsDigitMov23;
    private Integer updrsiiiHandMov24;
    private Integer updrsRapidAlterHandMov25;
    private Integer updrsLegAgility26;
    private Integer updrsArisingChair27;
    private Integer updrsPosture28;
    private Integer updrsPostureStab29;
    private Integer updrsGait30;
    private Integer updrsiiiBradykinesia31;
    private Integer progressionPd;
    private Integer umsarsi;
    private Integer umsarsii;
    private Integer umsarsiiiOrthostatic;
    private Integer umsarsiv;
    private Integer umsarsiIi;
    private Integer umsarsiSpeech1;
    private Integer umsarsiWalking7;
    private Integer umsarsiFalling8;
    private Integer umsarsiiFacialExpression1;
    private Integer umsarsiiSpeech2;
    private Integer umsarsiiOcuMotDys3;
    private Integer umsarsiiTremRest4;
    private Integer umsarsiiActTrem5;
    private Integer umsarsiiIncTone6;
    private Integer umsarsRapidAlterMovHands7;
    private Integer umsarsFingertaps8;
    private Integer umsarsLegAgility9;
    private Integer umsarsHeelknee10;
    private Integer umsarsArisingChair11;
    private Integer umsarsPosture12;
    private Integer umsarsBodysway13;
    private Integer umsarsGait14;
    private Integer attentionFactAceIii;
    private Integer memFactAceIii;
    private Integer fluencyFactAceIii;
    private Integer langFactAceIii;
    private Integer visualFactAceIii;
    private Integer totalAceIii;
    private Integer totalMiniAceIii;
    private Integer mmse;
    private Integer fab12;
    private Integer bdi1314;
    private Integer gds910;
    private Integer waisRPicture;
    private Integer waisRPictureCent;
    private Integer cvlt15;
    private Integer cvlt15Sten;
    private Integer cvltA1;
    private Integer cvltA1Sten;
    private Integer cvltA5;
    private Integer cvltA5Sten;
    private Integer cvltB;
    private Integer cvltBSten;
    private Integer cvltstmFree;
    private Integer cvltstmFreeSten;
    private Integer cvltstmCued;
    private Integer cvltstmCuedSten;
    private Integer cvltltmFree;
    private Integer cvltltmFreeSten;
    private Integer cvltltmCued;
    private Integer cvltltmCuedSten;
    private Integer cvltSemCluster;
    private Integer cvltSemClustSten;
    private Integer cvlTserialClust;
    private Integer cvlTserialClustSten;
    private Integer cvltPercentCorrectI;
    private Integer cvltPercentCorrectISten;
    private Integer cvltPercentCorrectIi;
    private Integer cvltPercentCorrectIiSten;
    private Integer cvltPercentCorrectIii;
    private Integer cvltPercentCorrectIiiSten;
    private Integer cvlTagreeFactor;
    private Integer cvlTagreeFactorSten;
    private Integer cvltpers;
    private Integer persSten;
    private Integer cvlTintrusFree;
    private Integer cvlTintrusFreeSten;
    private Integer cvlTintrusCues;
    private Integer cvlTintrusCuesSten;
    private Integer cvltRecogTotal;
    private Integer cvltRecogTotalSten;
    private Integer cvltDifferentiation;
    private Integer cvltDifferentiationSten;
    private Integer cvltErrorRecog;
    private Integer cvltErrorRecogSten;
    private Integer tmtA;
    private Integer tmtAcent;
    private Integer tmtAErrors;
    private Integer tmtB;
    private Integer tmtBcent;
    private Integer tmtBErrors;
    private Integer rythymtestAbc;
    private Integer rythymtestAbCranga;
    private Integer tolTotalCorrect;
    private Integer tolTotalCorrectCent;
    private Integer tolTotalMoveScore;
    private Integer tolTotalMoveScoreCent;
    private Integer tolTotalInitTime;
    private Integer tolTotalInitTimeCent;
    private Integer tolTotalExecutTime;
    private Integer tolTotalExecutTimeCent;
    private Integer tolTotalTime;
    private Integer tolTotalTimeCent;
    private Integer fluencyKraw;
    private Integer fluencyAnimalsRaw;
    private Integer fluencySharpsRaw;
    private Integer bntTotalScore;
    private Integer bntCorrectPhonemCues;
    private Integer bntCorrectSemantCues;
    private Integer bntCorrectContextCues;
    private Integer bntMeanTime;
    private Integer clox1Draw;
    private Integer clox2Copy;
    private Double rbmtShortDelay;
    private Double rbmtShortDelayCent;
    private Double rbmtLongDelay;
    private Double rbmtLongDelayCent;
    private Double gonogoProcentInCorrGo;
    private Double gonogoProcentInCorrNogo;
    private Double gonogoNrInCorrGo;
    private Double gonogoNrInCorrNogo;
    private Double gonogoNrCorrectGo;
    private Double gonogoNrCorrectNogo;
    private Double meanResponseTimeCorrrectGo;
    private Double elevatorCountTotal;
    private Double elevatorCountTotalCent;
    private Double elevatorDistractTotal;
    private Double elevatorDistractTotalCent;
    private Double wcstlpp;
    private Double wcstlpo;
    private Double wcstlbo;
    private Double wcstLbOcent;
    private Double wcstpb;
    private Double wcstop;
    private Double wcstoPcent;
    private Double wcstpop;
    private Double wcstbp;
    private Double wcstbPcent;
    private Double wcstpbp;
    private Double wcstpbPcent;
    private Double wcstbn;
    private Double wcstbNcent;
    private Double wcstpbn;
    private Double wcstodp;
    private Double wcstpodp;
    private Double wcstpodPcent;
    private Double wcstlzk;
    private Double wcstppmz;
    private Double wcstpun;
    private Double wcstuu;
    private Double similarWaisTotal;
    private Double similarWaisCent;
    private Double waisInfo;
    private Double waisInfoCent;
    private Double waisDigitSpan;
    private Double waisDigitSpanCent;
    private Double mirrorTotalTime;
    private Double mirrorMeanTime;
    private Double mirrorCorrectScore;
    private Double mirrorErrors;
    private Double mirrorCorrectedErrors;
    private Double jloCorrect;
    private Double jlowp;
    private Double jlOcent;

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SubjectCode")
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Id
    @Column(name = "IDNumber")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "DateTest")
    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }

    @Basic
    @Column(name = "Birthdate")
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "Age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "Gr")
    public Integer getGr() {
        return gr;
    }

    public void setGr(Integer gr) {
        this.gr = gr;
    }

    @Basic
    @Column(name = "Sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "Bac")
    public Integer getBac() {
        return bac;
    }

    public void setBac(Integer bac) {
        this.bac = bac;
    }

    @Basic
    @Column(name = "Edu")
    public Integer getEdu() {
        return edu;
    }

    public void setEdu(Integer edu) {
        this.edu = edu;
    }

    @Basic
    @Column(name = "EduY")
    public Integer getEduY() {
        return eduY;
    }

    public void setEduY(Integer eduY) {
        this.eduY = eduY;
    }

    @Basic
    @Column(name = "MusEdu")
    public Integer getMusEdu() {
        return musEdu;
    }

    public void setMusEdu(Integer musEdu) {
        this.musEdu = musEdu;
    }

    @Basic
    @Column(name = "MusEduY")
    public Integer getMusEduY() {
        return musEduY;
    }

    public void setMusEduY(Integer musEduY) {
        this.musEduY = musEduY;
    }

    @Basic
    @Column(name = "Hand")
    public Integer getHand() {
        return hand;
    }

    public void setHand(Integer hand) {
        this.hand = hand;
    }

    @Basic
    @Column(name = "Profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "CurrentWork")
    public String getCurrentWork() {
        return currentWork;
    }

    public void setCurrentWork(String currentWork) {
        this.currentWork = currentWork;
    }

    @Basic
    @Column(name = "Intoxicant")
    public Integer getIntoxicant() {
        return intoxicant;
    }

    public void setIntoxicant(Integer intoxicant) {
        this.intoxicant = intoxicant;
    }

    @Basic
    @Column(name = "Eye")
    public Integer getEye() {
        return eye;
    }

    public void setEye(Integer eye) {
        this.eye = eye;
    }

    @Basic
    @Column(name = "Ear")
    public Integer getEar() {
        return ear;
    }

    public void setEar(Integer ear) {
        this.ear = ear;
    }

    @Basic
    @Column(name = "InjuryWithFainting")
    public Integer getInjuryWithFainting() {
        return injuryWithFainting;
    }

    public void setInjuryWithFainting(Integer injuryWithFainting) {
        this.injuryWithFainting = injuryWithFainting;
    }

    @Basic
    @Column(name = "Fainting")
    public Integer getFainting() {
        return fainting;
    }

    public void setFainting(Integer fainting) {
        this.fainting = fainting;
    }

    @Basic
    @Column(name = "Neurologist")
    public Integer getNeurologist() {
        return neurologist;
    }

    public void setNeurologist(Integer neurologist) {
        this.neurologist = neurologist;
    }

    @Basic
    @Column(name = "Psychiatrist")
    public Integer getPsychiatrist() {
        return psychiatrist;
    }

    public void setPsychiatrist(Integer psychiatrist) {
        this.psychiatrist = psychiatrist;
    }

    @Basic
    @Column(name = "Depression")
    public Integer getDepression() {
        return depression;
    }

    public void setDepression(Integer depression) {
        this.depression = depression;
    }

    @Basic
    @Column(name = "Hypertension")
    public Integer getHypertension() {
        return hypertension;
    }

    public void setHypertension(Integer hypertension) {
        this.hypertension = hypertension;
    }

    @Basic
    @Column(name = "HeartAttack")
    public Integer getHeartAttack() {
        return heartAttack;
    }

    public void setHeartAttack(Integer heartAttack) {
        this.heartAttack = heartAttack;
    }

    @Basic
    @Column(name = "CardiacArrest")
    public Integer getCardiacArrest() {
        return cardiacArrest;
    }

    public void setCardiacArrest(Integer cardiacArrest) {
        this.cardiacArrest = cardiacArrest;
    }

    @Basic
    @Column(name = "CardiacInsuff")
    public Integer getCardiacInsuff() {
        return cardiacInsuff;
    }

    public void setCardiacInsuff(Integer cardiacInsuff) {
        this.cardiacInsuff = cardiacInsuff;
    }

    @Basic
    @Column(name = "KidneysInsuff")
    public Integer getKidneysInsuff() {
        return kidneysInsuff;
    }

    public void setKidneysInsuff(Integer kidneysInsuff) {
        this.kidneysInsuff = kidneysInsuff;
    }

    @Basic
    @Column(name = "LiverInsuff")
    public Integer getLiverInsuff() {
        return liverInsuff;
    }

    public void setLiverInsuff(Integer liverInsuff) {
        this.liverInsuff = liverInsuff;
    }

    @Basic
    @Column(name = "Diabetes")
    public Integer getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Integer diabetes) {
        this.diabetes = diabetes;
    }

    @Basic
    @Column(name = "Thyroid")
    public Integer getThyroid() {
        return thyroid;
    }

    public void setThyroid(Integer thyroid) {
        this.thyroid = thyroid;
    }

    @Basic
    @Column(name = "Lungs")
    public Integer getLungs() {
        return lungs;
    }

    public void setLungs(Integer lungs) {
        this.lungs = lungs;
    }

    @Basic
    @Column(name = "Neurodegeneration")
    public Integer getNeurodegeneration() {
        return neurodegeneration;
    }

    public void setNeurodegeneration(Integer neurodegeneration) {
        this.neurodegeneration = neurodegeneration;
    }

    @Basic
    @Column(name = "Otherdisorders")
    public String getOtherdisorders() {
        return otherdisorders;
    }

    public void setOtherdisorders(String otherdisorders) {
        this.otherdisorders = otherdisorders;
    }

    @Basic
    @Column(name = "Alco_now")
    public String getAlcoNow() {
        return alcoNow;
    }

    public void setAlcoNow(String alcoNow) {
        this.alcoNow = alcoNow;
    }

    @Basic
    @Column(name = "Alco_pa")
    public String getAlcoPa() {
        return alcoPa;
    }

    public void setAlcoPa(String alcoPa) {
        this.alcoPa = alcoPa;
    }

    @Basic
    @Column(name = "Drugs")
    public Integer getDrugs() {
        return drugs;
    }

    public void setDrugs(Integer drugs) {
        this.drugs = drugs;
    }

    @Basic
    @Column(name = "AgeOnset")
    public Integer getAgeOnset() {
        return ageOnset;
    }

    public void setAgeOnset(Integer ageOnset) {
        this.ageOnset = ageOnset;
    }

    @Basic
    @Column(name = "AgeDiagnosis")
    public Integer getAgeDiagnosis() {
        return ageDiagnosis;
    }

    public void setAgeDiagnosis(Integer ageDiagnosis) {
        this.ageDiagnosis = ageDiagnosis;
    }

    @Basic
    @Column(name = "DiseaseDurationY")
    public Integer getDiseaseDurationY() {
        return diseaseDurationY;
    }

    public void setDiseaseDurationY(Integer diseaseDurationY) {
        this.diseaseDurationY = diseaseDurationY;
    }

    @Basic
    @Column(name = "MemoryComplains")
    public Integer getMemoryComplains() {
        return memoryComplains;
    }

    public void setMemoryComplains(Integer memoryComplains) {
        this.memoryComplains = memoryComplains;
    }

    @Basic
    @Column(name = "OtherCognitiveComplains")
    public String getOtherCognitiveComplains() {
        return otherCognitiveComplains;
    }

    public void setOtherCognitiveComplains(String otherCognitiveComplains) {
        this.otherCognitiveComplains = otherCognitiveComplains;
    }

    @Basic
    @Column(name = "SideSymptOnSet")
    public Integer getSideSymptOnSet() {
        return sideSymptOnSet;
    }

    public void setSideSymptOnSet(Integer sideSymptOnSet) {
        this.sideSymptOnSet = sideSymptOnSet;
    }

    @Basic
    @Column(name = "CurrentSympt")
    public String getCurrentSympt() {
        return currentSympt;
    }

    public void setCurrentSympt(String currentSympt) {
        this.currentSympt = currentSympt;
    }

    @Basic
    @Column(name = "TK_MRI")
    public String getTkMri() {
        return tkMri;
    }

    public void setTkMri(String tkMri) {
        this.tkMri = tkMri;
    }

    @Basic
    @Column(name = "AsymmsymptNow")
    public Integer getAsymmsymptNow() {
        return asymmsymptNow;
    }

    public void setAsymmsymptNow(Integer asymmsymptNow) {
        this.asymmsymptNow = asymmsymptNow;
    }

    @Basic
    @Column(name = "MotPhenot")
    public Integer getMotPhenot() {
        return motPhenot;
    }

    public void setMotPhenot(Integer motPhenot) {
        this.motPhenot = motPhenot;
    }

    @Basic
    @Column(name = "UPDRSDyskin_32_33_34_35")
    public Integer getUpdrsDyskin32333435() {
        return updrsDyskin32333435;
    }

    public void setUpdrsDyskin32333435(Integer updrsDyskin32333435) {
        this.updrsDyskin32333435 = updrsDyskin32333435;
    }

    @Basic
    @Column(name = "UPDRSMotFluct36_37_38_39")
    public Integer getUpdrsMotFluct36373839() {
        return updrsMotFluct36373839;
    }

    public void setUpdrsMotFluct36373839(Integer updrsMotFluct36373839) {
        this.updrsMotFluct36373839 = updrsMotFluct36373839;
    }

    @Basic
    @Column(name = "UPDRSFalling_13")
    public Integer getUpdrsFalling13() {
        return updrsFalling13;
    }

    public void setUpdrsFalling13(Integer updrsFalling13) {
        this.updrsFalling13 = updrsFalling13;
    }

    @Basic
    @Column(name = "Hallucination_2")
    public Integer getHallucination2() {
        return hallucination2;
    }

    public void setHallucination2(Integer hallucination2) {
        this.hallucination2 = hallucination2;
    }

    @Basic
    @Column(name = "HallucinationOnSetY")
    public Integer getHallucinationOnSetY() {
        return hallucinationOnSetY;
    }

    public void setHallucinationOnSetY(Integer hallucinationOnSetY) {
        this.hallucinationOnSetY = hallucinationOnSetY;
    }

    @Basic
    @Column(name = "Medications")
    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    @Basic
    @Column(name = "L_Dopaequiv")
    public Double getlDopaequiv() {
        return lDopaequiv;
    }

    public void setlDopaequiv(Double lDopaequiv) {
        this.lDopaequiv = lDopaequiv;
    }

    @Basic
    @Column(name = "OtherTreatment")
    public String getOtherTreatment() {
        return otherTreatment;
    }

    public void setOtherTreatment(String otherTreatment) {
        this.otherTreatment = otherTreatment;
    }

    @Basic
    @Column(name = "Surg")
    public Integer getSurg() {
        return surg;
    }

    public void setSurg(Integer surg) {
        this.surg = surg;
    }

    @Basic
    @Column(name = "Surg_Desc")
    public String getSurgDesc() {
        return surgDesc;
    }

    public void setSurgDesc(String surgDesc) {
        this.surgDesc = surgDesc;
    }

    @Basic
    @Column(name = "ADLON")
    public Integer getAdlon() {
        return adlon;
    }

    public void setAdlon(Integer adlon) {
        this.adlon = adlon;
    }

    @Basic
    @Column(name = "ADLOFF")
    public Integer getAdloff() {
        return adloff;
    }

    public void setAdloff(Integer adloff) {
        this.adloff = adloff;
    }

    @Basic
    @Column(name = "IADLON")
    public Integer getIadlon() {
        return iadlon;
    }

    public void setIadlon(Integer iadlon) {
        this.iadlon = iadlon;
    }

    @Basic
    @Column(name = "IADLOFF")
    public Integer getIadloff() {
        return iadloff;
    }

    public void setIadloff(Integer iadloff) {
        this.iadloff = iadloff;
    }

    @Basic
    @Column(name = "HAndYON")
    public Integer gethAndYon() {
        return hAndYon;
    }

    public void sethAndYon(Integer hAndYon) {
        this.hAndYon = hAndYon;
    }

    @Basic
    @Column(name = "HAndYOFF")
    public Integer gethAndYoff() {
        return hAndYoff;
    }

    public void sethAndYoff(Integer hAndYoff) {
        this.hAndYoff = hAndYoff;
    }

    @Basic
    @Column(name = "SchAndEngON")
    public Integer getSchAndEngOn() {
        return schAndEngOn;
    }

    public void setSchAndEngOn(Integer schAndEngOn) {
        this.schAndEngOn = schAndEngOn;
    }

    @Basic
    @Column(name = "SchAndEngOFF")
    public Integer getSchAndEngOff() {
        return schAndEngOff;
    }

    public void setSchAndEngOff(Integer schAndEngOff) {
        this.schAndEngOff = schAndEngOff;
    }

    @Basic
    @Column(name = "UPDRSON")
    public Integer getUpdrson() {
        return updrson;
    }

    public void setUpdrson(Integer updrson) {
        this.updrson = updrson;
    }

    @Basic
    @Column(name = "UPDRSOFF")
    public Integer getUpdrsoff() {
        return updrsoff;
    }

    public void setUpdrsoff(Integer updrsoff) {
        this.updrsoff = updrsoff;
    }

    @Basic
    @Column(name = "UPDRSION")
    public Integer getUpdrsion() {
        return updrsion;
    }

    public void setUpdrsion(Integer updrsion) {
        this.updrsion = updrsion;
    }

    @Basic
    @Column(name = "UPDRSIOFF")
    public Integer getUpdrsioff() {
        return updrsioff;
    }

    public void setUpdrsioff(Integer updrsioff) {
        this.updrsioff = updrsioff;
    }

    @Basic
    @Column(name = "UPDRSIION")
    public Integer getUpdrsiion() {
        return updrsiion;
    }

    public void setUpdrsiion(Integer updrsiion) {
        this.updrsiion = updrsiion;
    }

    @Basic
    @Column(name = "UPDRSIIOFF")
    public Integer getUpdrsiioff() {
        return updrsiioff;
    }

    public void setUpdrsiioff(Integer updrsiioff) {
        this.updrsiioff = updrsiioff;
    }

    @Basic
    @Column(name = "UPDRSIIION")
    public Integer getUpdrsiiion() {
        return updrsiiion;
    }

    public void setUpdrsiiion(Integer updrsiiion) {
        this.updrsiiion = updrsiiion;
    }

    @Basic
    @Column(name = "UPDRSIIIOFF")
    public Integer getUpdrsiiioff() {
        return updrsiiioff;
    }

    public void setUpdrsiiioff(Integer updrsiiioff) {
        this.updrsiiioff = updrsiiioff;
    }

    @Basic
    @Column(name = "UPDRS_Speech_5")
    public Integer getUpdrsSpeech5() {
        return updrsSpeech5;
    }

    public void setUpdrsSpeech5(Integer updrsSpeech5) {
        this.updrsSpeech5 = updrsSpeech5;
    }

    @Basic
    @Column(name = "UPDRS_Speech_18")
    public Integer getUpdrsSpeech18() {
        return updrsSpeech18;
    }

    public void setUpdrsSpeech18(Integer updrsSpeech18) {
        this.updrsSpeech18 = updrsSpeech18;
    }

    @Basic
    @Column(name = "UPDRS_FacialExpress_19")
    public Integer getUpdrsFacialExpress19() {
        return updrsFacialExpress19;
    }

    public void setUpdrsFacialExpress19(Integer updrsFacialExpress19) {
        this.updrsFacialExpress19 = updrsFacialExpress19;
    }

    @Basic
    @Column(name = "UPDRS_TremorRest_20")
    public Integer getUpdrsTremorRest20() {
        return updrsTremorRest20;
    }

    public void setUpdrsTremorRest20(Integer updrsTremorRest20) {
        this.updrsTremorRest20 = updrsTremorRest20;
    }

    @Basic
    @Column(name = "UPDRS_EssentialTremor_21")
    public Integer getUpdrsEssentialTremor21() {
        return updrsEssentialTremor21;
    }

    public void setUpdrsEssentialTremor21(Integer updrsEssentialTremor21) {
        this.updrsEssentialTremor21 = updrsEssentialTremor21;
    }

    @Basic
    @Column(name = "UPDRS_Ridigity_22")
    public Integer getUpdrsRidigity22() {
        return updrsRidigity22;
    }

    public void setUpdrsRidigity22(Integer updrsRidigity22) {
        this.updrsRidigity22 = updrsRidigity22;
    }

    @Basic
    @Column(name = "UPDRS_DigitMov23")
    public Integer getUpdrsDigitMov23() {
        return updrsDigitMov23;
    }

    public void setUpdrsDigitMov23(Integer updrsDigitMov23) {
        this.updrsDigitMov23 = updrsDigitMov23;
    }

    @Basic
    @Column(name = "UPDRSIII_HandMov_24")
    public Integer getUpdrsiiiHandMov24() {
        return updrsiiiHandMov24;
    }

    public void setUpdrsiiiHandMov24(Integer updrsiiiHandMov24) {
        this.updrsiiiHandMov24 = updrsiiiHandMov24;
    }

    @Basic
    @Column(name = "UPDRSRapidAlterHandMov_25")
    public Integer getUpdrsRapidAlterHandMov25() {
        return updrsRapidAlterHandMov25;
    }

    public void setUpdrsRapidAlterHandMov25(Integer updrsRapidAlterHandMov25) {
        this.updrsRapidAlterHandMov25 = updrsRapidAlterHandMov25;
    }

    @Basic
    @Column(name = "UPDRSLegAgility_26")
    public Integer getUpdrsLegAgility26() {
        return updrsLegAgility26;
    }

    public void setUpdrsLegAgility26(Integer updrsLegAgility26) {
        this.updrsLegAgility26 = updrsLegAgility26;
    }

    @Basic
    @Column(name = "UPDRSArisingChair_27")
    public Integer getUpdrsArisingChair27() {
        return updrsArisingChair27;
    }

    public void setUpdrsArisingChair27(Integer updrsArisingChair27) {
        this.updrsArisingChair27 = updrsArisingChair27;
    }

    @Basic
    @Column(name = "UPDRSPosture_28")
    public Integer getUpdrsPosture28() {
        return updrsPosture28;
    }

    public void setUpdrsPosture28(Integer updrsPosture28) {
        this.updrsPosture28 = updrsPosture28;
    }

    @Basic
    @Column(name = "UPDRS_PostureStab_29")
    public Integer getUpdrsPostureStab29() {
        return updrsPostureStab29;
    }

    public void setUpdrsPostureStab29(Integer updrsPostureStab29) {
        this.updrsPostureStab29 = updrsPostureStab29;
    }

    @Basic
    @Column(name = "UPDRS_Gait_30")
    public Integer getUpdrsGait30() {
        return updrsGait30;
    }

    public void setUpdrsGait30(Integer updrsGait30) {
        this.updrsGait30 = updrsGait30;
    }

    @Basic
    @Column(name = "UPDRSIII_Bradykinesia_31")
    public Integer getUpdrsiiiBradykinesia31() {
        return updrsiiiBradykinesia31;
    }

    public void setUpdrsiiiBradykinesia31(Integer updrsiiiBradykinesia31) {
        this.updrsiiiBradykinesia31 = updrsiiiBradykinesia31;
    }

    @Basic
    @Column(name = "Progression_PD")
    public Integer getProgressionPd() {
        return progressionPd;
    }

    public void setProgressionPd(Integer progressionPd) {
        this.progressionPd = progressionPd;
    }

    @Basic
    @Column(name = "UMSARSI")
    public Integer getUmsarsi() {
        return umsarsi;
    }

    public void setUmsarsi(Integer umsarsi) {
        this.umsarsi = umsarsi;
    }

    @Basic
    @Column(name = "UMSARSII")
    public Integer getUmsarsii() {
        return umsarsii;
    }

    public void setUmsarsii(Integer umsarsii) {
        this.umsarsii = umsarsii;
    }

    @Basic
    @Column(name = "UMSARSIII_Orthostatic")
    public Integer getUmsarsiiiOrthostatic() {
        return umsarsiiiOrthostatic;
    }

    public void setUmsarsiiiOrthostatic(Integer umsarsiiiOrthostatic) {
        this.umsarsiiiOrthostatic = umsarsiiiOrthostatic;
    }

    @Basic
    @Column(name = "UMSARSIV")
    public Integer getUmsarsiv() {
        return umsarsiv;
    }

    public void setUmsarsiv(Integer umsarsiv) {
        this.umsarsiv = umsarsiv;
    }

    @Basic
    @Column(name = "UMSARSI_II")
    public Integer getUmsarsiIi() {
        return umsarsiIi;
    }

    public void setUmsarsiIi(Integer umsarsiIi) {
        this.umsarsiIi = umsarsiIi;
    }

    @Basic
    @Column(name = "UMSARSISpeech_1")
    public Integer getUmsarsiSpeech1() {
        return umsarsiSpeech1;
    }

    public void setUmsarsiSpeech1(Integer umsarsiSpeech1) {
        this.umsarsiSpeech1 = umsarsiSpeech1;
    }

    @Basic
    @Column(name = "UMSARSIWalking_7")
    public Integer getUmsarsiWalking7() {
        return umsarsiWalking7;
    }

    public void setUmsarsiWalking7(Integer umsarsiWalking7) {
        this.umsarsiWalking7 = umsarsiWalking7;
    }

    @Basic
    @Column(name = "UMSARSIFalling_8")
    public Integer getUmsarsiFalling8() {
        return umsarsiFalling8;
    }

    public void setUmsarsiFalling8(Integer umsarsiFalling8) {
        this.umsarsiFalling8 = umsarsiFalling8;
    }

    @Basic
    @Column(name = "UMSARSII_FacialExpression_1")
    public Integer getUmsarsiiFacialExpression1() {
        return umsarsiiFacialExpression1;
    }

    public void setUmsarsiiFacialExpression1(Integer umsarsiiFacialExpression1) {
        this.umsarsiiFacialExpression1 = umsarsiiFacialExpression1;
    }

    @Basic
    @Column(name = "UMSARSIISpeech_2")
    public Integer getUmsarsiiSpeech2() {
        return umsarsiiSpeech2;
    }

    public void setUmsarsiiSpeech2(Integer umsarsiiSpeech2) {
        this.umsarsiiSpeech2 = umsarsiiSpeech2;
    }

    @Basic
    @Column(name = "UMSARSII_OcuMotDys_3")
    public Integer getUmsarsiiOcuMotDys3() {
        return umsarsiiOcuMotDys3;
    }

    public void setUmsarsiiOcuMotDys3(Integer umsarsiiOcuMotDys3) {
        this.umsarsiiOcuMotDys3 = umsarsiiOcuMotDys3;
    }

    @Basic
    @Column(name = "UMSARSII_TremRest_4")
    public Integer getUmsarsiiTremRest4() {
        return umsarsiiTremRest4;
    }

    public void setUmsarsiiTremRest4(Integer umsarsiiTremRest4) {
        this.umsarsiiTremRest4 = umsarsiiTremRest4;
    }

    @Basic
    @Column(name = "UMSARSII_ActTrem_5")
    public Integer getUmsarsiiActTrem5() {
        return umsarsiiActTrem5;
    }

    public void setUmsarsiiActTrem5(Integer umsarsiiActTrem5) {
        this.umsarsiiActTrem5 = umsarsiiActTrem5;
    }

    @Basic
    @Column(name = "UMSARSII_IncTone_6")
    public Integer getUmsarsiiIncTone6() {
        return umsarsiiIncTone6;
    }

    public void setUmsarsiiIncTone6(Integer umsarsiiIncTone6) {
        this.umsarsiiIncTone6 = umsarsiiIncTone6;
    }

    @Basic
    @Column(name = "UMSARSRapidAlterMov_Hands_7")
    public Integer getUmsarsRapidAlterMovHands7() {
        return umsarsRapidAlterMovHands7;
    }

    public void setUmsarsRapidAlterMovHands7(Integer umsarsRapidAlterMovHands7) {
        this.umsarsRapidAlterMovHands7 = umsarsRapidAlterMovHands7;
    }

    @Basic
    @Column(name = "UMSARSFingertaps_8")
    public Integer getUmsarsFingertaps8() {
        return umsarsFingertaps8;
    }

    public void setUmsarsFingertaps8(Integer umsarsFingertaps8) {
        this.umsarsFingertaps8 = umsarsFingertaps8;
    }

    @Basic
    @Column(name = "UMSARSLegAgility_9")
    public Integer getUmsarsLegAgility9() {
        return umsarsLegAgility9;
    }

    public void setUmsarsLegAgility9(Integer umsarsLegAgility9) {
        this.umsarsLegAgility9 = umsarsLegAgility9;
    }

    @Basic
    @Column(name = "UMSARSHeelknee_10")
    public Integer getUmsarsHeelknee10() {
        return umsarsHeelknee10;
    }

    public void setUmsarsHeelknee10(Integer umsarsHeelknee10) {
        this.umsarsHeelknee10 = umsarsHeelknee10;
    }

    @Basic
    @Column(name = "UMSARSArisingChair_11")
    public Integer getUmsarsArisingChair11() {
        return umsarsArisingChair11;
    }

    public void setUmsarsArisingChair11(Integer umsarsArisingChair11) {
        this.umsarsArisingChair11 = umsarsArisingChair11;
    }

    @Basic
    @Column(name = "UMSARSPosture_12")
    public Integer getUmsarsPosture12() {
        return umsarsPosture12;
    }

    public void setUmsarsPosture12(Integer umsarsPosture12) {
        this.umsarsPosture12 = umsarsPosture12;
    }

    @Basic
    @Column(name = "UMSARSBodysway_13")
    public Integer getUmsarsBodysway13() {
        return umsarsBodysway13;
    }

    public void setUmsarsBodysway13(Integer umsarsBodysway13) {
        this.umsarsBodysway13 = umsarsBodysway13;
    }

    @Basic
    @Column(name = "UMSARSGait_14")
    public Integer getUmsarsGait14() {
        return umsarsGait14;
    }

    public void setUmsarsGait14(Integer umsarsGait14) {
        this.umsarsGait14 = umsarsGait14;
    }

    @Basic
    @Column(name = "AttentionFactACE_III")
    public Integer getAttentionFactAceIii() {
        return attentionFactAceIii;
    }

    public void setAttentionFactAceIii(Integer attentionFactAceIii) {
        this.attentionFactAceIii = attentionFactAceIii;
    }

    @Basic
    @Column(name = "MemFactACE_III")
    public Integer getMemFactAceIii() {
        return memFactAceIii;
    }

    public void setMemFactAceIii(Integer memFactAceIii) {
        this.memFactAceIii = memFactAceIii;
    }

    @Basic
    @Column(name = "FluencyFactACE_III")
    public Integer getFluencyFactAceIii() {
        return fluencyFactAceIii;
    }

    public void setFluencyFactAceIii(Integer fluencyFactAceIii) {
        this.fluencyFactAceIii = fluencyFactAceIii;
    }

    @Basic
    @Column(name = "LangFactACE_III")
    public Integer getLangFactAceIii() {
        return langFactAceIii;
    }

    public void setLangFactAceIii(Integer langFactAceIii) {
        this.langFactAceIii = langFactAceIii;
    }

    @Basic
    @Column(name = "VisualFactACE_III")
    public Integer getVisualFactAceIii() {
        return visualFactAceIii;
    }

    public void setVisualFactAceIii(Integer visualFactAceIii) {
        this.visualFactAceIii = visualFactAceIii;
    }

    @Basic
    @Column(name = "TotalACE_III")
    public Integer getTotalAceIii() {
        return totalAceIii;
    }

    public void setTotalAceIii(Integer totalAceIii) {
        this.totalAceIii = totalAceIii;
    }

    @Basic
    @Column(name = "TotalMini_ACE_III")
    public Integer getTotalMiniAceIii() {
        return totalMiniAceIii;
    }

    public void setTotalMiniAceIii(Integer totalMiniAceIii) {
        this.totalMiniAceIii = totalMiniAceIii;
    }

    @Basic
    @Column(name = "MMSE")
    public Integer getMmse() {
        return mmse;
    }

    public void setMmse(Integer mmse) {
        this.mmse = mmse;
    }

    @Basic
    @Column(name = "FAB12")
    public Integer getFab12() {
        return fab12;
    }

    public void setFab12(Integer fab12) {
        this.fab12 = fab12;
    }

    @Basic
    @Column(name = "BDI13_14")
    public Integer getBdi1314() {
        return bdi1314;
    }

    public void setBdi1314(Integer bdi1314) {
        this.bdi1314 = bdi1314;
    }

    @Basic
    @Column(name = "GDS9_10")
    public Integer getGds910() {
        return gds910;
    }

    public void setGds910(Integer gds910) {
        this.gds910 = gds910;
    }

    @Basic
    @Column(name = "WAIS_RPicture")
    public Integer getWaisRPicture() {
        return waisRPicture;
    }

    public void setWaisRPicture(Integer waisRPicture) {
        this.waisRPicture = waisRPicture;
    }

    @Basic
    @Column(name = "WAIS_RPictureCent")
    public Integer getWaisRPictureCent() {
        return waisRPictureCent;
    }

    public void setWaisRPictureCent(Integer waisRPictureCent) {
        this.waisRPictureCent = waisRPictureCent;
    }

    @Basic
    @Column(name = "CVLT_1_5")
    public Integer getCvlt15() {
        return cvlt15;
    }

    public void setCvlt15(Integer cvlt15) {
        this.cvlt15 = cvlt15;
    }

    @Basic
    @Column(name = "CVLT_1_5Sten")
    public Integer getCvlt15Sten() {
        return cvlt15Sten;
    }

    public void setCvlt15Sten(Integer cvlt15Sten) {
        this.cvlt15Sten = cvlt15Sten;
    }

    @Basic
    @Column(name = "CVLT_A_1")
    public Integer getCvltA1() {
        return cvltA1;
    }

    public void setCvltA1(Integer cvltA1) {
        this.cvltA1 = cvltA1;
    }

    @Basic
    @Column(name = "CVLT_A_1Sten")
    public Integer getCvltA1Sten() {
        return cvltA1Sten;
    }

    public void setCvltA1Sten(Integer cvltA1Sten) {
        this.cvltA1Sten = cvltA1Sten;
    }

    @Basic
    @Column(name = "CVLT_A_5")
    public Integer getCvltA5() {
        return cvltA5;
    }

    public void setCvltA5(Integer cvltA5) {
        this.cvltA5 = cvltA5;
    }

    @Basic
    @Column(name = "CVLT_A_5Sten")
    public Integer getCvltA5Sten() {
        return cvltA5Sten;
    }

    public void setCvltA5Sten(Integer cvltA5Sten) {
        this.cvltA5Sten = cvltA5Sten;
    }

    @Basic
    @Column(name = "CVLT_B")
    public Integer getCvltB() {
        return cvltB;
    }

    public void setCvltB(Integer cvltB) {
        this.cvltB = cvltB;
    }

    @Basic
    @Column(name = "CVLT_BSten")
    public Integer getCvltBSten() {
        return cvltBSten;
    }

    public void setCvltBSten(Integer cvltBSten) {
        this.cvltBSten = cvltBSten;
    }

    @Basic
    @Column(name = "CVLTSTM_Free")
    public Integer getCvltstmFree() {
        return cvltstmFree;
    }

    public void setCvltstmFree(Integer cvltstmFree) {
        this.cvltstmFree = cvltstmFree;
    }

    @Basic
    @Column(name = "CVLTSTM_FreeSten")
    public Integer getCvltstmFreeSten() {
        return cvltstmFreeSten;
    }

    public void setCvltstmFreeSten(Integer cvltstmFreeSten) {
        this.cvltstmFreeSten = cvltstmFreeSten;
    }

    @Basic
    @Column(name = "CVLTSTM_Cued")
    public Integer getCvltstmCued() {
        return cvltstmCued;
    }

    public void setCvltstmCued(Integer cvltstmCued) {
        this.cvltstmCued = cvltstmCued;
    }

    @Basic
    @Column(name = "CVLTSTM_CuedSten")
    public Integer getCvltstmCuedSten() {
        return cvltstmCuedSten;
    }

    public void setCvltstmCuedSten(Integer cvltstmCuedSten) {
        this.cvltstmCuedSten = cvltstmCuedSten;
    }

    @Basic
    @Column(name = "CVLTLTM_Free")
    public Integer getCvltltmFree() {
        return cvltltmFree;
    }

    public void setCvltltmFree(Integer cvltltmFree) {
        this.cvltltmFree = cvltltmFree;
    }

    @Basic
    @Column(name = "CVLTLTM_FreeSten")
    public Integer getCvltltmFreeSten() {
        return cvltltmFreeSten;
    }

    public void setCvltltmFreeSten(Integer cvltltmFreeSten) {
        this.cvltltmFreeSten = cvltltmFreeSten;
    }

    @Basic
    @Column(name = "CVLTLTM_Cued")
    public Integer getCvltltmCued() {
        return cvltltmCued;
    }

    public void setCvltltmCued(Integer cvltltmCued) {
        this.cvltltmCued = cvltltmCued;
    }

    @Basic
    @Column(name = "CVLTLTM_CuedSten")
    public Integer getCvltltmCuedSten() {
        return cvltltmCuedSten;
    }

    public void setCvltltmCuedSten(Integer cvltltmCuedSten) {
        this.cvltltmCuedSten = cvltltmCuedSten;
    }

    @Basic
    @Column(name = "CVLTSemCluster")
    public Integer getCvltSemCluster() {
        return cvltSemCluster;
    }

    public void setCvltSemCluster(Integer cvltSemCluster) {
        this.cvltSemCluster = cvltSemCluster;
    }

    @Basic
    @Column(name = "CVLTSemClustSten")
    public Integer getCvltSemClustSten() {
        return cvltSemClustSten;
    }

    public void setCvltSemClustSten(Integer cvltSemClustSten) {
        this.cvltSemClustSten = cvltSemClustSten;
    }

    @Basic
    @Column(name = "CVLTserialClust")
    public Integer getCvlTserialClust() {
        return cvlTserialClust;
    }

    public void setCvlTserialClust(Integer cvlTserialClust) {
        this.cvlTserialClust = cvlTserialClust;
    }

    @Basic
    @Column(name = "CVLTserialClustSten")
    public Integer getCvlTserialClustSten() {
        return cvlTserialClustSten;
    }

    public void setCvlTserialClustSten(Integer cvlTserialClustSten) {
        this.cvlTserialClustSten = cvlTserialClustSten;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectI")
    public Integer getCvltPercentCorrectI() {
        return cvltPercentCorrectI;
    }

    public void setCvltPercentCorrectI(Integer cvltPercentCorrectI) {
        this.cvltPercentCorrectI = cvltPercentCorrectI;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectISten")
    public Integer getCvltPercentCorrectISten() {
        return cvltPercentCorrectISten;
    }

    public void setCvltPercentCorrectISten(Integer cvltPercentCorrectISten) {
        this.cvltPercentCorrectISten = cvltPercentCorrectISten;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectII")
    public Integer getCvltPercentCorrectIi() {
        return cvltPercentCorrectIi;
    }

    public void setCvltPercentCorrectIi(Integer cvltPercentCorrectIi) {
        this.cvltPercentCorrectIi = cvltPercentCorrectIi;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectIISten")
    public Integer getCvltPercentCorrectIiSten() {
        return cvltPercentCorrectIiSten;
    }

    public void setCvltPercentCorrectIiSten(Integer cvltPercentCorrectIiSten) {
        this.cvltPercentCorrectIiSten = cvltPercentCorrectIiSten;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectIII")
    public Integer getCvltPercentCorrectIii() {
        return cvltPercentCorrectIii;
    }

    public void setCvltPercentCorrectIii(Integer cvltPercentCorrectIii) {
        this.cvltPercentCorrectIii = cvltPercentCorrectIii;
    }

    @Basic
    @Column(name = "CVLTPercentCorrectIIISten")
    public Integer getCvltPercentCorrectIiiSten() {
        return cvltPercentCorrectIiiSten;
    }

    public void setCvltPercentCorrectIiiSten(Integer cvltPercentCorrectIiiSten) {
        this.cvltPercentCorrectIiiSten = cvltPercentCorrectIiiSten;
    }

    @Basic
    @Column(name = "CVLTagreeFactor")
    public Integer getCvlTagreeFactor() {
        return cvlTagreeFactor;
    }

    public void setCvlTagreeFactor(Integer cvlTagreeFactor) {
        this.cvlTagreeFactor = cvlTagreeFactor;
    }

    @Basic
    @Column(name = "CVLTagreeFactorSten")
    public Integer getCvlTagreeFactorSten() {
        return cvlTagreeFactorSten;
    }

    public void setCvlTagreeFactorSten(Integer cvlTagreeFactorSten) {
        this.cvlTagreeFactorSten = cvlTagreeFactorSten;
    }

    @Basic
    @Column(name = "CVLTPERS")
    public Integer getCvltpers() {
        return cvltpers;
    }

    public void setCvltpers(Integer cvltpers) {
        this.cvltpers = cvltpers;
    }

    @Basic
    @Column(name = "PERSSten")
    public Integer getPersSten() {
        return persSten;
    }

    public void setPersSten(Integer persSten) {
        this.persSten = persSten;
    }

    @Basic
    @Column(name = "CVLTintrusFree")
    public Integer getCvlTintrusFree() {
        return cvlTintrusFree;
    }

    public void setCvlTintrusFree(Integer cvlTintrusFree) {
        this.cvlTintrusFree = cvlTintrusFree;
    }

    @Basic
    @Column(name = "CVLTintrusFreeSten")
    public Integer getCvlTintrusFreeSten() {
        return cvlTintrusFreeSten;
    }

    public void setCvlTintrusFreeSten(Integer cvlTintrusFreeSten) {
        this.cvlTintrusFreeSten = cvlTintrusFreeSten;
    }

    @Basic
    @Column(name = "CVLTintrusCues")
    public Integer getCvlTintrusCues() {
        return cvlTintrusCues;
    }

    public void setCvlTintrusCues(Integer cvlTintrusCues) {
        this.cvlTintrusCues = cvlTintrusCues;
    }

    @Basic
    @Column(name = "CVLTintrusCuesSten")
    public Integer getCvlTintrusCuesSten() {
        return cvlTintrusCuesSten;
    }

    public void setCvlTintrusCuesSten(Integer cvlTintrusCuesSten) {
        this.cvlTintrusCuesSten = cvlTintrusCuesSten;
    }

    @Basic
    @Column(name = "CVLT_RecogTotal")
    public Integer getCvltRecogTotal() {
        return cvltRecogTotal;
    }

    public void setCvltRecogTotal(Integer cvltRecogTotal) {
        this.cvltRecogTotal = cvltRecogTotal;
    }

    @Basic
    @Column(name = "CVLT_RecogTotalSten")
    public Integer getCvltRecogTotalSten() {
        return cvltRecogTotalSten;
    }

    public void setCvltRecogTotalSten(Integer cvltRecogTotalSten) {
        this.cvltRecogTotalSten = cvltRecogTotalSten;
    }

    @Basic
    @Column(name = "CVLT_Differentiation")
    public Integer getCvltDifferentiation() {
        return cvltDifferentiation;
    }

    public void setCvltDifferentiation(Integer cvltDifferentiation) {
        this.cvltDifferentiation = cvltDifferentiation;
    }

    @Basic
    @Column(name = "CVLT_DifferentiationSten")
    public Integer getCvltDifferentiationSten() {
        return cvltDifferentiationSten;
    }

    public void setCvltDifferentiationSten(Integer cvltDifferentiationSten) {
        this.cvltDifferentiationSten = cvltDifferentiationSten;
    }

    @Basic
    @Column(name = "CVLT_ErrorRecog")
    public Integer getCvltErrorRecog() {
        return cvltErrorRecog;
    }

    public void setCvltErrorRecog(Integer cvltErrorRecog) {
        this.cvltErrorRecog = cvltErrorRecog;
    }

    @Basic
    @Column(name = "CVLT_ErrorRecogSten")
    public Integer getCvltErrorRecogSten() {
        return cvltErrorRecogSten;
    }

    public void setCvltErrorRecogSten(Integer cvltErrorRecogSten) {
        this.cvltErrorRecogSten = cvltErrorRecogSten;
    }

    @Basic
    @Column(name = "TMT_A")
    public Integer getTmtA() {
        return tmtA;
    }

    public void setTmtA(Integer tmtA) {
        this.tmtA = tmtA;
    }

    @Basic
    @Column(name = "TMT_Acent")
    public Integer getTmtAcent() {
        return tmtAcent;
    }

    public void setTmtAcent(Integer tmtAcent) {
        this.tmtAcent = tmtAcent;
    }

    @Basic
    @Column(name = "TMT_A_errors")
    public Integer getTmtAErrors() {
        return tmtAErrors;
    }

    public void setTmtAErrors(Integer tmtAErrors) {
        this.tmtAErrors = tmtAErrors;
    }

    @Basic
    @Column(name = "TMT_B")
    public Integer getTmtB() {
        return tmtB;
    }

    public void setTmtB(Integer tmtB) {
        this.tmtB = tmtB;
    }

    @Basic
    @Column(name = "TMT_Bcent")
    public Integer getTmtBcent() {
        return tmtBcent;
    }

    public void setTmtBcent(Integer tmtBcent) {
        this.tmtBcent = tmtBcent;
    }

    @Basic
    @Column(name = "TMT_B_errors")
    public Integer getTmtBErrors() {
        return tmtBErrors;
    }

    public void setTmtBErrors(Integer tmtBErrors) {
        this.tmtBErrors = tmtBErrors;
    }

    @Basic
    @Column(name = "Rythymtest_ABC")
    public Integer getRythymtestAbc() {
        return rythymtestAbc;
    }

    public void setRythymtestAbc(Integer rythymtestAbc) {
        this.rythymtestAbc = rythymtestAbc;
    }

    @Basic
    @Column(name = "Rythymtest_ABCranga")
    public Integer getRythymtestAbCranga() {
        return rythymtestAbCranga;
    }

    public void setRythymtestAbCranga(Integer rythymtestAbCranga) {
        this.rythymtestAbCranga = rythymtestAbCranga;
    }

    @Basic
    @Column(name = "TOL_TotalCorrect")
    public Integer getTolTotalCorrect() {
        return tolTotalCorrect;
    }

    public void setTolTotalCorrect(Integer tolTotalCorrect) {
        this.tolTotalCorrect = tolTotalCorrect;
    }

    @Basic
    @Column(name = "TOL_TotalCorrectCent")
    public Integer getTolTotalCorrectCent() {
        return tolTotalCorrectCent;
    }

    public void setTolTotalCorrectCent(Integer tolTotalCorrectCent) {
        this.tolTotalCorrectCent = tolTotalCorrectCent;
    }

    @Basic
    @Column(name = "TOL_TotalMoveScore")
    public Integer getTolTotalMoveScore() {
        return tolTotalMoveScore;
    }

    public void setTolTotalMoveScore(Integer tolTotalMoveScore) {
        this.tolTotalMoveScore = tolTotalMoveScore;
    }

    @Basic
    @Column(name = "TOL_TotalMoveScoreCent")
    public Integer getTolTotalMoveScoreCent() {
        return tolTotalMoveScoreCent;
    }

    public void setTolTotalMoveScoreCent(Integer tolTotalMoveScoreCent) {
        this.tolTotalMoveScoreCent = tolTotalMoveScoreCent;
    }

    @Basic
    @Column(name = "TOL_TotalInitTime")
    public Integer getTolTotalInitTime() {
        return tolTotalInitTime;
    }

    public void setTolTotalInitTime(Integer tolTotalInitTime) {
        this.tolTotalInitTime = tolTotalInitTime;
    }

    @Basic
    @Column(name = "TOL_TotalInitTimeCent")
    public Integer getTolTotalInitTimeCent() {
        return tolTotalInitTimeCent;
    }

    public void setTolTotalInitTimeCent(Integer tolTotalInitTimeCent) {
        this.tolTotalInitTimeCent = tolTotalInitTimeCent;
    }

    @Basic
    @Column(name = "TOL_TotalExecutTime")
    public Integer getTolTotalExecutTime() {
        return tolTotalExecutTime;
    }

    public void setTolTotalExecutTime(Integer tolTotalExecutTime) {
        this.tolTotalExecutTime = tolTotalExecutTime;
    }

    @Basic
    @Column(name = "TOL_TotalExecutTimeCent")
    public Integer getTolTotalExecutTimeCent() {
        return tolTotalExecutTimeCent;
    }

    public void setTolTotalExecutTimeCent(Integer tolTotalExecutTimeCent) {
        this.tolTotalExecutTimeCent = tolTotalExecutTimeCent;
    }

    @Basic
    @Column(name = "TOL_TotalTime")
    public Integer getTolTotalTime() {
        return tolTotalTime;
    }

    public void setTolTotalTime(Integer tolTotalTime) {
        this.tolTotalTime = tolTotalTime;
    }

    @Basic
    @Column(name = "TOL_TotalTimeCent")
    public Integer getTolTotalTimeCent() {
        return tolTotalTimeCent;
    }

    public void setTolTotalTimeCent(Integer tolTotalTimeCent) {
        this.tolTotalTimeCent = tolTotalTimeCent;
    }

    @Basic
    @Column(name = "FluencyKraw")
    public Integer getFluencyKraw() {
        return fluencyKraw;
    }

    public void setFluencyKraw(Integer fluencyKraw) {
        this.fluencyKraw = fluencyKraw;
    }

    @Basic
    @Column(name = "FluencyAnimalsRaw")
    public Integer getFluencyAnimalsRaw() {
        return fluencyAnimalsRaw;
    }

    public void setFluencyAnimalsRaw(Integer fluencyAnimalsRaw) {
        this.fluencyAnimalsRaw = fluencyAnimalsRaw;
    }

    @Basic
    @Column(name = "FluencySharpsRaw")
    public Integer getFluencySharpsRaw() {
        return fluencySharpsRaw;
    }

    public void setFluencySharpsRaw(Integer fluencySharpsRaw) {
        this.fluencySharpsRaw = fluencySharpsRaw;
    }

    @Basic
    @Column(name = "BNTTotalScore")
    public Integer getBntTotalScore() {
        return bntTotalScore;
    }

    public void setBntTotalScore(Integer bntTotalScore) {
        this.bntTotalScore = bntTotalScore;
    }

    @Basic
    @Column(name = "BNTCorrectPhonemCues")
    public Integer getBntCorrectPhonemCues() {
        return bntCorrectPhonemCues;
    }

    public void setBntCorrectPhonemCues(Integer bntCorrectPhonemCues) {
        this.bntCorrectPhonemCues = bntCorrectPhonemCues;
    }

    @Basic
    @Column(name = "BNTCorrectSemantCues")
    public Integer getBntCorrectSemantCues() {
        return bntCorrectSemantCues;
    }

    public void setBntCorrectSemantCues(Integer bntCorrectSemantCues) {
        this.bntCorrectSemantCues = bntCorrectSemantCues;
    }

    @Basic
    @Column(name = "BNTCorrectContextCues")
    public Integer getBntCorrectContextCues() {
        return bntCorrectContextCues;
    }

    public void setBntCorrectContextCues(Integer bntCorrectContextCues) {
        this.bntCorrectContextCues = bntCorrectContextCues;
    }

    @Basic
    @Column(name = "BNTMeanTime")
    public Integer getBntMeanTime() {
        return bntMeanTime;
    }

    public void setBntMeanTime(Integer bntMeanTime) {
        this.bntMeanTime = bntMeanTime;
    }

    @Basic
    @Column(name = "CLOX1Draw")
    public Integer getClox1Draw() {
        return clox1Draw;
    }

    public void setClox1Draw(Integer clox1Draw) {
        this.clox1Draw = clox1Draw;
    }

    @Basic
    @Column(name = "CLOX2Copy")
    public Integer getClox2Copy() {
        return clox2Copy;
    }

    public void setClox2Copy(Integer clox2Copy) {
        this.clox2Copy = clox2Copy;
    }

    @Basic
    @Column(name = "RBMTShortDelay")
    public Double getRbmtShortDelay() {
        return rbmtShortDelay;
    }

    public void setRbmtShortDelay(Double rbmtShortDelay) {
        this.rbmtShortDelay = rbmtShortDelay;
    }

    @Basic
    @Column(name = "RBMTShortDelayCent")
    public Double getRbmtShortDelayCent() {
        return rbmtShortDelayCent;
    }

    public void setRbmtShortDelayCent(Double rbmtShortDelayCent) {
        this.rbmtShortDelayCent = rbmtShortDelayCent;
    }

    @Basic
    @Column(name = "RBMTLongDelay")
    public Double getRbmtLongDelay() {
        return rbmtLongDelay;
    }

    public void setRbmtLongDelay(Double rbmtLongDelay) {
        this.rbmtLongDelay = rbmtLongDelay;
    }

    @Basic
    @Column(name = "RBMTLongDelayCent")
    public Double getRbmtLongDelayCent() {
        return rbmtLongDelayCent;
    }

    public void setRbmtLongDelayCent(Double rbmtLongDelayCent) {
        this.rbmtLongDelayCent = rbmtLongDelayCent;
    }

    @Basic
    @Column(name = "GONOGOProcentInCorrGO")
    public Double getGonogoProcentInCorrGo() {
        return gonogoProcentInCorrGo;
    }

    public void setGonogoProcentInCorrGo(Double gonogoProcentInCorrGo) {
        this.gonogoProcentInCorrGo = gonogoProcentInCorrGo;
    }

    @Basic
    @Column(name = "GONOGOProcentInCorrNOGO")
    public Double getGonogoProcentInCorrNogo() {
        return gonogoProcentInCorrNogo;
    }

    public void setGonogoProcentInCorrNogo(Double gonogoProcentInCorrNogo) {
        this.gonogoProcentInCorrNogo = gonogoProcentInCorrNogo;
    }

    @Basic
    @Column(name = "GONOGONrInCorrGO")
    public Double getGonogoNrInCorrGo() {
        return gonogoNrInCorrGo;
    }

    public void setGonogoNrInCorrGo(Double gonogoNrInCorrGo) {
        this.gonogoNrInCorrGo = gonogoNrInCorrGo;
    }

    @Basic
    @Column(name = "GONOGONrInCorrNOGO")
    public Double getGonogoNrInCorrNogo() {
        return gonogoNrInCorrNogo;
    }

    public void setGonogoNrInCorrNogo(Double gonogoNrInCorrNogo) {
        this.gonogoNrInCorrNogo = gonogoNrInCorrNogo;
    }

    @Basic
    @Column(name = "GONOGONrCorrectGO")
    public Double getGonogoNrCorrectGo() {
        return gonogoNrCorrectGo;
    }

    public void setGonogoNrCorrectGo(Double gonogoNrCorrectGo) {
        this.gonogoNrCorrectGo = gonogoNrCorrectGo;
    }

    @Basic
    @Column(name = "GONOGONrCorrectNOGO")
    public Double getGonogoNrCorrectNogo() {
        return gonogoNrCorrectNogo;
    }

    public void setGonogoNrCorrectNogo(Double gonogoNrCorrectNogo) {
        this.gonogoNrCorrectNogo = gonogoNrCorrectNogo;
    }

    @Basic
    @Column(name = "MeanResponseTimeCorrrectGO")
    public Double getMeanResponseTimeCorrrectGo() {
        return meanResponseTimeCorrrectGo;
    }

    public void setMeanResponseTimeCorrrectGo(Double meanResponseTimeCorrrectGo) {
        this.meanResponseTimeCorrrectGo = meanResponseTimeCorrrectGo;
    }

    @Basic
    @Column(name = "ElevatorCountTotal")
    public Double getElevatorCountTotal() {
        return elevatorCountTotal;
    }

    public void setElevatorCountTotal(Double elevatorCountTotal) {
        this.elevatorCountTotal = elevatorCountTotal;
    }

    @Basic
    @Column(name = "ElevatorCountTotalCent")
    public Double getElevatorCountTotalCent() {
        return elevatorCountTotalCent;
    }

    public void setElevatorCountTotalCent(Double elevatorCountTotalCent) {
        this.elevatorCountTotalCent = elevatorCountTotalCent;
    }

    @Basic
    @Column(name = "ElevatorDistractTotal")
    public Double getElevatorDistractTotal() {
        return elevatorDistractTotal;
    }

    public void setElevatorDistractTotal(Double elevatorDistractTotal) {
        this.elevatorDistractTotal = elevatorDistractTotal;
    }

    @Basic
    @Column(name = "ElevatorDistractTotalCent")
    public Double getElevatorDistractTotalCent() {
        return elevatorDistractTotalCent;
    }

    public void setElevatorDistractTotalCent(Double elevatorDistractTotalCent) {
        this.elevatorDistractTotalCent = elevatorDistractTotalCent;
    }

    @Basic
    @Column(name = "WCSTLPP")
    public Double getWcstlpp() {
        return wcstlpp;
    }

    public void setWcstlpp(Double wcstlpp) {
        this.wcstlpp = wcstlpp;
    }

    @Basic
    @Column(name = "WCSTLPO")
    public Double getWcstlpo() {
        return wcstlpo;
    }

    public void setWcstlpo(Double wcstlpo) {
        this.wcstlpo = wcstlpo;
    }

    @Basic
    @Column(name = "WCSTLBO")
    public Double getWcstlbo() {
        return wcstlbo;
    }

    public void setWcstlbo(Double wcstlbo) {
        this.wcstlbo = wcstlbo;
    }

    @Basic
    @Column(name = "WCST_LBOcent")
    public Double getWcstLbOcent() {
        return wcstLbOcent;
    }

    public void setWcstLbOcent(Double wcstLbOcent) {
        this.wcstLbOcent = wcstLbOcent;
    }

    @Basic
    @Column(name = "WCSTPB")
    public Double getWcstpb() {
        return wcstpb;
    }

    public void setWcstpb(Double wcstpb) {
        this.wcstpb = wcstpb;
    }

    @Basic
    @Column(name = "WCSTOP")
    public Double getWcstop() {
        return wcstop;
    }

    public void setWcstop(Double wcstop) {
        this.wcstop = wcstop;
    }

    @Basic
    @Column(name = "WCSTOPcent")
    public Double getWcstoPcent() {
        return wcstoPcent;
    }

    public void setWcstoPcent(Double wcstoPcent) {
        this.wcstoPcent = wcstoPcent;
    }

    @Basic
    @Column(name = "WCSTPOP")
    public Double getWcstpop() {
        return wcstpop;
    }

    public void setWcstpop(Double wcstpop) {
        this.wcstpop = wcstpop;
    }

    @Basic
    @Column(name = "WCSTBP")
    public Double getWcstbp() {
        return wcstbp;
    }

    public void setWcstbp(Double wcstbp) {
        this.wcstbp = wcstbp;
    }

    @Basic
    @Column(name = "WCSTBPcent")
    public Double getWcstbPcent() {
        return wcstbPcent;
    }

    public void setWcstbPcent(Double wcstbPcent) {
        this.wcstbPcent = wcstbPcent;
    }

    @Basic
    @Column(name = "WCSTPBP")
    public Double getWcstpbp() {
        return wcstpbp;
    }

    public void setWcstpbp(Double wcstpbp) {
        this.wcstpbp = wcstpbp;
    }

    @Basic
    @Column(name = "WCSTPBPcent")
    public Double getWcstpbPcent() {
        return wcstpbPcent;
    }

    public void setWcstpbPcent(Double wcstpbPcent) {
        this.wcstpbPcent = wcstpbPcent;
    }

    @Basic
    @Column(name = "WCSTBN")
    public Double getWcstbn() {
        return wcstbn;
    }

    public void setWcstbn(Double wcstbn) {
        this.wcstbn = wcstbn;
    }

    @Basic
    @Column(name = "WCSTBNcent")
    public Double getWcstbNcent() {
        return wcstbNcent;
    }

    public void setWcstbNcent(Double wcstbNcent) {
        this.wcstbNcent = wcstbNcent;
    }

    @Basic
    @Column(name = "WCSTPBN")
    public Double getWcstpbn() {
        return wcstpbn;
    }

    public void setWcstpbn(Double wcstpbn) {
        this.wcstpbn = wcstpbn;
    }

    @Basic
    @Column(name = "WCSTODP")
    public Double getWcstodp() {
        return wcstodp;
    }

    public void setWcstodp(Double wcstodp) {
        this.wcstodp = wcstodp;
    }

    @Basic
    @Column(name = "WCSTPODP")
    public Double getWcstpodp() {
        return wcstpodp;
    }

    public void setWcstpodp(Double wcstpodp) {
        this.wcstpodp = wcstpodp;
    }

    @Basic
    @Column(name = "WCSTPODPcent")
    public Double getWcstpodPcent() {
        return wcstpodPcent;
    }

    public void setWcstpodPcent(Double wcstpodPcent) {
        this.wcstpodPcent = wcstpodPcent;
    }

    @Basic
    @Column(name = "WCSTLZK")
    public Double getWcstlzk() {
        return wcstlzk;
    }

    public void setWcstlzk(Double wcstlzk) {
        this.wcstlzk = wcstlzk;
    }

    @Basic
    @Column(name = "WCSTPPMZ")
    public Double getWcstppmz() {
        return wcstppmz;
    }

    public void setWcstppmz(Double wcstppmz) {
        this.wcstppmz = wcstppmz;
    }

    @Basic
    @Column(name = "WCSTPUN")
    public Double getWcstpun() {
        return wcstpun;
    }

    public void setWcstpun(Double wcstpun) {
        this.wcstpun = wcstpun;
    }

    @Basic
    @Column(name = "WCSTUU")
    public Double getWcstuu() {
        return wcstuu;
    }

    public void setWcstuu(Double wcstuu) {
        this.wcstuu = wcstuu;
    }

    @Basic
    @Column(name = "Similar_WAISTotal")
    public Double getSimilarWaisTotal() {
        return similarWaisTotal;
    }

    public void setSimilarWaisTotal(Double similarWaisTotal) {
        this.similarWaisTotal = similarWaisTotal;
    }

    @Basic
    @Column(name = "Similar_WAISCent")
    public Double getSimilarWaisCent() {
        return similarWaisCent;
    }

    public void setSimilarWaisCent(Double similarWaisCent) {
        this.similarWaisCent = similarWaisCent;
    }

    @Basic
    @Column(name = "WAIS_Info")
    public Double getWaisInfo() {
        return waisInfo;
    }

    public void setWaisInfo(Double waisInfo) {
        this.waisInfo = waisInfo;
    }

    @Basic
    @Column(name = "WAIS_Info_Cent")
    public Double getWaisInfoCent() {
        return waisInfoCent;
    }

    public void setWaisInfoCent(Double waisInfoCent) {
        this.waisInfoCent = waisInfoCent;
    }

    @Basic
    @Column(name = "WAIS_DigitSpan")
    public Double getWaisDigitSpan() {
        return waisDigitSpan;
    }

    public void setWaisDigitSpan(Double waisDigitSpan) {
        this.waisDigitSpan = waisDigitSpan;
    }

    @Basic
    @Column(name = "WAIS_DigitSpan_Cent")
    public Double getWaisDigitSpanCent() {
        return waisDigitSpanCent;
    }

    public void setWaisDigitSpanCent(Double waisDigitSpanCent) {
        this.waisDigitSpanCent = waisDigitSpanCent;
    }

    @Basic
    @Column(name = "MirrorTotalTime")
    public Double getMirrorTotalTime() {
        return mirrorTotalTime;
    }

    public void setMirrorTotalTime(Double mirrorTotalTime) {
        this.mirrorTotalTime = mirrorTotalTime;
    }

    @Basic
    @Column(name = "MirrorMeanTime")
    public Double getMirrorMeanTime() {
        return mirrorMeanTime;
    }

    public void setMirrorMeanTime(Double mirrorMeanTime) {
        this.mirrorMeanTime = mirrorMeanTime;
    }

    @Basic
    @Column(name = "MirrorCorrectScore")
    public Double getMirrorCorrectScore() {
        return mirrorCorrectScore;
    }

    public void setMirrorCorrectScore(Double mirrorCorrectScore) {
        this.mirrorCorrectScore = mirrorCorrectScore;
    }

    @Basic
    @Column(name = "MirrorErrors")
    public Double getMirrorErrors() {
        return mirrorErrors;
    }

    public void setMirrorErrors(Double mirrorErrors) {
        this.mirrorErrors = mirrorErrors;
    }

    @Basic
    @Column(name = "MirrorCorrectedErrors")
    public Double getMirrorCorrectedErrors() {
        return mirrorCorrectedErrors;
    }

    public void setMirrorCorrectedErrors(Double mirrorCorrectedErrors) {
        this.mirrorCorrectedErrors = mirrorCorrectedErrors;
    }

    @Basic
    @Column(name = "JLOCorrect")
    public Double getJloCorrect() {
        return jloCorrect;
    }

    public void setJloCorrect(Double jloCorrect) {
        this.jloCorrect = jloCorrect;
    }

    @Basic
    @Column(name = "JLOWP")
    public Double getJlowp() {
        return jlowp;
    }

    public void setJlowp(Double jlowp) {
        this.jlowp = jlowp;
    }

    @Basic
    @Column(name = "JLOcent")
    public Double getJlOcent() {
        return jlOcent;
    }

    public void setJlOcent(Double jlOcent) {
        this.jlOcent = jlOcent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientInfoEntity entity = (PatientInfoEntity) o;

        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;
        if (subjectCode != null ? !subjectCode.equals(entity.subjectCode) : entity.subjectCode != null) return false;
        if (idNumber != null ? !idNumber.equals(entity.idNumber) : entity.idNumber != null) return false;
        if (phone != null ? !phone.equals(entity.phone) : entity.phone != null) return false;
        if (dateTest != null ? !dateTest.equals(entity.dateTest) : entity.dateTest != null) return false;
        if (birthdate != null ? !birthdate.equals(entity.birthdate) : entity.birthdate != null) return false;
        if (age != null ? !age.equals(entity.age) : entity.age != null) return false;
        if (gr != null ? !gr.equals(entity.gr) : entity.gr != null) return false;
        if (sex != null ? !sex.equals(entity.sex) : entity.sex != null) return false;
        if (bac != null ? !bac.equals(entity.bac) : entity.bac != null) return false;
        if (edu != null ? !edu.equals(entity.edu) : entity.edu != null) return false;
        if (eduY != null ? !eduY.equals(entity.eduY) : entity.eduY != null) return false;
        if (musEdu != null ? !musEdu.equals(entity.musEdu) : entity.musEdu != null) return false;
        if (musEduY != null ? !musEduY.equals(entity.musEduY) : entity.musEduY != null) return false;
        if (hand != null ? !hand.equals(entity.hand) : entity.hand != null) return false;
        if (profession != null ? !profession.equals(entity.profession) : entity.profession != null) return false;
        if (currentWork != null ? !currentWork.equals(entity.currentWork) : entity.currentWork != null) return false;
        if (intoxicant != null ? !intoxicant.equals(entity.intoxicant) : entity.intoxicant != null) return false;
        if (eye != null ? !eye.equals(entity.eye) : entity.eye != null) return false;
        if (ear != null ? !ear.equals(entity.ear) : entity.ear != null) return false;
        if (injuryWithFainting != null ? !injuryWithFainting.equals(entity.injuryWithFainting) : entity.injuryWithFainting != null)
            return false;
        if (fainting != null ? !fainting.equals(entity.fainting) : entity.fainting != null) return false;
        if (neurologist != null ? !neurologist.equals(entity.neurologist) : entity.neurologist != null) return false;
        if (psychiatrist != null ? !psychiatrist.equals(entity.psychiatrist) : entity.psychiatrist != null)
            return false;
        if (depression != null ? !depression.equals(entity.depression) : entity.depression != null) return false;
        if (hypertension != null ? !hypertension.equals(entity.hypertension) : entity.hypertension != null)
            return false;
        if (heartAttack != null ? !heartAttack.equals(entity.heartAttack) : entity.heartAttack != null) return false;
        if (cardiacArrest != null ? !cardiacArrest.equals(entity.cardiacArrest) : entity.cardiacArrest != null)
            return false;
        if (cardiacInsuff != null ? !cardiacInsuff.equals(entity.cardiacInsuff) : entity.cardiacInsuff != null)
            return false;
        if (kidneysInsuff != null ? !kidneysInsuff.equals(entity.kidneysInsuff) : entity.kidneysInsuff != null)
            return false;
        if (liverInsuff != null ? !liverInsuff.equals(entity.liverInsuff) : entity.liverInsuff != null) return false;
        if (diabetes != null ? !diabetes.equals(entity.diabetes) : entity.diabetes != null) return false;
        if (thyroid != null ? !thyroid.equals(entity.thyroid) : entity.thyroid != null) return false;
        if (lungs != null ? !lungs.equals(entity.lungs) : entity.lungs != null) return false;
        if (neurodegeneration != null ? !neurodegeneration.equals(entity.neurodegeneration) : entity.neurodegeneration != null)
            return false;
        if (otherdisorders != null ? !otherdisorders.equals(entity.otherdisorders) : entity.otherdisorders != null)
            return false;
        if (alcoNow != null ? !alcoNow.equals(entity.alcoNow) : entity.alcoNow != null) return false;
        if (alcoPa != null ? !alcoPa.equals(entity.alcoPa) : entity.alcoPa != null) return false;
        if (drugs != null ? !drugs.equals(entity.drugs) : entity.drugs != null) return false;
        if (ageOnset != null ? !ageOnset.equals(entity.ageOnset) : entity.ageOnset != null) return false;
        if (ageDiagnosis != null ? !ageDiagnosis.equals(entity.ageDiagnosis) : entity.ageDiagnosis != null)
            return false;
        if (diseaseDurationY != null ? !diseaseDurationY.equals(entity.diseaseDurationY) : entity.diseaseDurationY != null)
            return false;
        if (memoryComplains != null ? !memoryComplains.equals(entity.memoryComplains) : entity.memoryComplains != null)
            return false;
        if (otherCognitiveComplains != null ? !otherCognitiveComplains.equals(entity.otherCognitiveComplains) : entity.otherCognitiveComplains != null)
            return false;
        if (sideSymptOnSet != null ? !sideSymptOnSet.equals(entity.sideSymptOnSet) : entity.sideSymptOnSet != null)
            return false;
        if (currentSympt != null ? !currentSympt.equals(entity.currentSympt) : entity.currentSympt != null)
            return false;
        if (tkMri != null ? !tkMri.equals(entity.tkMri) : entity.tkMri != null) return false;
        if (asymmsymptNow != null ? !asymmsymptNow.equals(entity.asymmsymptNow) : entity.asymmsymptNow != null)
            return false;
        if (motPhenot != null ? !motPhenot.equals(entity.motPhenot) : entity.motPhenot != null) return false;
        if (updrsDyskin32333435 != null ? !updrsDyskin32333435.equals(entity.updrsDyskin32333435) : entity.updrsDyskin32333435 != null)
            return false;
        if (updrsMotFluct36373839 != null ? !updrsMotFluct36373839.equals(entity.updrsMotFluct36373839) : entity.updrsMotFluct36373839 != null)
            return false;
        if (updrsFalling13 != null ? !updrsFalling13.equals(entity.updrsFalling13) : entity.updrsFalling13 != null)
            return false;
        if (hallucination2 != null ? !hallucination2.equals(entity.hallucination2) : entity.hallucination2 != null)
            return false;
        if (hallucinationOnSetY != null ? !hallucinationOnSetY.equals(entity.hallucinationOnSetY) : entity.hallucinationOnSetY != null)
            return false;
        if (medications != null ? !medications.equals(entity.medications) : entity.medications != null) return false;
        if (lDopaequiv != null ? !lDopaequiv.equals(entity.lDopaequiv) : entity.lDopaequiv != null) return false;
        if (otherTreatment != null ? !otherTreatment.equals(entity.otherTreatment) : entity.otherTreatment != null)
            return false;
        if (surg != null ? !surg.equals(entity.surg) : entity.surg != null) return false;
        if (surgDesc != null ? !surgDesc.equals(entity.surgDesc) : entity.surgDesc != null) return false;
        if (adlon != null ? !adlon.equals(entity.adlon) : entity.adlon != null) return false;
        if (adloff != null ? !adloff.equals(entity.adloff) : entity.adloff != null) return false;
        if (iadlon != null ? !iadlon.equals(entity.iadlon) : entity.iadlon != null) return false;
        if (iadloff != null ? !iadloff.equals(entity.iadloff) : entity.iadloff != null) return false;
        if (hAndYon != null ? !hAndYon.equals(entity.hAndYon) : entity.hAndYon != null) return false;
        if (hAndYoff != null ? !hAndYoff.equals(entity.hAndYoff) : entity.hAndYoff != null) return false;
        if (schAndEngOn != null ? !schAndEngOn.equals(entity.schAndEngOn) : entity.schAndEngOn != null) return false;
        if (schAndEngOff != null ? !schAndEngOff.equals(entity.schAndEngOff) : entity.schAndEngOff != null)
            return false;
        if (updrson != null ? !updrson.equals(entity.updrson) : entity.updrson != null) return false;
        if (updrsoff != null ? !updrsoff.equals(entity.updrsoff) : entity.updrsoff != null) return false;
        if (updrsion != null ? !updrsion.equals(entity.updrsion) : entity.updrsion != null) return false;
        if (updrsioff != null ? !updrsioff.equals(entity.updrsioff) : entity.updrsioff != null) return false;
        if (updrsiion != null ? !updrsiion.equals(entity.updrsiion) : entity.updrsiion != null) return false;
        if (updrsiioff != null ? !updrsiioff.equals(entity.updrsiioff) : entity.updrsiioff != null) return false;
        if (updrsiiion != null ? !updrsiiion.equals(entity.updrsiiion) : entity.updrsiiion != null) return false;
        if (updrsiiioff != null ? !updrsiiioff.equals(entity.updrsiiioff) : entity.updrsiiioff != null) return false;
        if (updrsSpeech5 != null ? !updrsSpeech5.equals(entity.updrsSpeech5) : entity.updrsSpeech5 != null)
            return false;
        if (updrsSpeech18 != null ? !updrsSpeech18.equals(entity.updrsSpeech18) : entity.updrsSpeech18 != null)
            return false;
        if (updrsFacialExpress19 != null ? !updrsFacialExpress19.equals(entity.updrsFacialExpress19) : entity.updrsFacialExpress19 != null)
            return false;
        if (updrsTremorRest20 != null ? !updrsTremorRest20.equals(entity.updrsTremorRest20) : entity.updrsTremorRest20 != null)
            return false;
        if (updrsEssentialTremor21 != null ? !updrsEssentialTremor21.equals(entity.updrsEssentialTremor21) : entity.updrsEssentialTremor21 != null)
            return false;
        if (updrsRidigity22 != null ? !updrsRidigity22.equals(entity.updrsRidigity22) : entity.updrsRidigity22 != null)
            return false;
        if (updrsDigitMov23 != null ? !updrsDigitMov23.equals(entity.updrsDigitMov23) : entity.updrsDigitMov23 != null)
            return false;
        if (updrsiiiHandMov24 != null ? !updrsiiiHandMov24.equals(entity.updrsiiiHandMov24) : entity.updrsiiiHandMov24 != null)
            return false;
        if (updrsRapidAlterHandMov25 != null ? !updrsRapidAlterHandMov25.equals(entity.updrsRapidAlterHandMov25) : entity.updrsRapidAlterHandMov25 != null)
            return false;
        if (updrsLegAgility26 != null ? !updrsLegAgility26.equals(entity.updrsLegAgility26) : entity.updrsLegAgility26 != null)
            return false;
        if (updrsArisingChair27 != null ? !updrsArisingChair27.equals(entity.updrsArisingChair27) : entity.updrsArisingChair27 != null)
            return false;
        if (updrsPosture28 != null ? !updrsPosture28.equals(entity.updrsPosture28) : entity.updrsPosture28 != null)
            return false;
        if (updrsPostureStab29 != null ? !updrsPostureStab29.equals(entity.updrsPostureStab29) : entity.updrsPostureStab29 != null)
            return false;
        if (updrsGait30 != null ? !updrsGait30.equals(entity.updrsGait30) : entity.updrsGait30 != null) return false;
        if (updrsiiiBradykinesia31 != null ? !updrsiiiBradykinesia31.equals(entity.updrsiiiBradykinesia31) : entity.updrsiiiBradykinesia31 != null)
            return false;
        if (progressionPd != null ? !progressionPd.equals(entity.progressionPd) : entity.progressionPd != null)
            return false;
        if (umsarsi != null ? !umsarsi.equals(entity.umsarsi) : entity.umsarsi != null) return false;
        if (umsarsii != null ? !umsarsii.equals(entity.umsarsii) : entity.umsarsii != null) return false;
        if (umsarsiiiOrthostatic != null ? !umsarsiiiOrthostatic.equals(entity.umsarsiiiOrthostatic) : entity.umsarsiiiOrthostatic != null)
            return false;
        if (umsarsiv != null ? !umsarsiv.equals(entity.umsarsiv) : entity.umsarsiv != null) return false;
        if (umsarsiIi != null ? !umsarsiIi.equals(entity.umsarsiIi) : entity.umsarsiIi != null) return false;
        if (umsarsiSpeech1 != null ? !umsarsiSpeech1.equals(entity.umsarsiSpeech1) : entity.umsarsiSpeech1 != null)
            return false;
        if (umsarsiWalking7 != null ? !umsarsiWalking7.equals(entity.umsarsiWalking7) : entity.umsarsiWalking7 != null)
            return false;
        if (umsarsiFalling8 != null ? !umsarsiFalling8.equals(entity.umsarsiFalling8) : entity.umsarsiFalling8 != null)
            return false;
        if (umsarsiiFacialExpression1 != null ? !umsarsiiFacialExpression1.equals(entity.umsarsiiFacialExpression1) : entity.umsarsiiFacialExpression1 != null)
            return false;
        if (umsarsiiSpeech2 != null ? !umsarsiiSpeech2.equals(entity.umsarsiiSpeech2) : entity.umsarsiiSpeech2 != null)
            return false;
        if (umsarsiiOcuMotDys3 != null ? !umsarsiiOcuMotDys3.equals(entity.umsarsiiOcuMotDys3) : entity.umsarsiiOcuMotDys3 != null)
            return false;
        if (umsarsiiTremRest4 != null ? !umsarsiiTremRest4.equals(entity.umsarsiiTremRest4) : entity.umsarsiiTremRest4 != null)
            return false;
        if (umsarsiiActTrem5 != null ? !umsarsiiActTrem5.equals(entity.umsarsiiActTrem5) : entity.umsarsiiActTrem5 != null)
            return false;
        if (umsarsiiIncTone6 != null ? !umsarsiiIncTone6.equals(entity.umsarsiiIncTone6) : entity.umsarsiiIncTone6 != null)
            return false;
        if (umsarsRapidAlterMovHands7 != null ? !umsarsRapidAlterMovHands7.equals(entity.umsarsRapidAlterMovHands7) : entity.umsarsRapidAlterMovHands7 != null)
            return false;
        if (umsarsFingertaps8 != null ? !umsarsFingertaps8.equals(entity.umsarsFingertaps8) : entity.umsarsFingertaps8 != null)
            return false;
        if (umsarsLegAgility9 != null ? !umsarsLegAgility9.equals(entity.umsarsLegAgility9) : entity.umsarsLegAgility9 != null)
            return false;
        if (umsarsHeelknee10 != null ? !umsarsHeelknee10.equals(entity.umsarsHeelknee10) : entity.umsarsHeelknee10 != null)
            return false;
        if (umsarsArisingChair11 != null ? !umsarsArisingChair11.equals(entity.umsarsArisingChair11) : entity.umsarsArisingChair11 != null)
            return false;
        if (umsarsPosture12 != null ? !umsarsPosture12.equals(entity.umsarsPosture12) : entity.umsarsPosture12 != null)
            return false;
        if (umsarsBodysway13 != null ? !umsarsBodysway13.equals(entity.umsarsBodysway13) : entity.umsarsBodysway13 != null)
            return false;
        if (umsarsGait14 != null ? !umsarsGait14.equals(entity.umsarsGait14) : entity.umsarsGait14 != null)
            return false;
        if (attentionFactAceIii != null ? !attentionFactAceIii.equals(entity.attentionFactAceIii) : entity.attentionFactAceIii != null)
            return false;
        if (memFactAceIii != null ? !memFactAceIii.equals(entity.memFactAceIii) : entity.memFactAceIii != null)
            return false;
        if (fluencyFactAceIii != null ? !fluencyFactAceIii.equals(entity.fluencyFactAceIii) : entity.fluencyFactAceIii != null)
            return false;
        if (langFactAceIii != null ? !langFactAceIii.equals(entity.langFactAceIii) : entity.langFactAceIii != null)
            return false;
        if (visualFactAceIii != null ? !visualFactAceIii.equals(entity.visualFactAceIii) : entity.visualFactAceIii != null)
            return false;
        if (totalAceIii != null ? !totalAceIii.equals(entity.totalAceIii) : entity.totalAceIii != null) return false;
        if (totalMiniAceIii != null ? !totalMiniAceIii.equals(entity.totalMiniAceIii) : entity.totalMiniAceIii != null)
            return false;
        if (mmse != null ? !mmse.equals(entity.mmse) : entity.mmse != null) return false;
        if (fab12 != null ? !fab12.equals(entity.fab12) : entity.fab12 != null) return false;
        if (bdi1314 != null ? !bdi1314.equals(entity.bdi1314) : entity.bdi1314 != null) return false;
        if (gds910 != null ? !gds910.equals(entity.gds910) : entity.gds910 != null) return false;
        if (waisRPicture != null ? !waisRPicture.equals(entity.waisRPicture) : entity.waisRPicture != null)
            return false;
        if (waisRPictureCent != null ? !waisRPictureCent.equals(entity.waisRPictureCent) : entity.waisRPictureCent != null)
            return false;
        if (cvlt15 != null ? !cvlt15.equals(entity.cvlt15) : entity.cvlt15 != null) return false;
        if (cvlt15Sten != null ? !cvlt15Sten.equals(entity.cvlt15Sten) : entity.cvlt15Sten != null) return false;
        if (cvltA1 != null ? !cvltA1.equals(entity.cvltA1) : entity.cvltA1 != null) return false;
        if (cvltA1Sten != null ? !cvltA1Sten.equals(entity.cvltA1Sten) : entity.cvltA1Sten != null) return false;
        if (cvltA5 != null ? !cvltA5.equals(entity.cvltA5) : entity.cvltA5 != null) return false;
        if (cvltA5Sten != null ? !cvltA5Sten.equals(entity.cvltA5Sten) : entity.cvltA5Sten != null) return false;
        if (cvltB != null ? !cvltB.equals(entity.cvltB) : entity.cvltB != null) return false;
        if (cvltBSten != null ? !cvltBSten.equals(entity.cvltBSten) : entity.cvltBSten != null) return false;
        if (cvltstmFree != null ? !cvltstmFree.equals(entity.cvltstmFree) : entity.cvltstmFree != null) return false;
        if (cvltstmFreeSten != null ? !cvltstmFreeSten.equals(entity.cvltstmFreeSten) : entity.cvltstmFreeSten != null)
            return false;
        if (cvltstmCued != null ? !cvltstmCued.equals(entity.cvltstmCued) : entity.cvltstmCued != null) return false;
        if (cvltstmCuedSten != null ? !cvltstmCuedSten.equals(entity.cvltstmCuedSten) : entity.cvltstmCuedSten != null)
            return false;
        if (cvltltmFree != null ? !cvltltmFree.equals(entity.cvltltmFree) : entity.cvltltmFree != null) return false;
        if (cvltltmFreeSten != null ? !cvltltmFreeSten.equals(entity.cvltltmFreeSten) : entity.cvltltmFreeSten != null)
            return false;
        if (cvltltmCued != null ? !cvltltmCued.equals(entity.cvltltmCued) : entity.cvltltmCued != null) return false;
        if (cvltltmCuedSten != null ? !cvltltmCuedSten.equals(entity.cvltltmCuedSten) : entity.cvltltmCuedSten != null)
            return false;
        if (cvltSemCluster != null ? !cvltSemCluster.equals(entity.cvltSemCluster) : entity.cvltSemCluster != null)
            return false;
        if (cvltSemClustSten != null ? !cvltSemClustSten.equals(entity.cvltSemClustSten) : entity.cvltSemClustSten != null)
            return false;
        if (cvlTserialClust != null ? !cvlTserialClust.equals(entity.cvlTserialClust) : entity.cvlTserialClust != null)
            return false;
        if (cvlTserialClustSten != null ? !cvlTserialClustSten.equals(entity.cvlTserialClustSten) : entity.cvlTserialClustSten != null)
            return false;
        if (cvltPercentCorrectI != null ? !cvltPercentCorrectI.equals(entity.cvltPercentCorrectI) : entity.cvltPercentCorrectI != null)
            return false;
        if (cvltPercentCorrectISten != null ? !cvltPercentCorrectISten.equals(entity.cvltPercentCorrectISten) : entity.cvltPercentCorrectISten != null)
            return false;
        if (cvltPercentCorrectIi != null ? !cvltPercentCorrectIi.equals(entity.cvltPercentCorrectIi) : entity.cvltPercentCorrectIi != null)
            return false;
        if (cvltPercentCorrectIiSten != null ? !cvltPercentCorrectIiSten.equals(entity.cvltPercentCorrectIiSten) : entity.cvltPercentCorrectIiSten != null)
            return false;
        if (cvltPercentCorrectIii != null ? !cvltPercentCorrectIii.equals(entity.cvltPercentCorrectIii) : entity.cvltPercentCorrectIii != null)
            return false;
        if (cvltPercentCorrectIiiSten != null ? !cvltPercentCorrectIiiSten.equals(entity.cvltPercentCorrectIiiSten) : entity.cvltPercentCorrectIiiSten != null)
            return false;
        if (cvlTagreeFactor != null ? !cvlTagreeFactor.equals(entity.cvlTagreeFactor) : entity.cvlTagreeFactor != null)
            return false;
        if (cvlTagreeFactorSten != null ? !cvlTagreeFactorSten.equals(entity.cvlTagreeFactorSten) : entity.cvlTagreeFactorSten != null)
            return false;
        if (cvltpers != null ? !cvltpers.equals(entity.cvltpers) : entity.cvltpers != null) return false;
        if (persSten != null ? !persSten.equals(entity.persSten) : entity.persSten != null) return false;
        if (cvlTintrusFree != null ? !cvlTintrusFree.equals(entity.cvlTintrusFree) : entity.cvlTintrusFree != null)
            return false;
        if (cvlTintrusFreeSten != null ? !cvlTintrusFreeSten.equals(entity.cvlTintrusFreeSten) : entity.cvlTintrusFreeSten != null)
            return false;
        if (cvlTintrusCues != null ? !cvlTintrusCues.equals(entity.cvlTintrusCues) : entity.cvlTintrusCues != null)
            return false;
        if (cvlTintrusCuesSten != null ? !cvlTintrusCuesSten.equals(entity.cvlTintrusCuesSten) : entity.cvlTintrusCuesSten != null)
            return false;
        if (cvltRecogTotal != null ? !cvltRecogTotal.equals(entity.cvltRecogTotal) : entity.cvltRecogTotal != null)
            return false;
        if (cvltRecogTotalSten != null ? !cvltRecogTotalSten.equals(entity.cvltRecogTotalSten) : entity.cvltRecogTotalSten != null)
            return false;
        if (cvltDifferentiation != null ? !cvltDifferentiation.equals(entity.cvltDifferentiation) : entity.cvltDifferentiation != null)
            return false;
        if (cvltDifferentiationSten != null ? !cvltDifferentiationSten.equals(entity.cvltDifferentiationSten) : entity.cvltDifferentiationSten != null)
            return false;
        if (cvltErrorRecog != null ? !cvltErrorRecog.equals(entity.cvltErrorRecog) : entity.cvltErrorRecog != null)
            return false;
        if (cvltErrorRecogSten != null ? !cvltErrorRecogSten.equals(entity.cvltErrorRecogSten) : entity.cvltErrorRecogSten != null)
            return false;
        if (tmtA != null ? !tmtA.equals(entity.tmtA) : entity.tmtA != null) return false;
        if (tmtAcent != null ? !tmtAcent.equals(entity.tmtAcent) : entity.tmtAcent != null) return false;
        if (tmtAErrors != null ? !tmtAErrors.equals(entity.tmtAErrors) : entity.tmtAErrors != null) return false;
        if (tmtB != null ? !tmtB.equals(entity.tmtB) : entity.tmtB != null) return false;
        if (tmtBcent != null ? !tmtBcent.equals(entity.tmtBcent) : entity.tmtBcent != null) return false;
        if (tmtBErrors != null ? !tmtBErrors.equals(entity.tmtBErrors) : entity.tmtBErrors != null) return false;
        if (rythymtestAbc != null ? !rythymtestAbc.equals(entity.rythymtestAbc) : entity.rythymtestAbc != null)
            return false;
        if (rythymtestAbCranga != null ? !rythymtestAbCranga.equals(entity.rythymtestAbCranga) : entity.rythymtestAbCranga != null)
            return false;
        if (tolTotalCorrect != null ? !tolTotalCorrect.equals(entity.tolTotalCorrect) : entity.tolTotalCorrect != null)
            return false;
        if (tolTotalCorrectCent != null ? !tolTotalCorrectCent.equals(entity.tolTotalCorrectCent) : entity.tolTotalCorrectCent != null)
            return false;
        if (tolTotalMoveScore != null ? !tolTotalMoveScore.equals(entity.tolTotalMoveScore) : entity.tolTotalMoveScore != null)
            return false;
        if (tolTotalMoveScoreCent != null ? !tolTotalMoveScoreCent.equals(entity.tolTotalMoveScoreCent) : entity.tolTotalMoveScoreCent != null)
            return false;
        if (tolTotalInitTime != null ? !tolTotalInitTime.equals(entity.tolTotalInitTime) : entity.tolTotalInitTime != null)
            return false;
        if (tolTotalInitTimeCent != null ? !tolTotalInitTimeCent.equals(entity.tolTotalInitTimeCent) : entity.tolTotalInitTimeCent != null)
            return false;
        if (tolTotalExecutTime != null ? !tolTotalExecutTime.equals(entity.tolTotalExecutTime) : entity.tolTotalExecutTime != null)
            return false;
        if (tolTotalExecutTimeCent != null ? !tolTotalExecutTimeCent.equals(entity.tolTotalExecutTimeCent) : entity.tolTotalExecutTimeCent != null)
            return false;
        if (tolTotalTime != null ? !tolTotalTime.equals(entity.tolTotalTime) : entity.tolTotalTime != null)
            return false;
        if (tolTotalTimeCent != null ? !tolTotalTimeCent.equals(entity.tolTotalTimeCent) : entity.tolTotalTimeCent != null)
            return false;
        if (fluencyKraw != null ? !fluencyKraw.equals(entity.fluencyKraw) : entity.fluencyKraw != null) return false;
        if (fluencyAnimalsRaw != null ? !fluencyAnimalsRaw.equals(entity.fluencyAnimalsRaw) : entity.fluencyAnimalsRaw != null)
            return false;
        if (fluencySharpsRaw != null ? !fluencySharpsRaw.equals(entity.fluencySharpsRaw) : entity.fluencySharpsRaw != null)
            return false;
        if (bntTotalScore != null ? !bntTotalScore.equals(entity.bntTotalScore) : entity.bntTotalScore != null)
            return false;
        if (bntCorrectPhonemCues != null ? !bntCorrectPhonemCues.equals(entity.bntCorrectPhonemCues) : entity.bntCorrectPhonemCues != null)
            return false;
        if (bntCorrectSemantCues != null ? !bntCorrectSemantCues.equals(entity.bntCorrectSemantCues) : entity.bntCorrectSemantCues != null)
            return false;
        if (bntCorrectContextCues != null ? !bntCorrectContextCues.equals(entity.bntCorrectContextCues) : entity.bntCorrectContextCues != null)
            return false;
        if (bntMeanTime != null ? !bntMeanTime.equals(entity.bntMeanTime) : entity.bntMeanTime != null) return false;
        if (clox1Draw != null ? !clox1Draw.equals(entity.clox1Draw) : entity.clox1Draw != null) return false;
        if (clox2Copy != null ? !clox2Copy.equals(entity.clox2Copy) : entity.clox2Copy != null) return false;
        if (rbmtShortDelay != null ? !rbmtShortDelay.equals(entity.rbmtShortDelay) : entity.rbmtShortDelay != null)
            return false;
        if (rbmtShortDelayCent != null ? !rbmtShortDelayCent.equals(entity.rbmtShortDelayCent) : entity.rbmtShortDelayCent != null)
            return false;
        if (rbmtLongDelay != null ? !rbmtLongDelay.equals(entity.rbmtLongDelay) : entity.rbmtLongDelay != null)
            return false;
        if (rbmtLongDelayCent != null ? !rbmtLongDelayCent.equals(entity.rbmtLongDelayCent) : entity.rbmtLongDelayCent != null)
            return false;
        if (gonogoProcentInCorrGo != null ? !gonogoProcentInCorrGo.equals(entity.gonogoProcentInCorrGo) : entity.gonogoProcentInCorrGo != null)
            return false;
        if (gonogoProcentInCorrNogo != null ? !gonogoProcentInCorrNogo.equals(entity.gonogoProcentInCorrNogo) : entity.gonogoProcentInCorrNogo != null)
            return false;
        if (gonogoNrInCorrGo != null ? !gonogoNrInCorrGo.equals(entity.gonogoNrInCorrGo) : entity.gonogoNrInCorrGo != null)
            return false;
        if (gonogoNrInCorrNogo != null ? !gonogoNrInCorrNogo.equals(entity.gonogoNrInCorrNogo) : entity.gonogoNrInCorrNogo != null)
            return false;
        if (gonogoNrCorrectGo != null ? !gonogoNrCorrectGo.equals(entity.gonogoNrCorrectGo) : entity.gonogoNrCorrectGo != null)
            return false;
        if (gonogoNrCorrectNogo != null ? !gonogoNrCorrectNogo.equals(entity.gonogoNrCorrectNogo) : entity.gonogoNrCorrectNogo != null)
            return false;
        if (meanResponseTimeCorrrectGo != null ? !meanResponseTimeCorrrectGo.equals(entity.meanResponseTimeCorrrectGo) : entity.meanResponseTimeCorrrectGo != null)
            return false;
        if (elevatorCountTotal != null ? !elevatorCountTotal.equals(entity.elevatorCountTotal) : entity.elevatorCountTotal != null)
            return false;
        if (elevatorCountTotalCent != null ? !elevatorCountTotalCent.equals(entity.elevatorCountTotalCent) : entity.elevatorCountTotalCent != null)
            return false;
        if (elevatorDistractTotal != null ? !elevatorDistractTotal.equals(entity.elevatorDistractTotal) : entity.elevatorDistractTotal != null)
            return false;
        if (elevatorDistractTotalCent != null ? !elevatorDistractTotalCent.equals(entity.elevatorDistractTotalCent) : entity.elevatorDistractTotalCent != null)
            return false;
        if (wcstlpp != null ? !wcstlpp.equals(entity.wcstlpp) : entity.wcstlpp != null) return false;
        if (wcstlpo != null ? !wcstlpo.equals(entity.wcstlpo) : entity.wcstlpo != null) return false;
        if (wcstlbo != null ? !wcstlbo.equals(entity.wcstlbo) : entity.wcstlbo != null) return false;
        if (wcstLbOcent != null ? !wcstLbOcent.equals(entity.wcstLbOcent) : entity.wcstLbOcent != null) return false;
        if (wcstpb != null ? !wcstpb.equals(entity.wcstpb) : entity.wcstpb != null) return false;
        if (wcstop != null ? !wcstop.equals(entity.wcstop) : entity.wcstop != null) return false;
        if (wcstoPcent != null ? !wcstoPcent.equals(entity.wcstoPcent) : entity.wcstoPcent != null) return false;
        if (wcstpop != null ? !wcstpop.equals(entity.wcstpop) : entity.wcstpop != null) return false;
        if (wcstbp != null ? !wcstbp.equals(entity.wcstbp) : entity.wcstbp != null) return false;
        if (wcstbPcent != null ? !wcstbPcent.equals(entity.wcstbPcent) : entity.wcstbPcent != null) return false;
        if (wcstpbp != null ? !wcstpbp.equals(entity.wcstpbp) : entity.wcstpbp != null) return false;
        if (wcstpbPcent != null ? !wcstpbPcent.equals(entity.wcstpbPcent) : entity.wcstpbPcent != null) return false;
        if (wcstbn != null ? !wcstbn.equals(entity.wcstbn) : entity.wcstbn != null) return false;
        if (wcstbNcent != null ? !wcstbNcent.equals(entity.wcstbNcent) : entity.wcstbNcent != null) return false;
        if (wcstpbn != null ? !wcstpbn.equals(entity.wcstpbn) : entity.wcstpbn != null) return false;
        if (wcstodp != null ? !wcstodp.equals(entity.wcstodp) : entity.wcstodp != null) return false;
        if (wcstpodp != null ? !wcstpodp.equals(entity.wcstpodp) : entity.wcstpodp != null) return false;
        if (wcstpodPcent != null ? !wcstpodPcent.equals(entity.wcstpodPcent) : entity.wcstpodPcent != null)
            return false;
        if (wcstlzk != null ? !wcstlzk.equals(entity.wcstlzk) : entity.wcstlzk != null) return false;
        if (wcstppmz != null ? !wcstppmz.equals(entity.wcstppmz) : entity.wcstppmz != null) return false;
        if (wcstpun != null ? !wcstpun.equals(entity.wcstpun) : entity.wcstpun != null) return false;
        if (wcstuu != null ? !wcstuu.equals(entity.wcstuu) : entity.wcstuu != null) return false;
        if (similarWaisTotal != null ? !similarWaisTotal.equals(entity.similarWaisTotal) : entity.similarWaisTotal != null)
            return false;
        if (similarWaisCent != null ? !similarWaisCent.equals(entity.similarWaisCent) : entity.similarWaisCent != null)
            return false;
        if (waisInfo != null ? !waisInfo.equals(entity.waisInfo) : entity.waisInfo != null) return false;
        if (waisInfoCent != null ? !waisInfoCent.equals(entity.waisInfoCent) : entity.waisInfoCent != null)
            return false;
        if (waisDigitSpan != null ? !waisDigitSpan.equals(entity.waisDigitSpan) : entity.waisDigitSpan != null)
            return false;
        if (waisDigitSpanCent != null ? !waisDigitSpanCent.equals(entity.waisDigitSpanCent) : entity.waisDigitSpanCent != null)
            return false;
        if (mirrorTotalTime != null ? !mirrorTotalTime.equals(entity.mirrorTotalTime) : entity.mirrorTotalTime != null)
            return false;
        if (mirrorMeanTime != null ? !mirrorMeanTime.equals(entity.mirrorMeanTime) : entity.mirrorMeanTime != null)
            return false;
        if (mirrorCorrectScore != null ? !mirrorCorrectScore.equals(entity.mirrorCorrectScore) : entity.mirrorCorrectScore != null)
            return false;
        if (mirrorErrors != null ? !mirrorErrors.equals(entity.mirrorErrors) : entity.mirrorErrors != null)
            return false;
        if (mirrorCorrectedErrors != null ? !mirrorCorrectedErrors.equals(entity.mirrorCorrectedErrors) : entity.mirrorCorrectedErrors != null)
            return false;
        if (jloCorrect != null ? !jloCorrect.equals(entity.jloCorrect) : entity.jloCorrect != null) return false;
        if (jlowp != null ? !jlowp.equals(entity.jlowp) : entity.jlowp != null) return false;
        if (jlOcent != null ? !jlOcent.equals(entity.jlOcent) : entity.jlOcent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subjectCode != null ? subjectCode.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (dateTest != null ? dateTest.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (gr != null ? gr.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (bac != null ? bac.hashCode() : 0);
        result = 31 * result + (edu != null ? edu.hashCode() : 0);
        result = 31 * result + (eduY != null ? eduY.hashCode() : 0);
        result = 31 * result + (musEdu != null ? musEdu.hashCode() : 0);
        result = 31 * result + (musEduY != null ? musEduY.hashCode() : 0);
        result = 31 * result + (hand != null ? hand.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (currentWork != null ? currentWork.hashCode() : 0);
        result = 31 * result + (intoxicant != null ? intoxicant.hashCode() : 0);
        result = 31 * result + (eye != null ? eye.hashCode() : 0);
        result = 31 * result + (ear != null ? ear.hashCode() : 0);
        result = 31 * result + (injuryWithFainting != null ? injuryWithFainting.hashCode() : 0);
        result = 31 * result + (fainting != null ? fainting.hashCode() : 0);
        result = 31 * result + (neurologist != null ? neurologist.hashCode() : 0);
        result = 31 * result + (psychiatrist != null ? psychiatrist.hashCode() : 0);
        result = 31 * result + (depression != null ? depression.hashCode() : 0);
        result = 31 * result + (hypertension != null ? hypertension.hashCode() : 0);
        result = 31 * result + (heartAttack != null ? heartAttack.hashCode() : 0);
        result = 31 * result + (cardiacArrest != null ? cardiacArrest.hashCode() : 0);
        result = 31 * result + (cardiacInsuff != null ? cardiacInsuff.hashCode() : 0);
        result = 31 * result + (kidneysInsuff != null ? kidneysInsuff.hashCode() : 0);
        result = 31 * result + (liverInsuff != null ? liverInsuff.hashCode() : 0);
        result = 31 * result + (diabetes != null ? diabetes.hashCode() : 0);
        result = 31 * result + (thyroid != null ? thyroid.hashCode() : 0);
        result = 31 * result + (lungs != null ? lungs.hashCode() : 0);
        result = 31 * result + (neurodegeneration != null ? neurodegeneration.hashCode() : 0);
        result = 31 * result + (otherdisorders != null ? otherdisorders.hashCode() : 0);
        result = 31 * result + (alcoNow != null ? alcoNow.hashCode() : 0);
        result = 31 * result + (alcoPa != null ? alcoPa.hashCode() : 0);
        result = 31 * result + (drugs != null ? drugs.hashCode() : 0);
        result = 31 * result + (ageOnset != null ? ageOnset.hashCode() : 0);
        result = 31 * result + (ageDiagnosis != null ? ageDiagnosis.hashCode() : 0);
        result = 31 * result + (diseaseDurationY != null ? diseaseDurationY.hashCode() : 0);
        result = 31 * result + (memoryComplains != null ? memoryComplains.hashCode() : 0);
        result = 31 * result + (otherCognitiveComplains != null ? otherCognitiveComplains.hashCode() : 0);
        result = 31 * result + (sideSymptOnSet != null ? sideSymptOnSet.hashCode() : 0);
        result = 31 * result + (currentSympt != null ? currentSympt.hashCode() : 0);
        result = 31 * result + (tkMri != null ? tkMri.hashCode() : 0);
        result = 31 * result + (asymmsymptNow != null ? asymmsymptNow.hashCode() : 0);
        result = 31 * result + (motPhenot != null ? motPhenot.hashCode() : 0);
        result = 31 * result + (updrsDyskin32333435 != null ? updrsDyskin32333435.hashCode() : 0);
        result = 31 * result + (updrsMotFluct36373839 != null ? updrsMotFluct36373839.hashCode() : 0);
        result = 31 * result + (updrsFalling13 != null ? updrsFalling13.hashCode() : 0);
        result = 31 * result + (hallucination2 != null ? hallucination2.hashCode() : 0);
        result = 31 * result + (hallucinationOnSetY != null ? hallucinationOnSetY.hashCode() : 0);
        result = 31 * result + (medications != null ? medications.hashCode() : 0);
        result = 31 * result + (lDopaequiv != null ? lDopaequiv.hashCode() : 0);
        result = 31 * result + (otherTreatment != null ? otherTreatment.hashCode() : 0);
        result = 31 * result + (surg != null ? surg.hashCode() : 0);
        result = 31 * result + (surgDesc != null ? surgDesc.hashCode() : 0);
        result = 31 * result + (adlon != null ? adlon.hashCode() : 0);
        result = 31 * result + (adloff != null ? adloff.hashCode() : 0);
        result = 31 * result + (iadlon != null ? iadlon.hashCode() : 0);
        result = 31 * result + (iadloff != null ? iadloff.hashCode() : 0);
        result = 31 * result + (hAndYon != null ? hAndYon.hashCode() : 0);
        result = 31 * result + (hAndYoff != null ? hAndYoff.hashCode() : 0);
        result = 31 * result + (schAndEngOn != null ? schAndEngOn.hashCode() : 0);
        result = 31 * result + (schAndEngOff != null ? schAndEngOff.hashCode() : 0);
        result = 31 * result + (updrson != null ? updrson.hashCode() : 0);
        result = 31 * result + (updrsoff != null ? updrsoff.hashCode() : 0);
        result = 31 * result + (updrsion != null ? updrsion.hashCode() : 0);
        result = 31 * result + (updrsioff != null ? updrsioff.hashCode() : 0);
        result = 31 * result + (updrsiion != null ? updrsiion.hashCode() : 0);
        result = 31 * result + (updrsiioff != null ? updrsiioff.hashCode() : 0);
        result = 31 * result + (updrsiiion != null ? updrsiiion.hashCode() : 0);
        result = 31 * result + (updrsiiioff != null ? updrsiiioff.hashCode() : 0);
        result = 31 * result + (updrsSpeech5 != null ? updrsSpeech5.hashCode() : 0);
        result = 31 * result + (updrsSpeech18 != null ? updrsSpeech18.hashCode() : 0);
        result = 31 * result + (updrsFacialExpress19 != null ? updrsFacialExpress19.hashCode() : 0);
        result = 31 * result + (updrsTremorRest20 != null ? updrsTremorRest20.hashCode() : 0);
        result = 31 * result + (updrsEssentialTremor21 != null ? updrsEssentialTremor21.hashCode() : 0);
        result = 31 * result + (updrsRidigity22 != null ? updrsRidigity22.hashCode() : 0);
        result = 31 * result + (updrsDigitMov23 != null ? updrsDigitMov23.hashCode() : 0);
        result = 31 * result + (updrsiiiHandMov24 != null ? updrsiiiHandMov24.hashCode() : 0);
        result = 31 * result + (updrsRapidAlterHandMov25 != null ? updrsRapidAlterHandMov25.hashCode() : 0);
        result = 31 * result + (updrsLegAgility26 != null ? updrsLegAgility26.hashCode() : 0);
        result = 31 * result + (updrsArisingChair27 != null ? updrsArisingChair27.hashCode() : 0);
        result = 31 * result + (updrsPosture28 != null ? updrsPosture28.hashCode() : 0);
        result = 31 * result + (updrsPostureStab29 != null ? updrsPostureStab29.hashCode() : 0);
        result = 31 * result + (updrsGait30 != null ? updrsGait30.hashCode() : 0);
        result = 31 * result + (updrsiiiBradykinesia31 != null ? updrsiiiBradykinesia31.hashCode() : 0);
        result = 31 * result + (progressionPd != null ? progressionPd.hashCode() : 0);
        result = 31 * result + (umsarsi != null ? umsarsi.hashCode() : 0);
        result = 31 * result + (umsarsii != null ? umsarsii.hashCode() : 0);
        result = 31 * result + (umsarsiiiOrthostatic != null ? umsarsiiiOrthostatic.hashCode() : 0);
        result = 31 * result + (umsarsiv != null ? umsarsiv.hashCode() : 0);
        result = 31 * result + (umsarsiIi != null ? umsarsiIi.hashCode() : 0);
        result = 31 * result + (umsarsiSpeech1 != null ? umsarsiSpeech1.hashCode() : 0);
        result = 31 * result + (umsarsiWalking7 != null ? umsarsiWalking7.hashCode() : 0);
        result = 31 * result + (umsarsiFalling8 != null ? umsarsiFalling8.hashCode() : 0);
        result = 31 * result + (umsarsiiFacialExpression1 != null ? umsarsiiFacialExpression1.hashCode() : 0);
        result = 31 * result + (umsarsiiSpeech2 != null ? umsarsiiSpeech2.hashCode() : 0);
        result = 31 * result + (umsarsiiOcuMotDys3 != null ? umsarsiiOcuMotDys3.hashCode() : 0);
        result = 31 * result + (umsarsiiTremRest4 != null ? umsarsiiTremRest4.hashCode() : 0);
        result = 31 * result + (umsarsiiActTrem5 != null ? umsarsiiActTrem5.hashCode() : 0);
        result = 31 * result + (umsarsiiIncTone6 != null ? umsarsiiIncTone6.hashCode() : 0);
        result = 31 * result + (umsarsRapidAlterMovHands7 != null ? umsarsRapidAlterMovHands7.hashCode() : 0);
        result = 31 * result + (umsarsFingertaps8 != null ? umsarsFingertaps8.hashCode() : 0);
        result = 31 * result + (umsarsLegAgility9 != null ? umsarsLegAgility9.hashCode() : 0);
        result = 31 * result + (umsarsHeelknee10 != null ? umsarsHeelknee10.hashCode() : 0);
        result = 31 * result + (umsarsArisingChair11 != null ? umsarsArisingChair11.hashCode() : 0);
        result = 31 * result + (umsarsPosture12 != null ? umsarsPosture12.hashCode() : 0);
        result = 31 * result + (umsarsBodysway13 != null ? umsarsBodysway13.hashCode() : 0);
        result = 31 * result + (umsarsGait14 != null ? umsarsGait14.hashCode() : 0);
        result = 31 * result + (attentionFactAceIii != null ? attentionFactAceIii.hashCode() : 0);
        result = 31 * result + (memFactAceIii != null ? memFactAceIii.hashCode() : 0);
        result = 31 * result + (fluencyFactAceIii != null ? fluencyFactAceIii.hashCode() : 0);
        result = 31 * result + (langFactAceIii != null ? langFactAceIii.hashCode() : 0);
        result = 31 * result + (visualFactAceIii != null ? visualFactAceIii.hashCode() : 0);
        result = 31 * result + (totalAceIii != null ? totalAceIii.hashCode() : 0);
        result = 31 * result + (totalMiniAceIii != null ? totalMiniAceIii.hashCode() : 0);
        result = 31 * result + (mmse != null ? mmse.hashCode() : 0);
        result = 31 * result + (fab12 != null ? fab12.hashCode() : 0);
        result = 31 * result + (bdi1314 != null ? bdi1314.hashCode() : 0);
        result = 31 * result + (gds910 != null ? gds910.hashCode() : 0);
        result = 31 * result + (waisRPicture != null ? waisRPicture.hashCode() : 0);
        result = 31 * result + (waisRPictureCent != null ? waisRPictureCent.hashCode() : 0);
        result = 31 * result + (cvlt15 != null ? cvlt15.hashCode() : 0);
        result = 31 * result + (cvlt15Sten != null ? cvlt15Sten.hashCode() : 0);
        result = 31 * result + (cvltA1 != null ? cvltA1.hashCode() : 0);
        result = 31 * result + (cvltA1Sten != null ? cvltA1Sten.hashCode() : 0);
        result = 31 * result + (cvltA5 != null ? cvltA5.hashCode() : 0);
        result = 31 * result + (cvltA5Sten != null ? cvltA5Sten.hashCode() : 0);
        result = 31 * result + (cvltB != null ? cvltB.hashCode() : 0);
        result = 31 * result + (cvltBSten != null ? cvltBSten.hashCode() : 0);
        result = 31 * result + (cvltstmFree != null ? cvltstmFree.hashCode() : 0);
        result = 31 * result + (cvltstmFreeSten != null ? cvltstmFreeSten.hashCode() : 0);
        result = 31 * result + (cvltstmCued != null ? cvltstmCued.hashCode() : 0);
        result = 31 * result + (cvltstmCuedSten != null ? cvltstmCuedSten.hashCode() : 0);
        result = 31 * result + (cvltltmFree != null ? cvltltmFree.hashCode() : 0);
        result = 31 * result + (cvltltmFreeSten != null ? cvltltmFreeSten.hashCode() : 0);
        result = 31 * result + (cvltltmCued != null ? cvltltmCued.hashCode() : 0);
        result = 31 * result + (cvltltmCuedSten != null ? cvltltmCuedSten.hashCode() : 0);
        result = 31 * result + (cvltSemCluster != null ? cvltSemCluster.hashCode() : 0);
        result = 31 * result + (cvltSemClustSten != null ? cvltSemClustSten.hashCode() : 0);
        result = 31 * result + (cvlTserialClust != null ? cvlTserialClust.hashCode() : 0);
        result = 31 * result + (cvlTserialClustSten != null ? cvlTserialClustSten.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectI != null ? cvltPercentCorrectI.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectISten != null ? cvltPercentCorrectISten.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectIi != null ? cvltPercentCorrectIi.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectIiSten != null ? cvltPercentCorrectIiSten.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectIii != null ? cvltPercentCorrectIii.hashCode() : 0);
        result = 31 * result + (cvltPercentCorrectIiiSten != null ? cvltPercentCorrectIiiSten.hashCode() : 0);
        result = 31 * result + (cvlTagreeFactor != null ? cvlTagreeFactor.hashCode() : 0);
        result = 31 * result + (cvlTagreeFactorSten != null ? cvlTagreeFactorSten.hashCode() : 0);
        result = 31 * result + (cvltpers != null ? cvltpers.hashCode() : 0);
        result = 31 * result + (persSten != null ? persSten.hashCode() : 0);
        result = 31 * result + (cvlTintrusFree != null ? cvlTintrusFree.hashCode() : 0);
        result = 31 * result + (cvlTintrusFreeSten != null ? cvlTintrusFreeSten.hashCode() : 0);
        result = 31 * result + (cvlTintrusCues != null ? cvlTintrusCues.hashCode() : 0);
        result = 31 * result + (cvlTintrusCuesSten != null ? cvlTintrusCuesSten.hashCode() : 0);
        result = 31 * result + (cvltRecogTotal != null ? cvltRecogTotal.hashCode() : 0);
        result = 31 * result + (cvltRecogTotalSten != null ? cvltRecogTotalSten.hashCode() : 0);
        result = 31 * result + (cvltDifferentiation != null ? cvltDifferentiation.hashCode() : 0);
        result = 31 * result + (cvltDifferentiationSten != null ? cvltDifferentiationSten.hashCode() : 0);
        result = 31 * result + (cvltErrorRecog != null ? cvltErrorRecog.hashCode() : 0);
        result = 31 * result + (cvltErrorRecogSten != null ? cvltErrorRecogSten.hashCode() : 0);
        result = 31 * result + (tmtA != null ? tmtA.hashCode() : 0);
        result = 31 * result + (tmtAcent != null ? tmtAcent.hashCode() : 0);
        result = 31 * result + (tmtAErrors != null ? tmtAErrors.hashCode() : 0);
        result = 31 * result + (tmtB != null ? tmtB.hashCode() : 0);
        result = 31 * result + (tmtBcent != null ? tmtBcent.hashCode() : 0);
        result = 31 * result + (tmtBErrors != null ? tmtBErrors.hashCode() : 0);
        result = 31 * result + (rythymtestAbc != null ? rythymtestAbc.hashCode() : 0);
        result = 31 * result + (rythymtestAbCranga != null ? rythymtestAbCranga.hashCode() : 0);
        result = 31 * result + (tolTotalCorrect != null ? tolTotalCorrect.hashCode() : 0);
        result = 31 * result + (tolTotalCorrectCent != null ? tolTotalCorrectCent.hashCode() : 0);
        result = 31 * result + (tolTotalMoveScore != null ? tolTotalMoveScore.hashCode() : 0);
        result = 31 * result + (tolTotalMoveScoreCent != null ? tolTotalMoveScoreCent.hashCode() : 0);
        result = 31 * result + (tolTotalInitTime != null ? tolTotalInitTime.hashCode() : 0);
        result = 31 * result + (tolTotalInitTimeCent != null ? tolTotalInitTimeCent.hashCode() : 0);
        result = 31 * result + (tolTotalExecutTime != null ? tolTotalExecutTime.hashCode() : 0);
        result = 31 * result + (tolTotalExecutTimeCent != null ? tolTotalExecutTimeCent.hashCode() : 0);
        result = 31 * result + (tolTotalTime != null ? tolTotalTime.hashCode() : 0);
        result = 31 * result + (tolTotalTimeCent != null ? tolTotalTimeCent.hashCode() : 0);
        result = 31 * result + (fluencyKraw != null ? fluencyKraw.hashCode() : 0);
        result = 31 * result + (fluencyAnimalsRaw != null ? fluencyAnimalsRaw.hashCode() : 0);
        result = 31 * result + (fluencySharpsRaw != null ? fluencySharpsRaw.hashCode() : 0);
        result = 31 * result + (bntTotalScore != null ? bntTotalScore.hashCode() : 0);
        result = 31 * result + (bntCorrectPhonemCues != null ? bntCorrectPhonemCues.hashCode() : 0);
        result = 31 * result + (bntCorrectSemantCues != null ? bntCorrectSemantCues.hashCode() : 0);
        result = 31 * result + (bntCorrectContextCues != null ? bntCorrectContextCues.hashCode() : 0);
        result = 31 * result + (bntMeanTime != null ? bntMeanTime.hashCode() : 0);
        result = 31 * result + (clox1Draw != null ? clox1Draw.hashCode() : 0);
        result = 31 * result + (clox2Copy != null ? clox2Copy.hashCode() : 0);
        result = 31 * result + (rbmtShortDelay != null ? rbmtShortDelay.hashCode() : 0);
        result = 31 * result + (rbmtShortDelayCent != null ? rbmtShortDelayCent.hashCode() : 0);
        result = 31 * result + (rbmtLongDelay != null ? rbmtLongDelay.hashCode() : 0);
        result = 31 * result + (rbmtLongDelayCent != null ? rbmtLongDelayCent.hashCode() : 0);
        result = 31 * result + (gonogoProcentInCorrGo != null ? gonogoProcentInCorrGo.hashCode() : 0);
        result = 31 * result + (gonogoProcentInCorrNogo != null ? gonogoProcentInCorrNogo.hashCode() : 0);
        result = 31 * result + (gonogoNrInCorrGo != null ? gonogoNrInCorrGo.hashCode() : 0);
        result = 31 * result + (gonogoNrInCorrNogo != null ? gonogoNrInCorrNogo.hashCode() : 0);
        result = 31 * result + (gonogoNrCorrectGo != null ? gonogoNrCorrectGo.hashCode() : 0);
        result = 31 * result + (gonogoNrCorrectNogo != null ? gonogoNrCorrectNogo.hashCode() : 0);
        result = 31 * result + (meanResponseTimeCorrrectGo != null ? meanResponseTimeCorrrectGo.hashCode() : 0);
        result = 31 * result + (elevatorCountTotal != null ? elevatorCountTotal.hashCode() : 0);
        result = 31 * result + (elevatorCountTotalCent != null ? elevatorCountTotalCent.hashCode() : 0);
        result = 31 * result + (elevatorDistractTotal != null ? elevatorDistractTotal.hashCode() : 0);
        result = 31 * result + (elevatorDistractTotalCent != null ? elevatorDistractTotalCent.hashCode() : 0);
        result = 31 * result + (wcstlpp != null ? wcstlpp.hashCode() : 0);
        result = 31 * result + (wcstlpo != null ? wcstlpo.hashCode() : 0);
        result = 31 * result + (wcstlbo != null ? wcstlbo.hashCode() : 0);
        result = 31 * result + (wcstLbOcent != null ? wcstLbOcent.hashCode() : 0);
        result = 31 * result + (wcstpb != null ? wcstpb.hashCode() : 0);
        result = 31 * result + (wcstop != null ? wcstop.hashCode() : 0);
        result = 31 * result + (wcstoPcent != null ? wcstoPcent.hashCode() : 0);
        result = 31 * result + (wcstpop != null ? wcstpop.hashCode() : 0);
        result = 31 * result + (wcstbp != null ? wcstbp.hashCode() : 0);
        result = 31 * result + (wcstbPcent != null ? wcstbPcent.hashCode() : 0);
        result = 31 * result + (wcstpbp != null ? wcstpbp.hashCode() : 0);
        result = 31 * result + (wcstpbPcent != null ? wcstpbPcent.hashCode() : 0);
        result = 31 * result + (wcstbn != null ? wcstbn.hashCode() : 0);
        result = 31 * result + (wcstbNcent != null ? wcstbNcent.hashCode() : 0);
        result = 31 * result + (wcstpbn != null ? wcstpbn.hashCode() : 0);
        result = 31 * result + (wcstodp != null ? wcstodp.hashCode() : 0);
        result = 31 * result + (wcstpodp != null ? wcstpodp.hashCode() : 0);
        result = 31 * result + (wcstpodPcent != null ? wcstpodPcent.hashCode() : 0);
        result = 31 * result + (wcstlzk != null ? wcstlzk.hashCode() : 0);
        result = 31 * result + (wcstppmz != null ? wcstppmz.hashCode() : 0);
        result = 31 * result + (wcstpun != null ? wcstpun.hashCode() : 0);
        result = 31 * result + (wcstuu != null ? wcstuu.hashCode() : 0);
        result = 31 * result + (similarWaisTotal != null ? similarWaisTotal.hashCode() : 0);
        result = 31 * result + (similarWaisCent != null ? similarWaisCent.hashCode() : 0);
        result = 31 * result + (waisInfo != null ? waisInfo.hashCode() : 0);
        result = 31 * result + (waisInfoCent != null ? waisInfoCent.hashCode() : 0);
        result = 31 * result + (waisDigitSpan != null ? waisDigitSpan.hashCode() : 0);
        result = 31 * result + (waisDigitSpanCent != null ? waisDigitSpanCent.hashCode() : 0);
        result = 31 * result + (mirrorTotalTime != null ? mirrorTotalTime.hashCode() : 0);
        result = 31 * result + (mirrorMeanTime != null ? mirrorMeanTime.hashCode() : 0);
        result = 31 * result + (mirrorCorrectScore != null ? mirrorCorrectScore.hashCode() : 0);
        result = 31 * result + (mirrorErrors != null ? mirrorErrors.hashCode() : 0);
        result = 31 * result + (mirrorCorrectedErrors != null ? mirrorCorrectedErrors.hashCode() : 0);
        result = 31 * result + (jloCorrect != null ? jloCorrect.hashCode() : 0);
        result = 31 * result + (jlowp != null ? jlowp.hashCode() : 0);
        result = 31 * result + (jlOcent != null ? jlOcent.hashCode() : 0);
        return result;
    }
}
