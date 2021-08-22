public class CandidateFactory {
    public Candidate getCandidate(CandidateTypes type) {
        Candidate candidate = null;
        switch (type) {
            case QA:
                candidate = new QACandidate();
                break;
            case DEVELOPER:
                candidate = new DeveloperCandidate();
                break;
            case BUSINESSANALYST:
                candidate = new BusinessAnalystCandidate();
                break;
            default:
                throw new IllegalArgumentException("Wrong candidate type:" + type);
        }
        return candidate;
    }
}

interface Candidate {
    void curriculumVitae();
}

class QACandidate implements Candidate {
    @Override
    public void curriculumVitae() {
        System.out.println("I am QA candidate!");
    }
}

class DeveloperCandidate implements Candidate {
    @Override
    public void curriculumVitae() {
        System.out.println("I am Java developer!");
    }
}

class BusinessAnalystCandidate implements Candidate {
    @Override
    public void curriculumVitae() {
        System.out.println("I am Business Analyst!");
    }
}

enum CandidateTypes {
    QA,
    DEVELOPER,
    BUSINESSANALYST
}


class Mai {
    public static void main(String[] args) {
        CandidateFactory factory = new CandidateFactory();

        Candidate qa = factory.getCandidate(CandidateTypes.QA);
        Candidate developer = factory.getCandidate(CandidateTypes.DEVELOPER);
        Candidate businessAnalyst = factory.getCandidate(CandidateTypes.BUSINESSANALYST);

        qa.curriculumVitae();
        developer.curriculumVitae();
        businessAnalyst.curriculumVitae();
    }
}