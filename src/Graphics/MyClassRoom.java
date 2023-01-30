package Graphics;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyClassRoom extends JFrame{
	
	
	JPanel masterPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel classOnePanel = new JPanel();
	JPanel classTwoPanel = new JPanel();
	JPanel classThreePanel = new JPanel();
	JPanel readingPanel = new JPanel();
	
	JPanel SubjectEnglishPanel = new JPanel();
	JPanel SubjectMathematicsPanel = new JPanel();
	JPanel SubjectPhysicsPanel = new JPanel();
	JPanel SubjectChemistryPanel = new JPanel();
	JPanel SubjectBiologyPanel = new JPanel();
	JPanel SubjectGeographyPanel = new JPanel();
	JPanel SubjectAgriculturePanel = new JPanel();
	JPanel SubjectComputerPanel = new JPanel();
	JPanel SubjectGovernmentPanel = new JPanel();
	JPanel SubjectLiteraturePanel = new JPanel();
	JPanel SubjectCRSPanel = new JPanel();
	JPanel SubjectCivicPanel = new JPanel();
	JPanel SubjectEconomicsPanel = new JPanel();
	JPanel SubjectCommercePanel = new JPanel();
	JPanel SubjectYorubaPanel = new JPanel();
	JPanel SubjectAccountingPanel = new JPanel();
	JPanel SubjectMarketingPanel = new JPanel();
	
	JPanel SubjectEnglishPanel2 = new JPanel();
	JPanel SubjectMathematicsPanel2 = new JPanel();
	JPanel SubjectPhysicsPanel2 = new JPanel();
	JPanel SubjectChemistryPanel2 = new JPanel();
	JPanel SubjectBiologyPanel2 = new JPanel();
	JPanel SubjectGeographyPanel2 = new JPanel();
	JPanel SubjectAgriculturePanel2 = new JPanel();
	JPanel SubjectComputerPanel2 = new JPanel();
	JPanel SubjectGovernmentPanel2 = new JPanel();
	JPanel SubjectLiteraturePanel2 = new JPanel();
	JPanel SubjectCRSPanel2 = new JPanel();
	JPanel SubjectCivicPanel2 = new JPanel();
	JPanel SubjectEconomicsPanel2 = new JPanel();
	JPanel SubjectCommercePanel2 = new JPanel();
	JPanel SubjectYorubaPanel2 = new JPanel();
	JPanel SubjectAccountingPanel2 = new JPanel();
	JPanel SubjectMarketingPanel2 = new JPanel();
	
	JPanel SubjectEnglishPanel3 = new JPanel();
	JPanel SubjectMathematicsPanel3= new JPanel();
	JPanel SubjectPhysicsPanel3 = new JPanel();
	JPanel SubjectChemistryPanel3 = new JPanel();
	JPanel SubjectBiologyPanel3 = new JPanel();
	JPanel SubjectGeographyPanel3 = new JPanel();
	JPanel SubjectAgriculturePanel3 = new JPanel();
	JPanel SubjectComputerPanel3 = new JPanel();
	JPanel SubjectGovernmentPanel3 = new JPanel();
	JPanel SubjectLiteraturePanel3 = new JPanel();
	JPanel SubjectCRSPanel3 = new JPanel();
	JPanel SubjectCivicPanel3 = new JPanel();
	JPanel SubjectEconomicsPanel3 = new JPanel();
	JPanel SubjectCommercePanel3 = new JPanel();
	JPanel SubjectYorubaPanel3 = new JPanel();
	JPanel SubjectAccountingPanel3 = new JPanel();
	JPanel SubjectMarketingPanel3= new JPanel();
	
	JPanel ReadingEnglishPanel1 = new JPanel();
	JPanel ReadingMathematicsPanel1 = new JPanel();
	JPanel ReadingPhysicsPanel1 = new JPanel();
	JPanel ReadingChemistryPanel1 = new JPanel();
	JPanel ReadingBiologyPanel1 = new JPanel();
	JPanel ReadingGeographyPanel1 = new JPanel();
	JPanel ReadingAgriculturePanel1 = new JPanel();
	JPanel ReadingComputerPanel1 = new JPanel();
	JPanel ReadingGovernmentPanel1 = new JPanel();
	JPanel ReadingLiteraturePanel1 = new JPanel();
	JPanel ReadingCRSPanel1 = new JPanel();
	JPanel ReadingCivicPanel1 = new JPanel();
	JPanel ReadingEconomicsPanel1 = new JPanel();
	JPanel ReadingCommercePanel1 = new JPanel();
	JPanel ReadingYorubaPanel1 = new JPanel();
	JPanel ReadingAccountingPanel1 = new JPanel();
	JPanel ReadingMarketingPanel1 = new JPanel(); 
	
	JPanel ReadingEnglishPanel2 = new JPanel();
	JPanel ReadingMathematicsPanel2 = new JPanel();
	JPanel ReadingPhysicsPanel2 = new JPanel();
	JPanel ReadingChemistryPanel2 = new JPanel();
	JPanel ReadingBiologyPanel2 = new JPanel();
	JPanel ReadingAgriculturePanel2 = new JPanel();
	JPanel ReadingComputerPanel2 = new JPanel();
	JPanel ReadingGovernmentPanel2 = new JPanel();
	JPanel ReadingLiteraturePanel2 = new JPanel();
	JPanel ReadingCRSPanel2 = new JPanel();
	JPanel ReadingCivicPanel2 = new JPanel();
	JPanel ReadingEconomicsPanel2 = new JPanel();
	JPanel ReadingCommercePanel2 = new JPanel();
	JPanel ReadingYorubaPanel2 = new JPanel();
	JPanel ReadingAccountingPanel2 = new JPanel();
	JPanel ReadingMarketingPanel2 = new JPanel();
	
	JPanel ReadingEnglishPanel3 = new JPanel();
	JPanel ReadingMathematicsPanel3 = new JPanel();
	JPanel ReadingPhysicsPanel3 = new JPanel();
	JPanel ReadingChemistryPanel3 = new JPanel();
	JPanel ReadingBiologyPanel3 = new JPanel();
	JPanel ReadingAgriculturePanel3 = new JPanel();
	JPanel ReadingComputerPanel3 = new JPanel();
	JPanel ReadingGovernmentPanel3 = new JPanel();
	JPanel ReadingLiteraturePanel3 = new JPanel();
	JPanel ReadingCRSPanel3 = new JPanel();
	JPanel ReadingCivicPanel3 = new JPanel();
	JPanel ReadingEconomicsPanel3 = new JPanel();
	JPanel ReadingCommercePanel3 = new JPanel();
	JPanel ReadingYorubaPanel3 = new JPanel();
	JPanel ReadingAccountingPanel3 = new JPanel();
	JPanel ReadingMarketingPanel3 = new JPanel();
	
	JPanel COSPanel = new JPanel();
	JPanel COTPanel = new JPanel();
	JPanel COAPanel = new JPanel();
	JPanel COATPanel = new JPanel();
	JPanel COCPanel = new JPanel();
	JPanel COCTPanel = new JPanel();
	
	JPanel CTSPanel = new JPanel();
	JPanel CTTPanel = new JPanel();
	JPanel CTAPanel = new JPanel();
	JPanel CTATPanel = new JPanel();
	JPanel CTCPanel = new JPanel();
	JPanel CTCTPanel = new JPanel();
	
	JPanel CThSPanel = new JPanel();
	JPanel CThTPanel = new JPanel();
	JPanel CThAPanel = new JPanel();
	JPanel CThATPanel = new JPanel();
	JPanel CThCPanel = new JPanel();
	JPanel CThCTPanel = new JPanel();
	
	JPanel English1Topic0 = new JPanel();
	JPanel English1Topic1 = new JPanel();
	JPanel English1Topic2 = new JPanel();
	JPanel English1Topic3 = new JPanel();
	JPanel English1Topic4 = new JPanel();
	JPanel English1Topic5 = new JPanel();
	JPanel English1Topic6 = new JPanel();
	JPanel English1Topic7 = new JPanel();
	JPanel English1Topic8 = new JPanel();
	JPanel English1Topic9 = new JPanel();
	JPanel English1Topic10 = new JPanel();
	JPanel English1Topic11 = new JPanel();
	JPanel English1Topic12 = new JPanel();
	JPanel English1Topic13 = new JPanel();
	JPanel English1Topic14 = new JPanel();
	JPanel English1Topic15 = new JPanel();
	JPanel English1Topic16 = new JPanel();
	JPanel English1Topic17 = new JPanel();
	JPanel English1Topic18 = new JPanel();
	JPanel English1Topic19 = new JPanel();
	JPanel English1Topic20 = new JPanel();
	JPanel English1Topic21 = new JPanel();
	JPanel English1Topic22 = new JPanel();
	JPanel English1Topic23 = new JPanel();
	JPanel English1Topic24 = new JPanel();
	JPanel English1Topic25 = new JPanel();
	JPanel English1Topic26 = new JPanel();
	JPanel English1Topic27 = new JPanel();
	JPanel English1Topic28 = new JPanel();
	JPanel English1Topic29 = new JPanel();
	JPanel English1Topic30 = new JPanel();
	
	JPanel English2Topic0 = new JPanel();
	JPanel English2Topic1 = new JPanel();
	JPanel English2Topic2 = new JPanel();
	JPanel English2Topic3 = new JPanel();
	JPanel English2Topic4 = new JPanel();
	JPanel English2Topic5 = new JPanel();
	JPanel English2Topic6 = new JPanel();
	JPanel English2Topic7 = new JPanel();
	JPanel English2Topic8 = new JPanel();
	JPanel English2Topic9 = new JPanel();
	JPanel English2Topic10 = new JPanel();
	JPanel English2Topic11 = new JPanel();
	JPanel English2Topic12 = new JPanel();
	JPanel English2Topic13 = new JPanel();
	JPanel English2Topic14 = new JPanel();
	JPanel English2Topic15 = new JPanel();
	JPanel English2Topic16 = new JPanel();
	JPanel English2Topic17 = new JPanel();
	JPanel English2Topic18 = new JPanel();
	JPanel English2Topic19 = new JPanel();
	JPanel English2Topic20 = new JPanel();
	JPanel English2Topic21 = new JPanel();
	JPanel English2Topic22 = new JPanel();
	JPanel English2Topic23 = new JPanel();
	JPanel English2Topic24 = new JPanel();
	JPanel English2Topic25 = new JPanel();
	
	JPanel English3Topic0 = new JPanel();
	JPanel English3Topic1 = new JPanel();
	JPanel English3Topic2 = new JPanel();
	JPanel English3Topic3 = new JPanel();
	JPanel English3Topic4 = new JPanel();
	JPanel English3Topic5 = new JPanel();
	JPanel English3Topic6 = new JPanel();
	JPanel English3Topic7 = new JPanel();
	JPanel English3Topic8 = new JPanel();
	JPanel English3Topic10 = new JPanel();
	JPanel English3Topic11 = new JPanel();
	JPanel English3Topic12 = new JPanel();
	JPanel English3Topic13 = new JPanel();
	JPanel English3Topic14 = new JPanel();
	JPanel English3Topic15 = new JPanel();
	JPanel English3Topic16 = new JPanel();
	
	JPanel Mathematics1Topic0 = new JPanel();
	JPanel Mathematics1Topic1 = new JPanel();
	JPanel Mathematics1Topic2 = new JPanel();
	JPanel Mathematics1Topic3 = new JPanel();
	JPanel Mathematics1Topic4 = new JPanel();
	JPanel Mathematics1Topic5 = new JPanel();
	JPanel Mathematics1Topic6 = new JPanel();
	JPanel Mathematics1Topic7 = new JPanel();
	JPanel Mathematics1Topic8 = new JPanel();
	JPanel Mathematics1Topic9 = new JPanel();
	JPanel Mathematics1Topic10 = new JPanel();
	JPanel Mathematics1Topic11 = new JPanel();
	JPanel Mathematics1Topic12 = new JPanel();
	JPanel Mathematics1Topic13 = new JPanel();
	JPanel Mathematics1Topic14 = new JPanel();
	JPanel Mathematics1Topic15 = new JPanel();
	JPanel Mathematics1Topic16 = new JPanel();
	JPanel Mathematics1Topic17 = new JPanel();
	JPanel Mathematics1Topic18 = new JPanel();
	JPanel Mathematics1Topic19 = new JPanel();
	JPanel Mathematics1Topic20 = new JPanel();
	
	JPanel Mathematics2Topic0 = new JPanel();
	JPanel Mathematics2Topic1 = new JPanel();
	JPanel Mathematics2Topic2 = new JPanel();
	JPanel Mathematics2Topic3 = new JPanel();
	JPanel Mathematics2Topic4 = new JPanel();
	JPanel Mathematics2Topic5 = new JPanel();
	JPanel Mathematics2Topic6 = new JPanel();
	JPanel Mathematics2Topic7 = new JPanel();
	JPanel Mathematics2Topic8 = new JPanel();
	JPanel Mathematics2Topic9 = new JPanel();
	JPanel Mathematics2Topic10 = new JPanel();
	JPanel Mathematics2Topic11 = new JPanel();
	JPanel Mathematics2Topic12 = new JPanel();
	JPanel Mathematics2Topic13 = new JPanel();
	JPanel Mathematics2Topic14 = new JPanel();
	JPanel Mathematics2Topic15 = new JPanel();
	JPanel Mathematics2Topic16 = new JPanel();
	
	JPanel Mathematics3Topic0 = new JPanel();
	JPanel Mathematics3Topic1 = new JPanel();
	JPanel Mathematics3Topic2 = new JPanel();
	
	JPanel Physics1Topic0 = new JPanel();
	JPanel Physics1Topic1 = new JPanel();
	JPanel Physics1Topic2 = new JPanel();
	JPanel Physics1Topic3 = new JPanel();
	JPanel Physics1Topic4 = new JPanel();
	JPanel Physics1Topic5 = new JPanel();
	JPanel Physics1Topic6 = new JPanel();
	JPanel Physics1Topic7 = new JPanel();
	JPanel Physics1Topic8 = new JPanel();
	JPanel Physics1Topic9 = new JPanel();
	JPanel Physics1Topic10 = new JPanel();
	JPanel Physics1Topic11 = new JPanel();
	JPanel Physics1Topic12 = new JPanel();
	JPanel Physics1Topic13 = new JPanel();
	JPanel Physics1Topic14 = new JPanel();
	
	JPanel Physics2Topic0 = new JPanel();
	JPanel Physics2Topic1 = new JPanel();
	JPanel Physics2Topic2 = new JPanel();
	JPanel Physics2Topic3 = new JPanel();
	JPanel Physics2Topic4 = new JPanel();
	JPanel Physics2Topic5 = new JPanel();
	JPanel Physics2Topic6 = new JPanel();
	JPanel Physics2Topic7 = new JPanel();
	JPanel Physics2Topic8 = new JPanel();
	JPanel Physics2Topic9 = new JPanel();
	JPanel Physics2Topic10 = new JPanel();
	JPanel Physics2Topic11 = new JPanel();
	JPanel Physics2Topic12 = new JPanel();
	JPanel Physics2Topic13 = new JPanel();
	JPanel Physics2Topic14 = new JPanel();
	JPanel Physics2Topic15 = new JPanel();
	JPanel Physics2Topic16 = new JPanel();
	
	JPanel Physics3Topic0 = new JPanel();
	JPanel Physics3Topic1 = new JPanel();
	JPanel Physics3Topic2 = new JPanel();
	JPanel Physics3Topic3 = new JPanel();
	JPanel Physics3Topic4 = new JPanel();
	JPanel Physics3Topic5 = new JPanel();
	JPanel Physics3Topic6 = new JPanel();
	JPanel Physics3Topic7 = new JPanel();
	JPanel Physics3Topic8 = new JPanel();
	JPanel Physics3Topic9 = new JPanel();
	JPanel Physics3Topic10 = new JPanel();
	JPanel Physics3Topic11 = new JPanel();
	JPanel Physics3Topic12 = new JPanel();
	
	JPanel Chemistry1Topic0 = new JPanel();
	JPanel Chemistry1Topic1 = new JPanel();
	JPanel Chemistry1Topic2 = new JPanel();
	JPanel Chemistry1Topic3 = new JPanel();
	JPanel Chemistry1Topic4 = new JPanel();
	JPanel Chemistry1Topic5 = new JPanel();
	JPanel Chemistry1Topic6 = new JPanel();
	JPanel Chemistry1Topic7 = new JPanel();
	JPanel Chemistry1Topic8 = new JPanel();
	JPanel Chemistry1Topic9 = new JPanel();
	JPanel Chemistry1Topic10 = new JPanel();
	JPanel Chemistry1Topic11 = new JPanel();
	JPanel Chemistry1Topic12 = new JPanel();
	JPanel Chemistry1Topic13 = new JPanel();
	JPanel Chemistry1Topic14 = new JPanel();
	JPanel Chemistry1Topic15 = new JPanel();
	JPanel Chemistry1Topic16 = new JPanel();
	JPanel Chemistry1Topic17 = new JPanel();
	JPanel Chemistry1Topic18 = new JPanel();
	JPanel Chemistry1Topic19 = new JPanel();
	JPanel Chemistry1Topic20 = new JPanel();
	JPanel Chemistry1Topic21 = new JPanel();
	JPanel Chemistry1Topic22 = new JPanel();
	JPanel Chemistry1Topic23 = new JPanel();
	JPanel Chemistry1Topic24 = new JPanel();
	JPanel Chemistry1Topic25 = new JPanel();
	
	JPanel Chemistry2Topic0 = new JPanel();
	JPanel Chemistry2Topic1 = new JPanel();
	JPanel Chemistry2Topic2 = new JPanel();
	JPanel Chemistry2Topic3 = new JPanel();
	JPanel Chemistry2Topic4 = new JPanel();
	JPanel Chemistry2Topic5 = new JPanel();
	JPanel Chemistry2Topic6 = new JPanel();
	JPanel Chemistry2Topic7 = new JPanel();
	JPanel Chemistry2Topic8 = new JPanel();
	JPanel Chemistry2Topic9 = new JPanel();
	JPanel Chemistry2Topic10 = new JPanel();
	JPanel Chemistry2Topic11 = new JPanel();
	JPanel Chemistry2Topic12 = new JPanel();
	JPanel Chemistry2Topic13 = new JPanel();
	
	JPanel Chemistry3Topic0 = new JPanel();
	JPanel Chemistry3Topic1 = new JPanel();
	JPanel Chemistry3Topic2 = new JPanel();
	JPanel Chemistry3Topic3 = new JPanel();
	JPanel Chemistry3Topic4 = new JPanel();
	JPanel Chemistry3Topic5 = new JPanel();
	JPanel Chemistry3Topic6 = new JPanel();
	JPanel Chemistry3Topic7 = new JPanel();
	
	JPanel Biology1Topic0 = new JPanel();
	JPanel Biology1Topic1 = new JPanel();
	JPanel Biology1Topic2 = new JPanel();
	JPanel Biology1Topic3 = new JPanel();
	JPanel Biology1Topic4 = new JPanel();
	JPanel Biology1Topic5 = new JPanel();
	JPanel Biology1Topic6 = new JPanel();
	JPanel Biology1Topic7 = new JPanel();
	JPanel Biology1Topic8 = new JPanel();
	JPanel Biology1Topic9 = new JPanel();
	JPanel Biology1Topic10 = new JPanel();
	
	JPanel Biology2Topic0 = new JPanel();
	JPanel Biology2Topic1 = new JPanel();
	JPanel Biology2Topic2 = new JPanel();
	JPanel Biology2Topic3 = new JPanel();
	JPanel Biology2Topic4 = new JPanel();
	JPanel Biology2Topic5 = new JPanel();
	JPanel Biology2Topic6 = new JPanel();
	JPanel Biology2Topic7 = new JPanel();
	JPanel Biology2Topic8 = new JPanel();
	JPanel Biology2Topic9 = new JPanel();
	JPanel Biology2Topic10 = new JPanel();
	JPanel Biology2Topic11 = new JPanel();
	
	JPanel Biology3Topic0 = new JPanel();
	JPanel Biology3Topic1 = new JPanel();
	JPanel Biology3Topic2 = new JPanel();
	JPanel Biology3Topic3 = new JPanel();
	
	JPanel Agriculture1Topic0 = new JPanel();
	JPanel Agriculture1Topic1 = new JPanel();
	JPanel Agriculture1Topic2 = new JPanel();
	JPanel Agriculture1Topic3 = new JPanel();
	JPanel Agriculture1Topic4 = new JPanel();
	JPanel Agriculture1Topic5 = new JPanel();
	JPanel Agriculture1Topic6 = new JPanel();
	JPanel Agriculture1Topic7 = new JPanel();
	JPanel Agriculture1Topic8 = new JPanel();
	JPanel Agriculture1Topic9 = new JPanel();
	JPanel Agriculture1Topic10 = new JPanel();
	
	JPanel Agriculture2Topic0 = new JPanel();
	JPanel Agriculture2Topic1 = new JPanel();
	JPanel Agriculture2Topic2 = new JPanel();
	JPanel Agriculture2Topic3 = new JPanel();
	JPanel Agriculture2Topic4 = new JPanel();
	JPanel Agriculture2Topic5 = new JPanel();
	JPanel Agriculture2Topic6 = new JPanel();
	JPanel Agriculture2Topic7 = new JPanel();
	JPanel Agriculture2Topic8 = new JPanel();
	JPanel Agriculture2Topic9 = new JPanel();
	JPanel Agriculture2Topic10 = new JPanel();
	JPanel Agriculture2Topic11 = new JPanel();
	JPanel Agriculture2Topic12 = new JPanel();
	JPanel Agriculture2Topic13 = new JPanel();
	JPanel Agriculture2Topic14 = new JPanel();
	JPanel Agriculture2Topic15 = new JPanel();
	
	JPanel Agriculture3Topic0 = new JPanel();
	JPanel Agriculture3Topic1 = new JPanel();
	JPanel Agriculture3Topic2 = new JPanel();
	JPanel Agriculture3Topic3 = new JPanel();
	JPanel Agriculture3Topic4 = new JPanel();
	JPanel Agriculture3Topic5 = new JPanel();
	JPanel Agriculture3Topic6 = new JPanel();
	JPanel Agriculture3Topic7 = new JPanel();
	JPanel Agriculture3Topic8 = new JPanel();
	JPanel Agriculture3Topic9 = new JPanel();
	JPanel Agriculture3Topic10 = new JPanel();
	JPanel Agriculture3Topic11 = new JPanel();
	JPanel Agriculture3Topic12 = new JPanel();
	JPanel Agriculture3Topic13 = new JPanel();
	JPanel Agriculture3Topic14 = new JPanel();
	
	JPanel Geography1Topic0 = new JPanel();
	JPanel Geography1Topic1 = new JPanel();
	JPanel Geography1Topic2 = new JPanel();
	JPanel Geography1Topic3 = new JPanel();
	JPanel Geography1Topic4 = new JPanel();
	JPanel Geography1Topic5 = new JPanel();
	JPanel Geography1Topic6 = new JPanel();
	JPanel Geography1Topic7 = new JPanel();
	JPanel Geography1Topic8 = new JPanel();
	
	JPanel Computer1Topic0 = new JPanel();
	JPanel Computer1Topic1 = new JPanel();
	JPanel Computer1Topic2 = new JPanel();
	JPanel Computer1Topic3 = new JPanel();
	JPanel Computer1Topic4 = new JPanel();
	JPanel Computer1Topic5 = new JPanel();
	JPanel Computer1Topic6 = new JPanel();
	JPanel Computer1Topic7 = new JPanel();
	
	JPanel Computer2Topic0 = new JPanel();
	JPanel Computer2Topic1 = new JPanel();
	JPanel Computer2Topic2 = new JPanel();
	JPanel Computer2Topic3 = new JPanel();
	JPanel Computer2Topic4 = new JPanel();
	JPanel Computer2Topic5 = new JPanel();
	JPanel Computer2Topic6 = new JPanel();
	JPanel Computer2Topic7 = new JPanel();
	JPanel Computer2Topic8 = new JPanel();
	JPanel Computer2Topic9 = new JPanel();
	JPanel Computer2Topic10 = new JPanel();
	JPanel Computer2Topic11 = new JPanel();
	JPanel Computer2Topic12 = new JPanel();
	JPanel Computer2Topic13 = new JPanel();
	JPanel Computer2Topic14 = new JPanel();
	JPanel Computer2Topic15 = new JPanel();
	JPanel Computer2Topic16 = new JPanel();
	JPanel Computer2Topic17 = new JPanel();
	
	JPanel Computer3Topic0 = new JPanel();
	JPanel Computer3Topic1 = new JPanel();
	
	JPanel Government1Topic0 = new JPanel();
	JPanel Government1Topic1 = new JPanel();
	JPanel Government1Topic2 = new JPanel();
	JPanel Government1Topic3 = new JPanel();
	JPanel Government1Topic4 = new JPanel();
	JPanel Government1Topic5 = new JPanel();
	JPanel Government1Topic6 = new JPanel();
	JPanel Government1Topic7 = new JPanel();
	JPanel Government1Topic8 = new JPanel();
	
	JPanel Government2Topic0 = new JPanel();
	JPanel Government2Topic1 = new JPanel();
	JPanel Government2Topic2 = new JPanel();
	JPanel Government2Topic3 = new JPanel();
	JPanel Government2Topic4 = new JPanel();
	JPanel Government2Topic5 = new JPanel();
	JPanel Government2Topic6 = new JPanel();
	JPanel Government2Topic7 = new JPanel();
	JPanel Government2Topic8 = new JPanel();
	
	JPanel Government3Topic0 = new JPanel();
	JPanel Government3Topic1 = new JPanel();
	
	JPanel Literature1Topic0 = new JPanel();
	JPanel Literature1Topic1 = new JPanel();
	JPanel Literature1Topic2 = new JPanel();
	JPanel Literature1Topic3 = new JPanel();
	JPanel Literature1Topic4 = new JPanel();
	JPanel Literature1Topic5 = new JPanel();
	
	JPanel Literature2Topic0 = new JPanel();
	JPanel Literature2Topic1 = new JPanel();
	JPanel Literature2Topic2 = new JPanel();
	JPanel Literature2Topic3 = new JPanel();
	JPanel Literature2Topic4 = new JPanel();
	JPanel Literature2Topic5 = new JPanel();
	JPanel Literature2Topic6 = new JPanel();
	
	JPanel Literature3Topic0 = new JPanel();
	JPanel Literature3Topic1 = new JPanel();
	JPanel Literature3Topic2 = new JPanel();
	JPanel Literature3Topic3 = new JPanel();
	JPanel Literature3Topic4 = new JPanel();
	JPanel Literature3Topic5 = new JPanel();
	JPanel Literature3Topic6 = new JPanel();
	
	JPanel CRS1Topic0 = new JPanel();
	JPanel CRS1Topic1 = new JPanel();
	JPanel CRS1Topic2 = new JPanel();
	JPanel CRS1Topic3 = new JPanel();
	JPanel CRS1Topic4 = new JPanel();
	JPanel CRS1Topic5 = new JPanel();
	JPanel CRS1Topic6 = new JPanel();
	JPanel CRS1Topic7 = new JPanel();
	JPanel CRS1Topic8 = new JPanel();
	JPanel CRS1Topic9 = new JPanel();
	JPanel CRS1Topic10 = new JPanel();
	JPanel CRS1Topic11 = new JPanel();
	
	JPanel Yoruba1Topic0 = new JPanel();
	JPanel Yoruba1Topic1 = new JPanel();
	JPanel Yoruba1Topic2 = new JPanel();
	JPanel Yoruba1Topic3 = new JPanel();
	JPanel Yoruba1Topic4 = new JPanel();
	JPanel Yoruba1Topic5 = new JPanel();
	JPanel Yoruba1Topic6 = new JPanel();
	JPanel Yoruba1Topic7 = new JPanel();
	JPanel Yoruba1Topic8 = new JPanel();
	
	JPanel Yoruba2Topic0 = new JPanel();
	JPanel Yoruba2Topic1 = new JPanel();
	JPanel Yoruba2Topic2 = new JPanel();
	JPanel Yoruba2Topic3 = new JPanel();
	JPanel Yoruba2Topic4 = new JPanel();
	JPanel Yoruba2Topic5 = new JPanel();
	JPanel Yoruba2Topic6 = new JPanel();
	JPanel Yoruba2Topic7 = new JPanel();
	JPanel Yoruba2Topic8 = new JPanel();
	
	JPanel Civic1Topic0 = new JPanel();
	JPanel Civic1Topic1 = new JPanel();
	JPanel Civic1Topic2 = new JPanel();
	JPanel Civic1Topic3 = new JPanel();
	JPanel Civic1Topic4 = new JPanel();
	JPanel Civic1Topic5 = new JPanel();
	JPanel Civic1Topic6 = new JPanel();
	JPanel Civic1Topic7 = new JPanel();
	
	JPanel Civic2Topic0 = new JPanel();
	JPanel Civic2Topic1 = new JPanel();
	JPanel Civic2Topic2 = new JPanel();
	JPanel Civic2Topic3 = new JPanel();
	JPanel Civic2Topic4 = new JPanel();
	JPanel Civic2Topic5 = new JPanel();
	JPanel Civic2Topic6 = new JPanel();
	JPanel Civic2Topic7 = new JPanel();
	JPanel Civic2Topic8 = new JPanel();
	JPanel Civic2Topic9 = new JPanel();
	JPanel Civic2Topic10 = new JPanel();
	
	JPanel Civic3Topic0 = new JPanel();
	JPanel Civic3Topic1 = new JPanel();
	
	JPanel Economics1Topic0 = new JPanel();
	JPanel Economics1Topic1 = new JPanel();
	JPanel Economics1Topic2 = new JPanel();
	JPanel Economics1Topic3 = new JPanel();
	JPanel Economics1Topic4 = new JPanel();
	JPanel Economics1Topic5 = new JPanel();
	JPanel Economics1Topic6 = new JPanel();
	JPanel Economics1Topic7 = new JPanel();
	JPanel Economics1Topic8 = new JPanel();
	JPanel Economics1Topic9 = new JPanel();
	
	JPanel Economics2Topic0 = new JPanel();
	JPanel Economics2Topic1 = new JPanel();
	JPanel Economics2Topic2 = new JPanel();
	JPanel Economics2Topic3 = new JPanel();
	JPanel Economics2Topic4 = new JPanel();
	JPanel Economics2Topic5 = new JPanel();
	JPanel Economics2Topic6 = new JPanel();
	JPanel Economics2Topic7 = new JPanel();
	JPanel Economics2Topic8 = new JPanel();
	JPanel Economics2Topic9 = new JPanel();
	JPanel Economics2Topic10 = new JPanel();
	JPanel Economics2Topic11 = new JPanel();
	JPanel Economics2Topic12 = new JPanel();
	JPanel Economics2Topic13 = new JPanel();
	JPanel Economics2Topic14 = new JPanel();
	JPanel Economics2Topic15 = new JPanel();
	JPanel Economics2Topic16 = new JPanel();
	
	JPanel Economics3Topic0 = new JPanel();
	JPanel Economics3Topic1 = new JPanel();
	JPanel Economics3Topic2 = new JPanel();
	JPanel Economics3Topic3 = new JPanel();
	JPanel Economics3Topic4 = new JPanel();
	JPanel Economics3Topic5 = new JPanel();
	JPanel Economics3Topic6 = new JPanel();
	JPanel Economics3Topic7 = new JPanel();
	JPanel Economics3Topic8 = new JPanel();
	JPanel Economics3Topic9 = new JPanel();
	JPanel Economics3Topic10 = new JPanel();
	JPanel Economics3Topic11 = new JPanel();
	JPanel Economics3Topic12= new JPanel();
	
	JPanel Commerce1Topic0 = new JPanel();
	JPanel Commerce1Topic1 = new JPanel();
	JPanel Commerce1Topic2 = new JPanel();
	JPanel Commerce1Topic3 = new JPanel();
	JPanel Commerce1Topic4 = new JPanel();
	JPanel Commerce1Topic5 = new JPanel();
	JPanel Commerce1Topic6 = new JPanel();
	JPanel Commerce1Topic7 = new JPanel();
	JPanel Commerce1Topic8 = new JPanel();
	JPanel Commerce1Topic9 = new JPanel();
	
	JPanel Commerce2Topic0 = new JPanel();
	JPanel Commerce2Topic1 = new JPanel();
	JPanel Commerce2Topic2 = new JPanel();
	JPanel Commerce2Topic3 = new JPanel();
	JPanel Commerce2Topic4 = new JPanel();
	JPanel Commerce2Topic5 = new JPanel();
	JPanel Commerce2Topic6 = new JPanel();
	JPanel Commerce2Topic7 = new JPanel();
	JPanel Commerce2Topic8 = new JPanel();
	JPanel Commerce2Topic9 = new JPanel();
	JPanel Commerce2Topic10 = new JPanel();
	JPanel Commerce2Topic11 = new JPanel();
	JPanel Commerce2Topic12 = new JPanel();
	JPanel Commerce2Topic13 = new JPanel();
	JPanel Commerce2Topic14 = new JPanel();
	
	JPanel Commerce3Topic0 = new JPanel();
	JPanel Commerce3Topic1 = new JPanel();
	
	JPanel Accounting1Topic0 = new JPanel();
	JPanel Accounting1Topic1 = new JPanel();
	JPanel Accounting1Topic2 = new JPanel();
	JPanel Accounting1Topic3 = new JPanel();
	JPanel Accounting1Topic4 = new JPanel();
	JPanel Accounting1Topic5 = new JPanel();
	JPanel Accounting1Topic6 = new JPanel();
	JPanel Accounting1Topic7 = new JPanel();
	JPanel Accounting1Topic8 = new JPanel();
	
	JPanel Accounting2Topic0 = new JPanel();
	JPanel Accounting2Topic1 = new JPanel();
	JPanel Accounting2Topic2 = new JPanel();
	JPanel Accounting2Topic3 = new JPanel();
	JPanel Accounting2Topic4 = new JPanel();
	JPanel Accounting2Topic5 = new JPanel();
	JPanel Accounting2Topic6 = new JPanel();
	JPanel Accounting2Topic7 = new JPanel();
	JPanel Accounting2Topic8 = new JPanel();
	
	JPanel Accounting3Topic0 = new JPanel();
	JPanel Accounting3Topic1 = new JPanel();
	
	JPanel Marketing1Topic0 = new JPanel();
	JPanel Marketing1Topic1 = new JPanel();
	JPanel Marketing1Topic2 = new JPanel();
	JPanel Marketing1Topic3 = new JPanel();
	JPanel Marketing1Topic4 = new JPanel();
	JPanel Marketing1Topic5 = new JPanel();
	JPanel Marketing1Topic6 = new JPanel();
	JPanel Marketing1Topic7 = new JPanel();
	JPanel Marketing1Topic8 = new JPanel();
	JPanel Marketing1Topic9 = new JPanel();
	
	JPanel Marketing2Topic0 = new JPanel();
	JPanel Marketing2Topic1 = new JPanel();
	JPanel Marketing2Topic2 = new JPanel();
	JPanel Marketing2Topic3 = new JPanel();
	JPanel Marketing2Topic4 = new JPanel();
	JPanel Marketing2Topic5 = new JPanel();
	JPanel Marketing2Topic6 = new JPanel();
	JPanel Marketing2Topic7 = new JPanel();
	JPanel Marketing2Topic8 = new JPanel();
	JPanel Marketing2Topic9 = new JPanel();
	
	JPanel Marketing3Topic0 = new JPanel();
	JPanel Marketing3Topic1 = new JPanel();
	
	JButton class1 = new JButton();
	JButton class2 = new JButton();
	JButton class3 = new JButton();
	JButton back1 = new JButton("<<< Back");
	JButton Aback1 = new JButton("<<< Back");
	JButton Cback1 = new JButton("<<< Back");
	JButton back2= new JButton("<<< back");
	JButton Aback2 = new JButton("<<< Back");
	JButton Cback2 = new JButton("<<< Back");
	JButton back3 = new JButton("<<< back");
	JButton Aback3 = new JButton("<<< Back");
	JButton Cback3 = new JButton("<<< Back");
	JButton english = new JButton("English");
	JButton mathematics = new JButton("Mathematics");
	JButton physics = new JButton("Physics");
	JButton chemistry = new JButton("Chemistry");
	JButton biology = new JButton("Biology");
	JButton agriculture = new JButton("agriculture");
	JButton geography = new JButton("Geography");
	JButton computer = new JButton("Computer Science");
	JButton crs = new JButton("C.R.S.");
	JButton yoruba = new JButton("Yoruba");
	JButton economics = new JButton("Economics");
	JButton government = new JButton("government");
	JButton literature = new JButton("Literature");
	JButton civic = new JButton("Civic Edu.");
	JButton marketing = new JButton("Marketing");
	JButton accounting = new JButton("Accounting");
	JButton commerce = new JButton("Commerce");
	
	JButton english2 = new JButton("English");
	JButton mathematics2 = new JButton("Mathematics");
	JButton physics2 = new JButton("Physics");
	JButton chemistry2 = new JButton("Chemistry");
	JButton biology2 = new JButton("Biology");
	JButton agriculture2 = new JButton("agriculture");
	JButton computer2 = new JButton("Computer Science");
	JButton crs2 = new JButton("C.R.S.");
	JButton yoruba2 = new JButton("Yoruba");
	JButton economics2 = new JButton("Economics");
	JButton government2 = new JButton("government");
	JButton literature2 = new JButton("Literature");
	JButton civic2 = new JButton("Civic Edu.");
	JButton marketing2 = new JButton("Marketing");
	JButton accounting2 = new JButton("Accounting");
	JButton commerce2 = new JButton("Commerce");
	
	JButton english3 = new JButton("English");
	JButton mathematics3 = new JButton("Mathematics");
	JButton physics3 = new JButton("Physics");
	JButton chemistry3 = new JButton("Chemistry");
	JButton biology3 = new JButton("Biology");
	JButton agriculture3 = new JButton("Agriculture");
	JButton computer3 = new JButton("Computer Science");
	JButton crs3 = new JButton("C.R.S.");
	JButton yoruba3 = new JButton("Yoruba");
	JButton economics3 = new JButton("Economics");
	JButton government3 = new JButton("government");
	JButton literature3 = new JButton("Literature");
	JButton civic3 = new JButton("Civic Edu.");
	JButton marketing3 = new JButton("Marketing");
	JButton accounting3 = new JButton("Accounting");
	JButton commerce3 = new JButton("Commerce");
	
	Listener work = new Listener();
	EnglishListener englishlistener = new EnglishListener();
	MathematicsListener mathslistener = new MathematicsListener();
	
	ImageIcon Image1 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/welcome.png");
	ImageIcon image1 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/class1.jpg");
	ImageIcon image2 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/class2.jpg");
	ImageIcon image3 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/class3.jpg");
	ImageIcon department1 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/department1.png");
	ImageIcon department2 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/department2.png");
	ImageIcon department3 = new ImageIcon("C:/Users/B.BLESSING/Pictures/edit/department3.png");
	
	CardLayout Card = new CardLayout();
	CardLayout SubjectCard = new CardLayout();
	CardLayout ASubjectCard = new CardLayout();
	CardLayout CSubjectCard = new CardLayout();
	CardLayout SubjectCard2 = new CardLayout();
	CardLayout ASubjectCard2 = new CardLayout();
	CardLayout CSubjectCard2 = new CardLayout();
	CardLayout SubjectCard3 = new CardLayout();
	CardLayout ASubjectCard3 = new CardLayout();
	CardLayout CSubjectCard3 = new CardLayout();
	CardLayout readingExamCard = new CardLayout();
	CardLayout English1Card = new CardLayout();
	CardLayout Mathematics1Card = new CardLayout();
	CardLayout Physics1Card = new CardLayout();
	CardLayout Chemistry1Card = new CardLayout();
	CardLayout Biology1Card = new CardLayout();
	CardLayout Agriculture1Card = new CardLayout();
	CardLayout Geography1Card = new CardLayout();
	CardLayout Computer1Card = new CardLayout();
	CardLayout CRS1Card = new CardLayout();
	CardLayout Yoruba1Card = new CardLayout();
	CardLayout Economics1Card = new CardLayout();
	CardLayout Government1Card = new CardLayout();
	CardLayout Literature1Card = new CardLayout();
	CardLayout Civic1Card = new CardLayout();
	CardLayout Marketing1Card = new CardLayout();
	CardLayout Accounting1Card = new CardLayout();
	CardLayout Commerce1Card = new CardLayout();
	CardLayout English2Card = new CardLayout();
	CardLayout Mathematics2Card = new CardLayout();
	CardLayout Physics2Card = new CardLayout();
	CardLayout Chemistry2Card = new CardLayout();
	CardLayout Biology2Card = new CardLayout();
	CardLayout Agriculture2Card = new CardLayout();
	CardLayout Computer2Card = new CardLayout();
	CardLayout CRS2Card = new CardLayout();
	CardLayout Yoruba2Card = new CardLayout();
	CardLayout Economics2Card = new CardLayout();
	CardLayout Government2Card = new CardLayout();
	CardLayout Literature2Card = new CardLayout();
	CardLayout Civic2Card = new CardLayout();
	CardLayout Marketing2Card = new CardLayout();
	CardLayout Accounting2Card = new CardLayout();
	CardLayout Commerce2Card = new CardLayout();
	CardLayout English3Card = new CardLayout();
	CardLayout Mathematics3Card = new CardLayout();
	CardLayout Physics3Card = new CardLayout();
	CardLayout Chemistry3Card = new CardLayout();
	CardLayout Biology3Card = new CardLayout();
	CardLayout Agriculture3Card = new CardLayout();
	CardLayout Geography3Card = new CardLayout();
	CardLayout Computer3Card = new CardLayout();
	CardLayout CRS3Card = new CardLayout();
	CardLayout Yoruba3Card = new CardLayout();
	CardLayout Economics3Card = new CardLayout();
	CardLayout Government3Card = new CardLayout();
	CardLayout Literature3Card = new CardLayout();
	CardLayout Civic3Card = new CardLayout();
	CardLayout Marketing3Card = new CardLayout();
	CardLayout Accounting3Card = new CardLayout();
	CardLayout Commerce3Card = new CardLayout();
	
	JTabbedPane tabPaneClass1 = new JTabbedPane();
	JTabbedPane tabPaneClass2 = new JTabbedPane();
	JTabbedPane tabPaneClass3 = new JTabbedPane();

	JList EnglishList = new JList(new Object[] {"English Alphabets","The consonant sounds: /j/ and /z/","Revision of common nouns","Uses of capital letter","Narrative composition/essay","Reading comprehension","Vocabulary development: words related to agriculture","Sentences","Expository essay","Reading comprehension","The consonant /w/","Noun Phrase","Reading comprehension","Summary writing","Countable/uncountable nouns","Writing: Popular articla for various reading audience","Syllabic consonants","Reading Comprehension","More on summary writing","Pronouns(Introduction)","Vocabulary development","Words associated with religion","Regular and irregular verbs","Reading comprehesion","Consonant clusters","Pronouns (other types)","Formal letter","Speech writing","Semi-formal letter","Differences between phrases and clauses","Examination"});
	JList MathsList = new JList(new Object[] {"Number base system","Modular arithmetic","Fractions, Decimals and Approximations","Indices","Logarithms","Sequence and Series","Sets","Change of subject of formulea and variation","Surds","Positive and negative integers, rational numbers","Percentages","Quadratic equatioins","Logical reasoning","Basic geometrical constructions","constructions: Quadrilaterals and loci","Basic geometric theorems","Trigonometry","Plane shapes: mensuration","Surface area and volume of solid shapes","Statistics","Examination"});
	JList PhyList = new JList(new Object[] {"Introduction to Physics","Work, Energy and Power","Standard units, electric charge, fundamental, derived quantities and dimension analysis","TIME: Concepts of time, Ways of measuring time i.e Both old and modern methods","Motion in nature","Friction","POSITION: Distance, Displacement, Speed, Velocity and Distance-Time Graph","Rectiline acceleration","Upthrust and Archimedes' principle. Laws of Floatation","Density, Relative Density","Pressure: Definition, Formulae and Practical Application","Work, Enerny and Power","Viscosity","Field concept and types of field","Examination"});
	JList ChmList = new JList(new Object[] {"Introduction To Chemistry","Nature of matter","Elements","Particulate nature of matter","The relative atomic masses of elements","Compounds","IUPAC Nomenclature of chemical compounds","Mixture","Mole Concept","Mole concept in terms of masses number, volumes of reactants and productis","Writing and balancing of chemical equations","Chemicalaws","Chemical combinations or bonding","Kinetic theory of matter","Gas Law","Air","Acids","Bases and Alkalis","Salts","Acidity and Alkalinity","Carbon","Oxides of Carbon","Tricarbonates","Hydrocarbons","Chemical Industries","Examination"});
	JList GeoList = new JList(new Object[] {"Introduction to Geography","The solar energy","The Earth","Latitude and Longitude","Earth's Structure","Rocks","Basic Concept of Geographic infromation system (GIS)","Major landforms features","Examination"});
	JList BioList = new JList(new Object[] {"Recognising Living Things","Living Things and Non-Living Things","Classification of Living Things","Organisation of Life","Plant nutrition","Nutrient Cycling in nature","Nutrition in Animals","Modes of nutrition","Basic Ecological concept","Growth","Examination"});
	JList AgroList = new JList(new Object[] {"Meaning and importance of Agriculture","Problems of Agricultural development and Possible Solutions","Subsistence and commercial agriculture","Roles of Government and Non-Governmental Organizations in Agricultural Development","Roles of Science and Technology in agriculture","Agro Allied Industries and their relationship with agriculture","Agricultural Reforms","Land and its uses","Environmental Factors affecting agricultural production","Classification of Crops","Examination"});
	JList ComputerList = new JList(new Object[] {"Overview of a Computer System","History of Computer","Input Devices","Basic functions and uses of Computer","Basic Computer Language","Computer Hardware and Software","Output Devices (Printer)","Examination"});
	JList GovernmentList = new JList(new Object[] {"Meaning and scope of the subject matter","The State and its features","Basic Concepts of Government","Legitimacy and Sovereignty","Democracy","Communism, Socialism and Capitalism","Types and Characteristics of Government","Communalix, Feudalism, Fascism and Totalitarianis.","Examination"});
	JList CRSList = new JList(new Object[] {"Who is God?","God's Creation","Supremacy of Man over other creatures","How Human Beings share in God's creative activities","Marriage","Evolution","The Old-Testament","The New-Testament","Disobedience","The Ten Commandments","Reconciliation","Examination"});
	JList YorubaList = new JList(new Object[] {"Isori oro (Oro oruko, Oro Aropo-Oruko ati Oro Aropo-afarajoruko)","Ede: Owe ati Akanlo Ede","Litireso: Itan aroso/oloro geere","Asa: Itoju oyun ati omo ikoko","Aroko: Soro-n-gberi ati alariyanjiyan","Aale pipa (Aroko)","Isori oro (Oro aponla, Oro apejuwe ati oro asopo","Asa Oge sise","Examination"});
	JList EconomicsList = new JList(new Object[] {"Division of Labour","Scale of Production (Small, Medium and Large","Firm and Industry","Business Organization","Joint stock companies","Public enterprises","Population","Theories of Population","Labour Market","Examination"});
	JList CivicList = new JList(new Object[] {"Introduction to Civic Education","Values","Community Services and its values","HIV/AIDS","Youth Empowerment","Goals of Citizenship Education","Nationalism","Examination"});
	JList LiteratureList = new JList(new Object[] {"Meaning of Literature-In-English","Sources of Literature","The purpose of Literature","Genre of Literature","Prose","Examination"});
	JList MarketingList = new JList(new Object[] {"Introduction to Marketing","Marketing Concepts","Marketing Mix and Marketing Environment","Products","Markets","Consumer and Organizational Behaviour","Marketing Planning and Research","Pricing","Advertising","Examination"});
	JList CommerceList = new JList(new Object[] {"Explanation of retail trade","Characteristics, Avantages and Disadvantages of each type of Small-Scale retailing","Avantags and Disadvantages of each type of Large Scale retailer","Modern Trends in retailing","WholeSale Trade","Arguments for and Against elimination and survival of wholesalers channel of distribution","Foreign Trade","Balance of Payment and counter trade","Documents used in foreign trade and their process","Examination"});
	JList AccountingList = new JList(new Object[] {"Discounts","Three Column Cash Book","Petty-Cash Book","Posting subsidiary books into ledgers","Trial Balance","Trading Account","Profit and Loss Account","Balance sheet","Examination"});
	
	
	JList YorubaList2 = new JList(new Object[] {"Onka ni ile Yoruba","Wuren Onitumo Girama","Ounje ile wa","Ipolowo oja","Elegbejegbe tabi irosiro","Ogun jija nile Yoruba","Oro Ayalo","Kika iwe Litireso","Examination"});
	JList EnglishList2 = new JList(new Object[] {"Speech work","Vocabulary development: Medicine","Noun phrase: position and functions","Listening skils: recording work","Vocabulary development: Words associated with health","Pronouns","Expository essay","Nominalisation of adjectives","Speech writing","Argumentative essay","The unstressed vowel: /a/","Consonant cluster","Adjectives and adverbs","Summary writing","Consonant cluster in word initial position","Adjectival phrases and their grammatical functions","Sentences","Creative writing","Narrative essay","Adverbial phrases and functioins","Formal Letters","Vowel sounds: /u/,/u:/,/i/,/i:/,/e/ and /a:/","Reading comprehension","Dipthongs: /ei/, /ai/, /au/ and /ua/","Reading comprehension","Examination"});
	JList MarketingList2 = new JList(new Object[] {"Seles Promotion","Merchandising","Distribution","Transportation","Warehousing","Market Unions and Facilitators","Internation Marketing","ICT in Marketing","Entrepreneurship in Marketing","Examination"});
	JList ChmList2 = new JList(new Object [] {"Electronic structure of the atom and periodicity of properties of elements","Electrical nature of chemical substances","Types of reaction","Energy changes in chemical reactions","Rates of reaction","Chemical equilibrium","Air and pollution","Wate and solutions","Volumetric analysis","Hydrogen","Oxygen and its compounds","Sulphur and its compounds","Halogens and their compounds","Examination"});
	JList PhyList2 = new JList(new Object [] {"Pressure in Fluids","Simple Harmonic Motion (S.H.M.)","Newton's Laws of motion","Machines","Heat energy: Measurement of Temperature","Measurement of Heat Energy","Ges Laws","Waves","Reflectin of light waves","Refraction of Light waves at plane surfaces","Optical instruments: Applications","Propagation of sound waves","Electromagnetic waves","Examination"});
	JList MathsList2 = new JList(new Object [] {"Algebraic expressions","Simple Operations on algebraic expressions","Solution of Linear Equations","Change of Subject of formula/Relation","Quadratic Equations","Graphs of Linear and Quadratic functions.","Linear Inequalities","Algebraic Fractions","Lengths and Perimeters","Areas","Volumes","Angles","Angles and intercepts on parallel lines","Triangles and Polygons","Circles","Introductory Calculus","Examination"});
	JList GeoList2 = new JList();
	JList BioList2 = new JList(new Object[] {"Concept of Living","Organization of life","Forms in which living cells exist","The Cell and its Environment I","The Cell and its Environment II","The Cell and its Environment II","Plant and Animal Nutrition","Basic Ecological Concepts","Basic Ecological Concepts","Conservation of Natural Resources","Variation in Population","Examination"});
	JList AgroList2 = new JList(new Object[] {"Crop production","Forestry","Ornamental Plants","Crop Protection","Types and classification of farm animals","Anatomy and physiology of farm animals","Animal Reproduction","Environmental Physiology","Livestock management","Animal nutirtion","Rangeland and pasture management","Animal improvement","Animal health management","Aquaculture","Apiculture or Bee Keeping","Examination"});
	JList ComputerList2 = new JList(new Object[] {"Concept of Computer Files","Handling Computer Files","Booting and shutting down process","Computer Data Conversion","Communication System","Application areas of ICT","Internet","Electronic Mail (e-mail) Services","Networking","Introduction to World Wide Web (W.W.W.)","Cables and Connectors","Programming Language","High Level Languages","Algorithm and Flowchart","Basic Programming","System Development Cycle","Program Development Cycle","Examination"});
	JList GovernmentList2 = new JList(new Object[] {"Constitutional Development in Nigeria During the Pre-independence","Constitutional Developments Leading to Independence and After","Nigerian Federalism","Development of Political Parties in Nigeria","Majour Political crises in Nigeria","Military rule in Nigeria","Nigeria and the World","International Organisations","Examinatioin"});
	JList CRSList2 = new JList();
	JList CommerceList2 = new JList(new Object[] {"Home Trade","Foreign Trade","Purchase and sale of goods in Home and Foreign Trade","Finance and Financial Institutions:- Money","Finance and Financial Institutions:- Banks","Finance and Financial Institutions:- Insurance","Finance and Financial Institutions:- Capital Market","Finance and Financial Institutions:- Stock Exchange (first tier)","Finance and Financial Institutions:- Commodity Exchange","Transport","Tourism","Communication","Ware-housing","Advertising","Introduction to marketing"});
	JList EconomicsList2 = new JList(new Object[] {"Financial Institution","Regulatory Agencies of Financial Institution","Money","Instruments of Business Finance","Channels of Distribution","Concept of Demand and Supply","Price Determination","Cost Concepts","Revenue Concept","Theory of Production","Theory of Consumer Behaviour (Utility Theory)","Market Structure","Industries in Nigeria","Fiscal Policy (Public Finance)","Balanced and Unbalanced Budget","National Income Accounting","Examination"});
	JList CivicList2 = new JList(new Object[] {"Cultism","Drugs and Drug Abuse","Human Trafficking","Hiv/Aids","Youth Empowerment","Structure and Functions of Government","Democracy, Rule of Law and National Development","Political Apathy","Civil Society and Popular Participation","Public Service in Democracy","Examination"});
	JList LiteratureList2 = new JList(new Object[] {"African Poetry:- Birago Drop === Vanity ===","African Poetry:- Gbemisola Adeoti === Ambush===","African Poetry:- Gabriel Okara === Piano and Drums ===","African Poetry:- Gbanabam Hallowell === The Dinning Table ===","African Poetry:- Lenrie Peter === The Panic of Growing Older ===","African Poetry:- Kofi Awoonor === The Anvil and the Hammer===","Examination"});
	JList AccountingList2 = new JList(new Object[] {"Single Entry and Incomplete Records","Accounts of Not-For-Profit Making Organizations","Partnership Accounts","Company Accounts","Departmental and Branch Accounts","Public Sector Accounting","Miscellaneous Accounts","Financial system","Examination"});
	
	JList EnglishList3 = new JList(new Object[] {"Expository essay (Revision)","Noun and Noun phrase (Revision)","Consonants (Revision)","Intonation","Vocabulary development: Words associated with administration and government","Listening to oral presentation","Sentence analysis - simple, compound and complex sentences","Summary writing","Idioms/Idiomatic expressions","Word stress/stress pattern","Words with three consonant cluster","Reading comprehensioin","Grammatical names and functions","Concord","Emphatic stress","Collocation","Examination"});
	JList YorubaList3 = new JList(new Object[] {""});
	JList ChmList3 = new JList(new Object[] {"Nitrogen and its compounds","Introduction to organic chemistry","Alkanols, Alkanoic and Alkanoates","Carbohydrates and giant molecules","Metals and their compouuds","Extraction and properties of transition metals","Radioactivity","Examination."});
	JList MarketingList3 = new JList(new Object[] {"Revision","Examination"});
	JList PhyList3 = new JList(new Object[] {"General properties of fields","Gravitational field","Electric field I:- Charges","Electric field II:- Current Electricity","Magnetic Field","Electromagnetic fields","Simple alternating current (A.C.)","Models of Atom and Nuclear physics","Energy Quantization","Electrical conduction through liquid and gases","Wave particle paradox","Fundamentals of electronics","Examination"});
	JList MathsList3 = new JList(new Object[] {"Statistics and Probability","Examination"});
	JList GeoList3 = new JList();
	JList BioList3 = new JList(new Object[] {"Biology of Heredity (Genetics)","Adaptation for survival and Evolution","Practical Biology","Examination"});
	JList AgroList3 = new JList(new Object[] {"Basic economic principles","Factors of production","Principles of demand","Principles of supply","Implications of demand and supply for agricultural production","Functions of a farm manager","Problems managers","Agricultural finance","Farm records and accounts","Marketing of agricultural products","Agricultural insurance","Agricultural extension","Agricultural Ecology","Practical Agricultural Science","Examination"});
	JList ComputerList3 = new JList(new Object[] {"Practicals and Revision","Examination"});
	JList GovernmentList3 = new JList(new Object[] {"Revision","Examination"});
	JList CRSList3 = new JList();
	JList CommerceList3 = new JList(new Object[] {"Revision","Examination"});
	JList EconomicsList3 = new JList(new Object[] {"Busines Organisation (Introduction)","Business Organisation (Sole Proprietorship)","Business Organisation (Partnership)","Business Organisation (Limited Liability Companies)","Business Organisation (Public Corporations)","Business Organisation (Co-operative Societies)","Human Capital Development","Manufacturing and Construction Industries","Services Industries","Petroleum and Nigerian Economy","International Trade","Balance of Payment (BOP)","Examination"});
	JList CivicList3 = new JList(new Object[] {"Revision","Examination"});
	JList LiteratureList3 = new JList(new Object[] {"Non-African Poetry:- Alfred Tennyson === Crossing the Bar ===","Non-African Peotry:- George Herbert === The Pulley ===","Non-African Poetry:- William Blake === The School Boy ===","Non-African Poetry:- William Morris === The Proud King ===","Non-African Poetry:- Robert Frost Birches === Birches ===","Non-African Poetry:- William Shakespeare === Shall I compare thee to a Summer's Day? ===","Examination"});
	JList AccountingList3 = new JList(new Object[] {"Revision","Examination"});
	
	JScrollPane English1SP = new JScrollPane(EnglishList);
	JScrollPane Maths1SP = new JScrollPane(MathsList);
	JScrollPane Phy1SP = new JScrollPane(PhyList);
	JScrollPane English2SP = new JScrollPane(EnglishList2);
	JScrollPane Maths2SP = new JScrollPane(MathsList2);
	JScrollPane Phy2SP = new JScrollPane(PhyList2);
	JScrollPane English3SP = new JScrollPane(EnglishList3);
	JScrollPane Maths3SP = new JScrollPane(MathsList3);
	JScrollPane Phy3SP = new JScrollPane(PhyList3);
	
	public void Frame() {
		
// ALL LIST:
		EnglishList.addListSelectionListener(englishlistener);
		EnglishList2.addListSelectionListener(englishlistener);
		EnglishList3.addListSelectionListener(englishlistener);
		MathsList.addListSelectionListener(mathslistener);
		
		EnglishList.setFont(new Font("Calibril",Font.PLAIN,14));
		MathsList.setFont(new Font("Calibril",Font.PLAIN,14));
		PhyList.setFont(new Font("Calibril",Font.PLAIN,14));
		ChmList.setFont(new Font("Calibril",Font.PLAIN,14));
		BioList.setFont(new Font("Calibril",Font.PLAIN,14));
		GeoList.setFont(new Font("Calibril",Font.PLAIN,14));
		AgroList.setFont(new Font("Calibril",Font.PLAIN,14));
		ComputerList.setFont(new Font("Calibril",Font.PLAIN,14));
		CivicList.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList.setFont(new Font("Calibril",Font.PLAIN,14));
		YorubaList.setFont(new Font("Calibril",Font.PLAIN,14));
		GovernmentList.setFont(new Font("Calibril",Font.PLAIN,14));
		CRSList.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList.setFont(new Font("Calibril",Font.PLAIN,14));
		CommerceList.setFont(new Font("Calibril",Font.PLAIN,14));
		EconomicsList.setFont(new Font("Calibril",Font.PLAIN,14));
		AccountingList.setFont(new Font("Calibril",Font.PLAIN,14));
		MarketingList.setFont(new Font("Calibril",Font.PLAIN,14));
		
		EnglishList2.setFont(new Font("Calibril",Font.PLAIN,14));
		MathsList2.setFont(new Font("Calibril",Font.PLAIN,14));
		PhyList2.setFont(new Font("Calibril",Font.PLAIN,14));
		ChmList2.setFont(new Font("Calibril",Font.PLAIN,14));
		BioList2.setFont(new Font("Calibril",Font.PLAIN,14));
		GeoList2.setFont(new Font("Calibril",Font.PLAIN,14));
		AgroList2.setFont(new Font("Calibril",Font.PLAIN,14));
		ComputerList2.setFont(new Font("Calibril",Font.PLAIN,14));
		CivicList2.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList2.setFont(new Font("Calibril",Font.PLAIN,14));
		YorubaList2.setFont(new Font("Calibril",Font.PLAIN,14));
		GovernmentList2.setFont(new Font("Calibril",Font.PLAIN,14));
		CRSList2.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList2.setFont(new Font("Calibril",Font.PLAIN,14));
		CommerceList2.setFont(new Font("Calibril",Font.PLAIN,14));
		EconomicsList2.setFont(new Font("Calibril",Font.PLAIN,14));
		AccountingList2.setFont(new Font("Calibril",Font.PLAIN,14));
		MarketingList2.setFont(new Font("Calibril",Font.PLAIN,14));
		
		EnglishList3.setFont(new Font("Calibril",Font.PLAIN,14));
		MathsList3.setFont(new Font("Calibril",Font.PLAIN,14));
		PhyList3.setFont(new Font("Calibril",Font.PLAIN,14));
		ChmList3.setFont(new Font("Calibril",Font.PLAIN,14));
		BioList3.setFont(new Font("Calibril",Font.PLAIN,14));
		GeoList3.setFont(new Font("Calibril",Font.PLAIN,14));
		AgroList3.setFont(new Font("Calibril",Font.PLAIN,14));
		ComputerList3.setFont(new Font("Calibril",Font.PLAIN,14));
		CivicList3.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList3.setFont(new Font("Calibril",Font.PLAIN,14));
		YorubaList3.setFont(new Font("Calibril",Font.PLAIN,14));
		GovernmentList3.setFont(new Font("Calibril",Font.PLAIN,14));
		CRSList3.setFont(new Font("Calibril",Font.PLAIN,14));
		LiteratureList3.setFont(new Font("Calibril",Font.PLAIN,14));
		CommerceList3.setFont(new Font("Calibril",Font.PLAIN,14));
		EconomicsList3.setFont(new Font("Calibril",Font.PLAIN,14));
		AccountingList3.setFont(new Font("Calibril",Font.PLAIN,14));
		MarketingList3.setFont(new Font("Calibril",Font.PLAIN,14));
		
		back1.setBackground(Color.red);
		Aback1.setBackground(Color.red);
		Cback1.setBackground(Color.red);
		back2.setBackground(Color.red);
		Aback2.setBackground(Color.red);
		Cback2.setBackground(Color.red);
		back3.setBackground(Color.red);
		Aback3.setBackground(Color.red);
		Cback3.setBackground(Color.red);
		
		masterPanel.setLayout(Card);
		readingPanel.setLayout(readingExamCard);
		
		ReadingEnglishPanel1.setLayout(English1Card);
		ReadingMathematicsPanel1.setLayout(Mathematics1Card);
		ReadingPhysicsPanel1.setLayout(Physics1Card);
		ReadingChemistryPanel1.setLayout(Chemistry1Card);
		ReadingBiologyPanel1.setLayout(Biology1Card);
		ReadingGeographyPanel1.setLayout(Geography1Card);
		ReadingAgriculturePanel1.setLayout(Agriculture1Card);
		ReadingComputerPanel1.setLayout(Computer1Card);
		ReadingGovernmentPanel1.setLayout(Government1Card);
		ReadingLiteraturePanel1.setLayout(Literature1Card);
		ReadingCRSPanel1.setLayout(CRS1Card);
		ReadingCivicPanel1.setLayout(Civic1Card);
		ReadingEconomicsPanel1.setLayout(Economics1Card);
		ReadingCommercePanel1.setLayout(Commerce1Card);
		ReadingYorubaPanel1.setLayout(Yoruba1Card);
		ReadingAccountingPanel1.setLayout(Accounting1Card);
		ReadingMarketingPanel1.setLayout(Marketing1Card);
		ReadingEnglishPanel2.setLayout(English2Card);
		ReadingMathematicsPanel2.setLayout(Mathematics2Card);
		ReadingPhysicsPanel2.setLayout(Physics2Card);
		ReadingChemistryPanel2.setLayout(Chemistry2Card);
		ReadingBiologyPanel2.setLayout(Biology2Card);
		ReadingAgriculturePanel2.setLayout(Agriculture2Card);
		ReadingComputerPanel2.setLayout(Computer2Card);
		ReadingGovernmentPanel2.setLayout(Government2Card);
		ReadingLiteraturePanel2.setLayout(Literature2Card);
		ReadingCRSPanel2.setLayout(CRS2Card);
		ReadingCivicPanel2.setLayout(Civic2Card);
		ReadingEconomicsPanel2.setLayout(Economics2Card);
		ReadingCommercePanel2.setLayout(Commerce2Card);
		ReadingYorubaPanel2.setLayout(Yoruba2Card);
		ReadingAccountingPanel2.setLayout(Accounting2Card);
		ReadingMarketingPanel2.setLayout(Marketing2Card);
		ReadingEnglishPanel3.setLayout(English3Card);
		ReadingMathematicsPanel3.setLayout(Mathematics3Card);
		ReadingPhysicsPanel3.setLayout(Physics3Card);
		ReadingChemistryPanel3.setLayout(Chemistry3Card);
		ReadingBiologyPanel3.setLayout(Biology3Card);
		ReadingAgriculturePanel3.setLayout(Agriculture3Card);
		ReadingComputerPanel3.setLayout(Computer3Card);
		ReadingGovernmentPanel3.setLayout(Government3Card);
		ReadingLiteraturePanel3.setLayout(Literature3Card);
		ReadingCRSPanel3.setLayout(CRS3Card);
		ReadingCivicPanel3.setLayout(Civic3Card);
		ReadingEconomicsPanel3.setLayout(Economics3Card);
		ReadingCommercePanel3.setLayout(Commerce3Card);
		ReadingYorubaPanel3.setLayout(Yoruba3Card);
		ReadingAccountingPanel3.setLayout(Accounting3Card);
		ReadingMarketingPanel3.setLayout(Marketing3Card);
		
		panel1.setLayout(new BorderLayout());
		
		
		ReadingEnglishPanel1.add(English1Topic0, "T0");
		ReadingEnglishPanel1.add(English1Topic1, "T1");
		ReadingEnglishPanel1.add(English1Topic2, "T2");
		ReadingEnglishPanel1.add(English1Topic3, "T3");
		ReadingEnglishPanel1.add(English1Topic4, "T4");
		ReadingEnglishPanel1.add(English1Topic5, "T5");
		ReadingEnglishPanel1.add(English1Topic6, "T6");
		ReadingEnglishPanel1.add(English1Topic7, "T7");
		ReadingEnglishPanel1.add(English1Topic8, "T8");
		ReadingEnglishPanel1.add(English1Topic9, "T9");
		ReadingEnglishPanel1.add(English1Topic10, "T10");
		ReadingEnglishPanel1.add(English1Topic11, "T11");
		ReadingEnglishPanel1.add(English1Topic12, "T12");
		ReadingEnglishPanel1.add(English1Topic13, "T13");
		ReadingEnglishPanel1.add(English1Topic14, "T14");
		ReadingEnglishPanel1.add(English1Topic15, "T15");
		ReadingEnglishPanel1.add(English1Topic16, "T16");
		ReadingEnglishPanel1.add(English1Topic17, "T17");
		ReadingEnglishPanel1.add(English1Topic18, "T18");
		ReadingEnglishPanel1.add(English1Topic19, "T19");
		ReadingEnglishPanel1.add(English1Topic20, "T20");
		ReadingEnglishPanel1.add(English1Topic21, "T21");
		ReadingEnglishPanel1.add(English1Topic22, "T22");
		ReadingEnglishPanel1.add(English1Topic23, "T23");
		ReadingEnglishPanel1.add(English1Topic24, "T24");
		ReadingEnglishPanel1.add(English1Topic25, "T25");
		ReadingEnglishPanel1.add(English1Topic26, "T26");
		ReadingEnglishPanel1.add(English1Topic27, "T27");
		ReadingEnglishPanel1.add(English1Topic28, "T28");
		ReadingEnglishPanel1.add(English1Topic29, "T29");
		ReadingEnglishPanel1.add(English1Topic30, "T30");
		ReadingEnglishPanel2.add(English2Topic0, "T0");
		ReadingEnglishPanel2.add(English2Topic1, "T1");
		ReadingEnglishPanel2.add(English2Topic2, "T2");
		ReadingEnglishPanel2.add(English2Topic3, "T3");
		ReadingEnglishPanel2.add(English2Topic4, "T4");
		ReadingEnglishPanel2.add(English2Topic5, "T5");
		ReadingEnglishPanel2.add(English2Topic6, "T6");
		ReadingEnglishPanel2.add(English2Topic7, "T7");
		ReadingEnglishPanel2.add(English2Topic8, "T8");
		ReadingEnglishPanel2.add(English2Topic9, "T9");
		ReadingEnglishPanel2.add(English2Topic10, "T10");
		ReadingEnglishPanel2.add(English2Topic11, "T11");
		ReadingEnglishPanel2.add(English2Topic12, "T12");
		ReadingEnglishPanel2.add(English2Topic13, "T13");
		ReadingEnglishPanel2.add(English2Topic14, "T14");
		ReadingEnglishPanel2.add(English2Topic15, "T15");
		ReadingEnglishPanel2.add(English2Topic16, "T16");
		ReadingEnglishPanel2.add(English2Topic17, "T17");
		ReadingEnglishPanel2.add(English2Topic18, "T18");
		ReadingEnglishPanel2.add(English2Topic19, "T19");
		ReadingEnglishPanel2.add(English2Topic20, "T20");
		ReadingEnglishPanel2.add(English2Topic21, "T21");
		ReadingEnglishPanel2.add(English2Topic22, "T22");
		ReadingEnglishPanel2.add(English2Topic23, "T23");
		ReadingEnglishPanel2.add(English2Topic24, "T24");
		ReadingEnglishPanel2.add(English2Topic25, "T25");	
		ReadingEnglishPanel3.add(English2Topic0, "T0");
		ReadingEnglishPanel3.add(English2Topic1, "T1");
		ReadingEnglishPanel3.add(English2Topic2, "T2");
		ReadingEnglishPanel3.add(English2Topic3, "T3");
		ReadingEnglishPanel3.add(English2Topic4, "T4");
		ReadingEnglishPanel3.add(English2Topic5, "T5");
		ReadingEnglishPanel3.add(English2Topic6, "T6");
		ReadingEnglishPanel3.add(English2Topic7, "T7");
		ReadingEnglishPanel3.add(English2Topic8, "T8");
		ReadingEnglishPanel3.add(English2Topic9, "T9");
		ReadingEnglishPanel3.add(English2Topic10, "T10");
		ReadingEnglishPanel3.add(English2Topic11, "T11");
		ReadingEnglishPanel3.add(English2Topic12, "T12");
		ReadingEnglishPanel3.add(English2Topic13, "T13");
		ReadingEnglishPanel3.add(English2Topic14, "T14");
		ReadingEnglishPanel3.add(English2Topic15, "T15");
		ReadingEnglishPanel3.add(English2Topic16, "T16");
		
		ReadingMathematicsPanel1.add(Mathematics1Topic0, "T0");
		ReadingMathematicsPanel1.add(Mathematics1Topic1, "T1");
		ReadingMathematicsPanel1.add(Mathematics1Topic2, "T2");
		ReadingMathematicsPanel1.add(Mathematics1Topic3, "T3");
		ReadingMathematicsPanel1.add(Mathematics1Topic4, "T4");
		ReadingMathematicsPanel1.add(Mathematics1Topic5, "T5");
		ReadingMathematicsPanel1.add(Mathematics1Topic6, "T6");
		ReadingMathematicsPanel1.add(Mathematics1Topic7, "T7");
		ReadingMathematicsPanel1.add(Mathematics1Topic8, "T8");
		ReadingMathematicsPanel1.add(Mathematics1Topic9, "T9");
		ReadingMathematicsPanel1.add(Mathematics1Topic10, "T10");
		ReadingMathematicsPanel1.add(Mathematics1Topic11, "T11");
		ReadingMathematicsPanel1.add(Mathematics1Topic12, "T12");
		ReadingMathematicsPanel1.add(Mathematics1Topic13, "T13");
		ReadingMathematicsPanel1.add(Mathematics1Topic14, "T14");
		ReadingMathematicsPanel1.add(Mathematics1Topic15, "T15");
		ReadingMathematicsPanel1.add(Mathematics1Topic16, "T16");
		ReadingMathematicsPanel1.add(Mathematics1Topic17, "T17");
		ReadingMathematicsPanel1.add(Mathematics1Topic18, "T18");
		ReadingMathematicsPanel1.add(Mathematics1Topic19, "T19");
		ReadingMathematicsPanel1.add(Mathematics1Topic20, "T20");
		ReadingMathematicsPanel2.add(Mathematics2Topic0, "T0");
		ReadingMathematicsPanel2.add(Mathematics2Topic1, "T1");
		ReadingMathematicsPanel2.add(Mathematics2Topic2, "T2");
		ReadingMathematicsPanel2.add(Mathematics2Topic3, "T3");
		ReadingMathematicsPanel2.add(Mathematics2Topic4, "T4");
		ReadingMathematicsPanel2.add(Mathematics2Topic5, "T5");
		ReadingMathematicsPanel2.add(Mathematics2Topic6, "T6");
		ReadingMathematicsPanel2.add(Mathematics2Topic7, "T7");
		ReadingMathematicsPanel2.add(Mathematics2Topic8, "T8");
		ReadingMathematicsPanel2.add(Mathematics2Topic9, "T9");
		ReadingMathematicsPanel2.add(Mathematics2Topic10, "T10");
		ReadingMathematicsPanel2.add(Mathematics2Topic11, "T11");
		ReadingMathematicsPanel2.add(Mathematics2Topic12, "T12");
		ReadingMathematicsPanel2.add(Mathematics2Topic13, "T13");
		ReadingMathematicsPanel2.add(Mathematics2Topic14, "T14");
		ReadingMathematicsPanel2.add(Mathematics2Topic15, "T15");
		ReadingMathematicsPanel2.add(Mathematics2Topic16, "T16");
		ReadingMathematicsPanel3.add(Mathematics3Topic0, "T0");
		ReadingMathematicsPanel3.add(Mathematics3Topic1, "T1");
		
		ReadingPhysicsPanel1.add(Physics1Topic0,"T0");
		ReadingPhysicsPanel1.add(Physics1Topic1,"T1");
		ReadingPhysicsPanel1.add(Physics1Topic2,"T2");
		ReadingPhysicsPanel1.add(Physics1Topic3,"T3");
		ReadingPhysicsPanel1.add(Physics1Topic4,"T4");
		ReadingPhysicsPanel1.add(Physics1Topic5,"T5");
		ReadingPhysicsPanel1.add(Physics1Topic6,"T6");
		ReadingPhysicsPanel1.add(Physics1Topic7,"T7");
		ReadingPhysicsPanel1.add(Physics1Topic8,"T8");
		ReadingPhysicsPanel1.add(Physics1Topic9,"T9");
		ReadingPhysicsPanel1.add(Physics1Topic10,"T10");
		ReadingPhysicsPanel1.add(Physics1Topic11,"T11");
		ReadingPhysicsPanel1.add(Physics1Topic12,"T12");
		ReadingPhysicsPanel1.add(Physics1Topic13,"T13");
		ReadingPhysicsPanel1.add(Physics1Topic14,"T14");
		ReadingPhysicsPanel2.add(Physics2Topic0,"T0");
		ReadingPhysicsPanel2.add(Physics2Topic1,"T1");
		ReadingPhysicsPanel2.add(Physics2Topic2,"T2");
		ReadingPhysicsPanel2.add(Physics2Topic3,"T3");
		ReadingPhysicsPanel2.add(Physics2Topic4,"T4");
		ReadingPhysicsPanel2.add(Physics2Topic5,"T5");
		ReadingPhysicsPanel2.add(Physics2Topic6,"T6");
		ReadingPhysicsPanel2.add(Physics2Topic7,"T7");
		ReadingPhysicsPanel2.add(Physics2Topic8,"T8");
		ReadingPhysicsPanel2.add(Physics2Topic9,"T9");
		ReadingPhysicsPanel2.add(Physics2Topic10,"T10");
		ReadingPhysicsPanel2.add(Physics2Topic11,"T11");
		ReadingPhysicsPanel2.add(Physics2Topic12,"T12");
		ReadingPhysicsPanel2.add(Physics2Topic13,"T13");
		ReadingPhysicsPanel2.add(Physics2Topic14,"T14");
		ReadingPhysicsPanel2.add(Physics2Topic15,"T15");
		ReadingPhysicsPanel2.add(Physics2Topic16,"T16");
		ReadingPhysicsPanel3.add(Physics3Topic1,"T1");
		ReadingPhysicsPanel3.add(Physics3Topic1,"T1");
		ReadingPhysicsPanel3.add(Physics3Topic2,"T2");
		ReadingPhysicsPanel3.add(Physics3Topic3,"T3");
		ReadingPhysicsPanel3.add(Physics3Topic4,"T4");
		ReadingPhysicsPanel3.add(Physics3Topic5,"T5");
		ReadingPhysicsPanel3.add(Physics3Topic6,"T6");
		ReadingPhysicsPanel3.add(Physics3Topic7,"T7");
		ReadingPhysicsPanel3.add(Physics3Topic8,"T8");
		ReadingPhysicsPanel3.add(Physics3Topic9,"T9");
		ReadingPhysicsPanel3.add(Physics3Topic10,"T10");
		ReadingPhysicsPanel3.add(Physics3Topic11,"T11");
		ReadingPhysicsPanel3.add(Physics3Topic12,"T12");
		
		ReadingChemistryPanel1.add(Chemistry1Topic0, "T0");
		ReadingChemistryPanel1.add(Chemistry1Topic1, "T1");
		ReadingChemistryPanel1.add(Chemistry1Topic2, "T2");
		ReadingChemistryPanel1.add(Chemistry1Topic3, "T3");
		ReadingChemistryPanel1.add(Chemistry1Topic4, "T4");
		ReadingChemistryPanel1.add(Chemistry1Topic5, "T5");
		ReadingChemistryPanel1.add(Chemistry1Topic6, "T6");
		ReadingChemistryPanel1.add(Chemistry1Topic7, "T7");
		ReadingChemistryPanel1.add(Chemistry1Topic8, "T8");
		ReadingChemistryPanel1.add(Chemistry1Topic9, "T9");
		ReadingChemistryPanel1.add(Chemistry1Topic10, "T10");
		ReadingChemistryPanel1.add(Chemistry1Topic11, "T11");
		ReadingChemistryPanel1.add(Chemistry1Topic12, "T12");
		ReadingChemistryPanel1.add(Chemistry1Topic13, "T13");
		ReadingChemistryPanel1.add(Chemistry1Topic14, "T14");
		ReadingChemistryPanel1.add(Chemistry1Topic15, "T15");
		ReadingChemistryPanel1.add(Chemistry1Topic16, "T16");
		ReadingChemistryPanel1.add(Chemistry1Topic17, "T17");
		ReadingChemistryPanel1.add(Chemistry1Topic18, "T18");
		ReadingChemistryPanel1.add(Chemistry1Topic19, "T19");
		ReadingChemistryPanel1.add(Chemistry1Topic20, "T20");
		ReadingChemistryPanel1.add(Chemistry1Topic21, "T21");
		ReadingChemistryPanel1.add(Chemistry1Topic22, "T22");
		ReadingChemistryPanel1.add(Chemistry1Topic23, "T23");
		ReadingChemistryPanel1.add(Chemistry1Topic24, "T24");
		ReadingChemistryPanel1.add(Chemistry1Topic25, "T25");
		ReadingChemistryPanel2.add(Chemistry2Topic0, "T0");
		ReadingChemistryPanel2.add(Chemistry2Topic1, "T1");
		ReadingChemistryPanel2.add(Chemistry2Topic2, "T2");
		ReadingChemistryPanel2.add(Chemistry2Topic3, "T3");
		ReadingChemistryPanel2.add(Chemistry2Topic4, "T4");
		ReadingChemistryPanel2.add(Chemistry2Topic5, "T5");
		ReadingChemistryPanel2.add(Chemistry2Topic6, "T6");
		ReadingChemistryPanel2.add(Chemistry2Topic7, "T7");
		ReadingChemistryPanel2.add(Chemistry2Topic8, "T8");
		ReadingChemistryPanel2.add(Chemistry2Topic9, "T9");
		ReadingChemistryPanel2.add(Chemistry2Topic10, "T10");
		ReadingChemistryPanel2.add(Chemistry2Topic11, "T11");
		ReadingChemistryPanel2.add(Chemistry2Topic12, "T12");
		ReadingChemistryPanel2.add(Chemistry2Topic13, "T13");
		ReadingChemistryPanel3.add(Chemistry3Topic0, "T0");
		ReadingChemistryPanel3.add(Chemistry3Topic1, "T1");
		ReadingChemistryPanel3.add(Chemistry3Topic2, "T2");
		ReadingChemistryPanel3.add(Chemistry3Topic3, "T3");
		ReadingChemistryPanel3.add(Chemistry3Topic4, "T4");
		ReadingChemistryPanel3.add(Chemistry3Topic5, "T5");
		ReadingChemistryPanel3.add(Chemistry3Topic6, "T6");
		ReadingChemistryPanel3.add(Chemistry3Topic7, "T7");
		
		ReadingBiologyPanel1.add(Biology1Topic0, "T0");
		ReadingBiologyPanel1.add(Biology1Topic1, "T1");
		ReadingBiologyPanel1.add(Biology1Topic2, "T2");
		ReadingBiologyPanel1.add(Biology1Topic3, "T3");
		ReadingBiologyPanel1.add(Biology1Topic4, "T4");
		ReadingBiologyPanel1.add(Biology1Topic5, "T5");
		ReadingBiologyPanel1.add(Biology1Topic6, "T6");
		ReadingBiologyPanel1.add(Biology1Topic7, "T7");
		ReadingBiologyPanel1.add(Biology1Topic8, "T8");
		ReadingBiologyPanel1.add(Biology1Topic9, "T9");
		ReadingBiologyPanel1.add(Biology1Topic10, "T10");
		ReadingBiologyPanel2.add(Biology2Topic0, "T0");
		ReadingBiologyPanel2.add(Biology2Topic1, "T1");
		ReadingBiologyPanel2.add(Biology2Topic2, "T2");
		ReadingBiologyPanel2.add(Biology2Topic3, "T3");
		ReadingBiologyPanel2.add(Biology2Topic4, "T4");
		ReadingBiologyPanel2.add(Biology2Topic5, "T5");
		ReadingBiologyPanel2.add(Biology2Topic6, "T6");
		ReadingBiologyPanel2.add(Biology2Topic7, "T7");
		ReadingBiologyPanel2.add(Biology2Topic8, "T8");
		ReadingBiologyPanel2.add(Biology2Topic9, "T9");
		ReadingBiologyPanel2.add(Biology2Topic10, "T10");
		ReadingBiologyPanel2.add(Biology2Topic11, "T11");
		ReadingBiologyPanel3.add(Biology3Topic0, "T0");
		ReadingBiologyPanel3.add(Biology3Topic1, "T1");
		ReadingBiologyPanel3.add(Biology3Topic2, "T2");
		ReadingBiologyPanel3.add(Biology3Topic3, "T3");
		
		ReadingGeographyPanel1.add(Geography1Topic0, "T0");
		ReadingGeographyPanel1.add(Geography1Topic1, "T1");
		ReadingGeographyPanel1.add(Geography1Topic2, "T2");
		ReadingGeographyPanel1.add(Geography1Topic3, "T3");
		ReadingGeographyPanel1.add(Geography1Topic4, "T4");
		ReadingGeographyPanel1.add(Geography1Topic5, "T5");
		ReadingGeographyPanel1.add(Geography1Topic6, "T6");
		ReadingGeographyPanel1.add(Geography1Topic7, "T7");
		ReadingGeographyPanel1.add(Geography1Topic8, "T8");
		
		ReadingAgriculturePanel1.add(Agriculture1Topic0, "T0");
		ReadingAgriculturePanel1.add(Agriculture1Topic1, "T1");
		ReadingAgriculturePanel1.add(Agriculture1Topic2, "T2");
		ReadingAgriculturePanel1.add(Agriculture1Topic3, "T3");
		ReadingAgriculturePanel1.add(Agriculture1Topic4, "T4");
		ReadingAgriculturePanel1.add(Agriculture1Topic5, "T5");
		ReadingAgriculturePanel1.add(Agriculture1Topic6, "T6");
		ReadingAgriculturePanel1.add(Agriculture1Topic7, "T7");
		ReadingAgriculturePanel1.add(Agriculture1Topic8, "T8");
		ReadingAgriculturePanel1.add(Agriculture1Topic9, "T9");
		ReadingAgriculturePanel1.add(Agriculture1Topic10, "T10");
		ReadingAgriculturePanel2.add(Agriculture2Topic0, "T0");
		ReadingAgriculturePanel2.add(Agriculture2Topic1, "T1");
		ReadingAgriculturePanel2.add(Agriculture2Topic2, "T2");
		ReadingAgriculturePanel2.add(Agriculture2Topic3, "T3");
		ReadingAgriculturePanel2.add(Agriculture2Topic4, "T4");
		ReadingAgriculturePanel2.add(Agriculture2Topic5, "T5");
		ReadingAgriculturePanel2.add(Agriculture2Topic6, "T6");
		ReadingAgriculturePanel2.add(Agriculture2Topic7, "T7");
		ReadingAgriculturePanel2.add(Agriculture2Topic8, "T8");
		ReadingAgriculturePanel2.add(Agriculture2Topic9, "T9");
		ReadingAgriculturePanel2.add(Agriculture2Topic10, "T10");
		ReadingAgriculturePanel2.add(Agriculture2Topic11, "T11");
		ReadingAgriculturePanel2.add(Agriculture2Topic12, "T12");
		ReadingAgriculturePanel2.add(Agriculture2Topic13, "T13");
		ReadingAgriculturePanel2.add(Agriculture2Topic14, "T14");
		ReadingAgriculturePanel2.add(Agriculture2Topic15, "T15");
		ReadingAgriculturePanel3.add(Agriculture3Topic0, "T0");
		ReadingAgriculturePanel3.add(Agriculture3Topic1, "T1");
		ReadingAgriculturePanel3.add(Agriculture3Topic2, "T2");
		ReadingAgriculturePanel3.add(Agriculture3Topic3, "T3");
		ReadingAgriculturePanel3.add(Agriculture3Topic4, "T4");
		ReadingAgriculturePanel3.add(Agriculture3Topic5, "T5");
		ReadingAgriculturePanel3.add(Agriculture3Topic6, "T6");
		ReadingAgriculturePanel3.add(Agriculture3Topic7, "T7");
		ReadingAgriculturePanel3.add(Agriculture3Topic8, "T8");
		ReadingAgriculturePanel3.add(Agriculture3Topic9, "T9");
		ReadingAgriculturePanel3.add(Agriculture3Topic10, "T10");
		ReadingAgriculturePanel3.add(Agriculture3Topic11, "T11");
		ReadingAgriculturePanel3.add(Agriculture3Topic12, "T12");
		ReadingAgriculturePanel3.add(Agriculture3Topic13, "T13");
		ReadingAgriculturePanel3.add(Agriculture3Topic14, "T14");
		
		ReadingComputerPanel1.add(Computer1Topic0, "T0");
		ReadingComputerPanel1.add(Computer1Topic1, "T1");
		ReadingComputerPanel1.add(Computer1Topic2, "T2");
		ReadingComputerPanel1.add(Computer1Topic3, "T3");
		ReadingComputerPanel1.add(Computer1Topic4, "T4");
		ReadingComputerPanel1.add(Computer1Topic5, "T5");
		ReadingComputerPanel1.add(Computer1Topic6, "T6");
		ReadingComputerPanel1.add(Computer1Topic7, "T7");
		ReadingComputerPanel2.add(Computer2Topic0, "T0");
		ReadingComputerPanel2.add(Computer2Topic1, "T1");
		ReadingComputerPanel2.add(Computer2Topic2, "T2");
		ReadingComputerPanel2.add(Computer2Topic3, "T3");
		ReadingComputerPanel2.add(Computer2Topic4, "T4");
		ReadingComputerPanel2.add(Computer2Topic5, "T5");
		ReadingComputerPanel2.add(Computer2Topic6, "T6");
		ReadingComputerPanel2.add(Computer2Topic7, "T7");
		ReadingComputerPanel2.add(Computer2Topic8, "T8");
		ReadingComputerPanel2.add(Computer2Topic9, "T9");
		ReadingComputerPanel2.add(Computer2Topic10, "T10");
		ReadingComputerPanel2.add(Computer2Topic11, "T11");
		ReadingComputerPanel2.add(Computer2Topic12, "T12");
		ReadingComputerPanel2.add(Computer2Topic13, "T13");
		ReadingComputerPanel2.add(Computer2Topic14, "T14");
		ReadingComputerPanel2.add(Computer2Topic15, "T15");
		ReadingComputerPanel2.add(Computer2Topic16, "T16");
		ReadingComputerPanel2.add(Computer2Topic17, "T17");
		ReadingComputerPanel3.add(Computer3Topic0, "T0");
		ReadingComputerPanel3.add(Computer3Topic1, "T1");
		
		ReadingGovernmentPanel1.add(Government1Topic0, "T0");
		ReadingGovernmentPanel1.add(Government1Topic1, "T1");
		ReadingGovernmentPanel1.add(Government1Topic2, "T2");
		ReadingGovernmentPanel1.add(Government1Topic3, "T3");
		ReadingGovernmentPanel1.add(Government1Topic4, "T4");
		ReadingGovernmentPanel1.add(Government1Topic5, "T5");
		ReadingGovernmentPanel1.add(Government1Topic6, "T6");
		ReadingGovernmentPanel1.add(Government1Topic7, "T7");
		ReadingGovernmentPanel1.add(Government1Topic8, "T8");
		ReadingGovernmentPanel2.add(Government2Topic0, "T0");
		ReadingGovernmentPanel2.add(Government2Topic1, "T1");
		ReadingGovernmentPanel2.add(Government2Topic2, "T2");
		ReadingGovernmentPanel2.add(Government2Topic3, "T3");
		ReadingGovernmentPanel2.add(Government2Topic4, "T4");
		ReadingGovernmentPanel2.add(Government2Topic5, "T5");
		ReadingGovernmentPanel2.add(Government2Topic6, "T6");
		ReadingGovernmentPanel2.add(Government2Topic7, "T7");
		ReadingGovernmentPanel2.add(Government2Topic8, "T8");
		ReadingGovernmentPanel3.add(Government3Topic0, "T0");
		ReadingGovernmentPanel3.add(Government3Topic1, "T1");
		
		ReadingLiteraturePanel1.add(Literature1Topic0,"T0");
		ReadingLiteraturePanel1.add(Literature1Topic1,"T1");
		ReadingLiteraturePanel1.add(Literature1Topic2,"T2");
		ReadingLiteraturePanel1.add(Literature1Topic3,"T3");
		ReadingLiteraturePanel1.add(Literature1Topic4,"T4");
		ReadingLiteraturePanel1.add(Literature1Topic5,"T5");
		ReadingLiteraturePanel2.add(Literature2Topic0,"T0");
		ReadingLiteraturePanel2.add(Literature2Topic1,"T1");
		ReadingLiteraturePanel2.add(Literature2Topic2,"T2");
		ReadingLiteraturePanel2.add(Literature2Topic3,"T3");
		ReadingLiteraturePanel2.add(Literature2Topic4,"T4");
		ReadingLiteraturePanel2.add(Literature2Topic5,"T5");
		ReadingLiteraturePanel2.add(Literature2Topic6,"T6");
		ReadingLiteraturePanel3.add(Literature3Topic0,"T0");
		ReadingLiteraturePanel3.add(Literature3Topic1,"T1");
		ReadingLiteraturePanel3.add(Literature3Topic2,"T2");
		ReadingLiteraturePanel3.add(Literature3Topic3,"T3");
		ReadingLiteraturePanel3.add(Literature3Topic4,"T4");
		ReadingLiteraturePanel3.add(Literature3Topic5,"T5");
		ReadingLiteraturePanel3.add(Literature3Topic6,"T6");
		
		
		
		//fstjvgtc;
		
		JPanel fp = new JPanel();
		JPanel sp = new JPanel();
		
		sp.setLayout(new GridLayout(1,3,4,4));
		fp.setLayout(new GridLayout());
		fp.setBackground(new Color(25,25,220));
		sp.setBackground(new Color(25,25,220));
		sp.setSize(getPreferredSize());
		
		class1.setIcon(image1);
		class2.setIcon(image2);;
		class3.setIcon(image3);
		
		fp.add(new JLabel(Image1));
		JLabel syc = new JLabel("Please select your class");
		syc.setFont(new Font("Calibril", Font.BOLD, 14));
		
		sp.add(class1);
		sp.add(class2);
		sp.add(class3);
		
		panel1.add(fp, BorderLayout.NORTH);
		panel1.add(sp, BorderLayout.CENTER);
		
		class1.addActionListener(work);
		class2.addActionListener(work);
		class3.addActionListener(work);
		back1.addActionListener(work);
		Aback1.addActionListener(work);
		Cback1.addActionListener(work);
		back2.addActionListener(work);
		Aback2.addActionListener(work);
		Cback2.addActionListener(work);
		back3.addActionListener(work);
		Aback3.addActionListener(work);
		Cback3.addActionListener(work);
		english.addActionListener(work);
		mathematics.addActionListener(work);
		physics.addActionListener(work);
		chemistry.addActionListener(work);
		biology.addActionListener(work);
		geography.addActionListener(work);
		agriculture.addActionListener(work);
		computer.addActionListener(work);
		civic.addActionListener(work);
		literature.addActionListener(work);
		government.addActionListener(work);
		crs.addActionListener(work);
		yoruba.addActionListener(work);
		economics.addActionListener(work);
		commerce.addActionListener(work);
		accounting.addActionListener(work);
		marketing.addActionListener(work);
		english2.addActionListener(work);
		mathematics2.addActionListener(work);
		physics2.addActionListener(work);
		chemistry2.addActionListener(work);
		biology2.addActionListener(work);
		agriculture2.addActionListener(work);
		computer2.addActionListener(work);
		civic2.addActionListener(work);
		literature2.addActionListener(work);
		government2.addActionListener(work);
		crs2.addActionListener(work);
		yoruba2.addActionListener(work);
		economics2.addActionListener(work);
		commerce2.addActionListener(work);
		accounting2.addActionListener(work);
		marketing2.addActionListener(work);
		english3.addActionListener(work);
		mathematics3.addActionListener(work);
		physics3.addActionListener(work);
		chemistry3.addActionListener(work);
		biology3.addActionListener(work);
		agriculture3.addActionListener(work);
		computer3.addActionListener(work);
		civic3.addActionListener(work);
		literature3.addActionListener(work);
		government3.addActionListener(work);
		crs3.addActionListener(work);
		yoruba3.addActionListener(work);
		economics3.addActionListener(work);
		commerce3.addActionListener(work);
		accounting3.addActionListener(work);
		marketing3.addActionListener(work);
		
//
//   CLASS   1
		
		JPanel science = new JPanel();
		JPanel art = new JPanel();
		JPanel commercial = new JPanel();
		
		COSPanel.setBackground(Color.black);
		
		COSPanel.add(english);
		COSPanel.add(mathematics);
		COSPanel.add(physics);
		COSPanel.add(chemistry);
		COSPanel.add(biology);
		COSPanel.add(agriculture);
		COSPanel.add(geography);
		COSPanel.add(computer);
		COSPanel.add(back1);
		
		SubjectEnglishPanel.setLayout(new GridLayout(1,1));
		SubjectEnglishPanel.add(English1SP);
		SubjectMathematicsPanel.setLayout(new GridLayout(1,1));
		SubjectMathematicsPanel.add(Maths1SP);
		SubjectChemistryPanel.setLayout(new GridLayout(1,1));
		SubjectChemistryPanel.add(ChmList);
		SubjectPhysicsPanel.add(Phy1SP);
		SubjectPhysicsPanel.setLayout(new GridLayout(1,1));
		SubjectBiologyPanel.add(BioList);
		SubjectBiologyPanel.setLayout(new GridLayout(1,1));
		SubjectGeographyPanel.add(GeoList);
		SubjectGeographyPanel.setLayout(new GridLayout(1,1));
		SubjectAgriculturePanel.add(AgroList);
		SubjectAgriculturePanel.setLayout(new GridLayout(1,1));
		SubjectComputerPanel.add(ComputerList);
		SubjectComputerPanel.setLayout(new GridLayout(1,1));
				
		COTPanel.setLayout(SubjectCard);
		JPanel firstP = new JPanel();
		firstP.add(new JLabel("Please select a Subject"));
		
		COTPanel.add(firstP, "Select");
		COTPanel.add(SubjectEnglishPanel, "English");
		COTPanel.add(SubjectMathematicsPanel, "Mathematics");
		COTPanel.add(SubjectPhysicsPanel, "Physics");
		COTPanel.add(SubjectChemistryPanel, "Chemistry");
		COTPanel.add(SubjectBiologyPanel, "Biology");
		COTPanel.add(SubjectGeographyPanel, "Geology");
		COTPanel.add(SubjectAgriculturePanel, "Agriculture");
		COTPanel.add(SubjectComputerPanel, "Computer");
		
		science.setBackground(Color.black);
		science.setLayout(new BorderLayout());
		art.setBackground(Color.black);
		art.setLayout(new BorderLayout());
		commercial.setBackground(Color.black);
		commercial.setLayout(new BorderLayout());
		COSPanel.setLayout(new GridLayout(9,1,3,3));
		
		SubjectCard.show(COTPanel, "Select");
		
// SCIENCE
		science.add(COSPanel, BorderLayout.WEST);
		science.add(COTPanel, BorderLayout.CENTER);
		
// ART
		art.setLayout(new BorderLayout());
		COAPanel.setLayout(new GridLayout(9,1,3,3));
		COAPanel.setBackground(Color.black);
		COATPanel.setLayout(ASubjectCard);
		
		JPanel AS = new JPanel();
		AS.add(new JLabel("Please click a subject"));
		
		SubjectLiteraturePanel.add(LiteratureList);
		SubjectLiteraturePanel.setLayout(new GridLayout(1,1));
		SubjectGovernmentPanel.add(GovernmentList);
		SubjectGovernmentPanel.setLayout(new GridLayout(1,1));
		SubjectCRSPanel.add(CRSList);
		SubjectCRSPanel.setLayout(new GridLayout(1,1));
		SubjectYorubaPanel.add(YorubaList);
		SubjectYorubaPanel.setLayout(new GridLayout(1,1));
		SubjectCivicPanel.add(CivicList);
		SubjectCivicPanel.setLayout(new GridLayout(1,1));
		
		COATPanel.add(AS, "Select");
		COATPanel.add(SubjectLiteraturePanel, "Literature");
		COATPanel.add(SubjectGovernmentPanel, "Government");
		COATPanel.add(SubjectCRSPanel, "CRS");
		COATPanel.add(SubjectYorubaPanel, "Yoruba");
		COATPanel.add(SubjectCivicPanel, "Civic");
		
		COAPanel.add(literature);
		COAPanel.add(government);
		COAPanel.add(crs);
		COAPanel.add(yoruba);
		COAPanel.add(civic);
		COAPanel.add(Aback1);
		
		ASubjectCard.show(COATPanel, "Select");
		
		art.add(COAPanel, BorderLayout.WEST);
		art.add(COATPanel, BorderLayout.CENTER);
		
// COMMERCIAL
		commercial.setLayout(new BorderLayout());
		COCPanel.setLayout(new GridLayout(9,1,3,3));
		COCPanel.setBackground(Color.black);
		COCTPanel.setLayout(CSubjectCard);
		
		JPanel CS = new JPanel();
		CS.add(new JLabel("Please click a subject"));
		
		SubjectCommercePanel.add(CommerceList);
		SubjectCommercePanel.setLayout(new GridLayout(1,1));
		SubjectMarketingPanel.add(MarketingList);
		SubjectMarketingPanel.setLayout(new GridLayout(1,1));
		SubjectAccountingPanel.add(AccountingList);
		SubjectAccountingPanel.setLayout(new GridLayout(1,1));
		SubjectEconomicsPanel.add(EconomicsList);
		SubjectEconomicsPanel.setLayout(new GridLayout(1,1));
		
		SubjectMarketingPanel.add(MarketingList);
		SubjectAccountingPanel.add(AccountingList);
		SubjectEconomicsPanel.add(EconomicsList);
		SubjectCommercePanel.add(CommerceList);
		
		COCTPanel.add(CS, "Select");
		COCTPanel.add(SubjectMarketingPanel, "Marketing");
		COCTPanel.add(SubjectAccountingPanel, "Accounting");
		COCTPanel.add(SubjectEconomicsPanel, "Economics");
		COCTPanel.add(SubjectCommercePanel, "Commerce");
		
		COCPanel.add(marketing);
		COCPanel.add(accounting);
		COCPanel.add(commerce);
		COCPanel.add(economics);
		COCPanel.add(Cback1);
		
		CSubjectCard.show(COCTPanel, "Select");
		commercial.add(COCPanel, BorderLayout.WEST);
		commercial.add(COCTPanel, BorderLayout.CENTER);
		
		classOnePanel.setLayout(new BorderLayout());
		classOnePanel.setBackground(Color.black);
		
		
		tabPaneClass1.add(science, "Science");
		tabPaneClass1.add(art, "Art");
		tabPaneClass1.add(commercial, "Commercial");
		
		classOnePanel.add(new JLabel(department1),BorderLayout.NORTH);
		classOnePanel.add(tabPaneClass1, BorderLayout.CENTER);
				
		
		
//
//   CLASS   2
		
		
		JPanel science2 = new JPanel();
		JPanel art2 = new JPanel();
		JPanel commercial2 = new JPanel();
		
		CTSPanel.setBackground(Color.black);
		
		CTSPanel.add(english2);
		CTSPanel.add(mathematics2);
		CTSPanel.add(physics2);
		CTSPanel.add(chemistry2);
		CTSPanel.add(biology2);
		CTSPanel.add(agriculture2);
		CTSPanel.add(computer2);
		CTSPanel.add(back2);
		
		SubjectEnglishPanel2.setLayout(new GridLayout(1,1));
		SubjectEnglishPanel2.add(English2SP);
		SubjectMathematicsPanel2.setLayout(new GridLayout(1,1));
		SubjectMathematicsPanel2.add(Maths2SP);
		SubjectChemistryPanel2.setLayout(new GridLayout(1,1));
		SubjectChemistryPanel2.add(ChmList2);
		SubjectPhysicsPanel2.add(Phy2SP);
		SubjectPhysicsPanel2.setLayout(new GridLayout(1,1));
		SubjectBiologyPanel2.add(BioList2);
		SubjectBiologyPanel2.setLayout(new GridLayout(1,1));
		SubjectGeographyPanel2.add(GeoList2);
		SubjectGeographyPanel2.setLayout(new GridLayout(1,1));
		SubjectAgriculturePanel2.add(AgroList2);
		SubjectAgriculturePanel2.setLayout(new GridLayout(1,1));
		SubjectComputerPanel2.add(ComputerList2);
		SubjectComputerPanel2.setLayout(new GridLayout(1,1));
				
		CTTPanel.setLayout(SubjectCard2);
		JPanel secondP = new JPanel();
		secondP.add(new JLabel("Please select a Subject"));
		
		CTTPanel.add(secondP, "Select");
		CTTPanel.add(SubjectEnglishPanel2, "English");
		CTTPanel.add(SubjectMathematicsPanel2, "Mathematics");
		CTTPanel.add(SubjectPhysicsPanel2, "Physics");
		CTTPanel.add(SubjectChemistryPanel2, "Chemistry");
		CTTPanel.add(SubjectBiologyPanel2, "Biology");
		CTTPanel.add(SubjectGeographyPanel2, "Geology");
		CTTPanel.add(SubjectAgriculturePanel2, "Agriculture");
		CTTPanel.add(SubjectComputerPanel2, "Computer");
		
		science2.setBackground(Color.black);
		science2.setLayout(new BorderLayout());
		art2.setBackground(Color.black);
		art2.setLayout(new BorderLayout());
		commercial2.setBackground(Color.black);
		commercial2.setLayout(new BorderLayout());
		CTSPanel.setLayout(new GridLayout(9,1,3,3));
		
		SubjectCard2.show(CTTPanel, "Select");
		
// SCIENCE
		science2.add(CTSPanel, BorderLayout.WEST);
		science2.add(CTTPanel, BorderLayout.CENTER);
		
// ART
		art2.setLayout(new BorderLayout());
		CTAPanel.setLayout(new GridLayout(9,1,3,3));
		CTAPanel.setBackground(Color.black);
		CTATPanel.setLayout(ASubjectCard2);
		
		JPanel A2S = new JPanel();
		A2S.add(new JLabel("Please click a subject"));
		
		SubjectLiteraturePanel2.add(LiteratureList2);
		SubjectLiteraturePanel2.setLayout(new GridLayout(1,1));
		SubjectGovernmentPanel2.add(GovernmentList2);
		SubjectGovernmentPanel2.setLayout(new GridLayout(1,1));
		SubjectCRSPanel2.add(CRSList2);
		SubjectCRSPanel2.setLayout(new GridLayout(1,1));
		SubjectYorubaPanel2.add(YorubaList2);
		SubjectYorubaPanel2.setLayout(new GridLayout(1,1));
		SubjectCivicPanel2.add(CivicList2);
		SubjectCivicPanel2.setLayout(new GridLayout(1,1));
		
		CTATPanel.add(A2S, "Select");
		CTATPanel.add(SubjectLiteraturePanel2, "Literature");
		CTATPanel.add(SubjectGovernmentPanel2, "Government");
		CTATPanel.add(SubjectCRSPanel2, "CRS");
		CTATPanel.add(SubjectYorubaPanel2, "Yoruba");
		CTATPanel.add(SubjectCivicPanel2, "Civic");
		
		CTAPanel.add(literature2);
		CTAPanel.add(government2);
		CTAPanel.add(crs2);
		CTAPanel.add(yoruba2);
		CTAPanel.add(civic2);
		CTAPanel.add(Aback2);
		
		ASubjectCard2.show(CTATPanel, "Select");
		
		art2.add(CTAPanel, BorderLayout.WEST);
		art2.add(CTATPanel, BorderLayout.CENTER);
		
// COMMERCIAL
		commercial2.setLayout(new BorderLayout());
		CTCPanel.setLayout(new GridLayout(9,1,3,3));
		CTCPanel.setBackground(Color.black);
		CTCTPanel.setLayout(CSubjectCard2);
		
		JPanel CTS = new JPanel();
		CTS.add(new JLabel("Please click a subject"));
		
		SubjectCommercePanel2.add(CommerceList2);
		SubjectCommercePanel2.setLayout(new GridLayout(1,1));
		SubjectMarketingPanel2.add(MarketingList2);
		SubjectMarketingPanel2.setLayout(new GridLayout(1,1));
		SubjectAccountingPanel2.add(AccountingList2);
		SubjectAccountingPanel2.setLayout(new GridLayout(1,1));
		SubjectEconomicsPanel2.add(EconomicsList2);
		SubjectEconomicsPanel2.setLayout(new GridLayout(1,1));
		
		SubjectMarketingPanel2.add(MarketingList2);
		SubjectAccountingPanel2.add(AccountingList2);
		SubjectEconomicsPanel2.add(EconomicsList2);
		SubjectCommercePanel2.add(CommerceList2);
		
		CTCTPanel.add(CTS, "Select");
		CTCTPanel.add(SubjectMarketingPanel2, "Marketing");
		CTCTPanel.add(SubjectAccountingPanel2, "Accounting");
		CTCTPanel.add(SubjectEconomicsPanel2, "Economics");
		CTCTPanel.add(SubjectCommercePanel2, "Commerce");
		
		CTCPanel.add(marketing2);
		CTCPanel.add(accounting2);
		CTCPanel.add(commerce2);
		CTCPanel.add(economics2);
		CTCPanel.add(Cback2);
		
		CSubjectCard2.show(CTCTPanel, "Select");
		commercial2.add(CTCPanel, BorderLayout.WEST);
		commercial2.add(CTCTPanel, BorderLayout.CENTER);
		
		classTwoPanel.setLayout(new BorderLayout());
		classTwoPanel.setBackground(Color.black);
		
		
		tabPaneClass2.add(science2, "Science");
		tabPaneClass2.add(art2, "Art");
		tabPaneClass2.add(commercial2, "Commercial");
		
		classTwoPanel.add(new JLabel(department2),BorderLayout.NORTH);
		classTwoPanel.add(tabPaneClass2, BorderLayout.CENTER);
				
		

//
//   CLASS   3
		
		classThreePanel.setLayout(new BorderLayout());
		classThreePanel.setBackground(new Color(255,56,230));
		classThreePanel.add(back3);
		classThreePanel.add(tabPaneClass3);
		
		JPanel science3 = new JPanel();
		JPanel art3 = new JPanel();
		JPanel commercial3 = new JPanel();
		
		CThSPanel.setBackground(Color.black);
		
		CThSPanel.add(english3);
		CThSPanel.add(mathematics3);
		CThSPanel.add(physics3);
		CThSPanel.add(chemistry3);
		CThSPanel.add(biology3);
		CThSPanel.add(agriculture3);
		CThSPanel.add(computer3);
		CThSPanel.add(back3);
		
		SubjectEnglishPanel3.setLayout(new GridLayout(1,1));
		SubjectEnglishPanel3.add(English3SP);
		SubjectMathematicsPanel3.setLayout(new GridLayout(1,1));
		SubjectMathematicsPanel3.add(Maths3SP);
		SubjectChemistryPanel3.setLayout(new GridLayout(1,1));
		SubjectChemistryPanel3.add(ChmList3);
		SubjectPhysicsPanel3.add(Phy3SP);
		SubjectPhysicsPanel3.setLayout(new GridLayout(1,1));
		SubjectBiologyPanel3.add(BioList3);
		SubjectBiologyPanel3.setLayout(new GridLayout(1,1));
		SubjectGeographyPanel3.add(GeoList3);
		SubjectGeographyPanel3.setLayout(new GridLayout(1,1));
		SubjectAgriculturePanel3.add(AgroList3);
		SubjectAgriculturePanel3.setLayout(new GridLayout(1,1));
		SubjectComputerPanel3.add(ComputerList3);
		SubjectComputerPanel3.setLayout(new GridLayout(1,1));
				
		CThTPanel.setLayout(SubjectCard3);
		JPanel thirdP = new JPanel();
		thirdP.add(new JLabel("Please select a Subject"));
		
		CThTPanel.add(thirdP, "Select");
		CThTPanel.add(SubjectEnglishPanel3, "English");
		CThTPanel.add(SubjectMathematicsPanel3, "Mathematics");
		CThTPanel.add(SubjectPhysicsPanel3, "Physics");
		CThTPanel.add(SubjectChemistryPanel3, "Chemistry");
		CThTPanel.add(SubjectBiologyPanel3, "Biology");
		CThTPanel.add(SubjectGeographyPanel3, "Geology");
		CThTPanel.add(SubjectAgriculturePanel3, "Agriculture");
		CThTPanel.add(SubjectComputerPanel3, "Computer");
		
		science3.setBackground(Color.black);
		science3.setLayout(new BorderLayout());
		art3.setBackground(Color.black);
		art3.setLayout(new BorderLayout());
		commercial3.setBackground(Color.black);
		commercial3.setLayout(new BorderLayout());
		CThSPanel.setLayout(new GridLayout(9,1,3,3));
		
		SubjectCard3.show(CThTPanel, "Select");
		
// SCIENCE
		science3.add(CThSPanel, BorderLayout.WEST);
		science3.add(CThTPanel, BorderLayout.CENTER);
		
// ART
		art3.setLayout(new BorderLayout());
		CThAPanel.setLayout(new GridLayout(9,1,3,3));
		CThAPanel.setBackground(Color.black);
		CThATPanel.setLayout(ASubjectCard3);
		
		JPanel A3S = new JPanel();
		A3S.add(new JLabel("Please click a subject"));
		
		SubjectLiteraturePanel3.add(LiteratureList3);
		SubjectLiteraturePanel3.setLayout(new GridLayout(1,1));
		SubjectGovernmentPanel3.add(GovernmentList3);
		SubjectGovernmentPanel3.setLayout(new GridLayout(1,1));
		SubjectCRSPanel3.add(CRSList3);
		SubjectCRSPanel3.setLayout(new GridLayout(1,1));
		SubjectYorubaPanel3.add(YorubaList3);
		SubjectYorubaPanel3.setLayout(new GridLayout(1,1));
		SubjectCivicPanel3.add(CivicList3);
		SubjectCivicPanel3.setLayout(new GridLayout(1,1));
		
		CThATPanel.add(A3S, "Select");
		CThATPanel.add(SubjectLiteraturePanel3, "Literature");
		CThATPanel.add(SubjectGovernmentPanel3, "Government");
		CThATPanel.add(SubjectCRSPanel3, "CRS");
		CThATPanel.add(SubjectYorubaPanel3, "Yoruba");
		CThATPanel.add(SubjectCivicPanel3, "Civic");
		
		CThAPanel.add(literature3);
		CThAPanel.add(government3);
		CThAPanel.add(crs3);
		CThAPanel.add(yoruba3);
		CThAPanel.add(civic3);
		CThAPanel.add(Aback3);
		
		ASubjectCard3.show(CThATPanel, "Select");
		
		art3.add(CThAPanel, BorderLayout.WEST);
		art3.add(CThATPanel, BorderLayout.CENTER);
		
// COMMERCIAL
		commercial3.setLayout(new BorderLayout());
		CThCPanel.setLayout(new GridLayout(9,1,3,3));
		CThCPanel.setBackground(Color.black);
		CThCTPanel.setLayout(CSubjectCard3);
		
		JPanel CThS = new JPanel();
		CThS.add(new JLabel("Please click a subject"));
		
		SubjectCommercePanel3.add(CommerceList3);
		SubjectCommercePanel3.setLayout(new GridLayout(1,1));
		SubjectMarketingPanel3.add(MarketingList3);
		SubjectMarketingPanel3.setLayout(new GridLayout(1,1));
		SubjectAccountingPanel3.add(AccountingList3);
		SubjectAccountingPanel3.setLayout(new GridLayout(1,1));
		SubjectEconomicsPanel3.add(EconomicsList3);
		SubjectEconomicsPanel3.setLayout(new GridLayout(1,1));
		
		SubjectMarketingPanel3.add(MarketingList3);
		SubjectAccountingPanel3.add(AccountingList3);
		SubjectEconomicsPanel3.add(EconomicsList3);
		SubjectCommercePanel3.add(CommerceList3);
		
		CThCTPanel.add(CThS, "Select");
		CThCTPanel.add(SubjectMarketingPanel3, "Marketing");
		CThCTPanel.add(SubjectAccountingPanel3, "Accounting");
		CThCTPanel.add(SubjectEconomicsPanel3, "Economics");
		CThCTPanel.add(SubjectCommercePanel3, "Commerce");
		
		CThCPanel.add(marketing3);
		CThCPanel.add(accounting3);
		CThCPanel.add(commerce3);
		CThCPanel.add(economics3);
		CThCPanel.add(Cback3);
		
		CSubjectCard3.show(CThCTPanel, "Select");
		commercial3.add(CThCPanel, BorderLayout.WEST);
		commercial3.add(CThCTPanel, BorderLayout.CENTER);
		
		classThreePanel.setLayout(new BorderLayout());
		classThreePanel.setBackground(Color.black);
		
		
		tabPaneClass3.add(science3, "Science");
		tabPaneClass3.add(art3, "Art");
		tabPaneClass3.add(commercial3, "Commercial");
		
		classThreePanel.add(new JLabel(department3),BorderLayout.NORTH);
		classThreePanel.add(tabPaneClass3, BorderLayout.CENTER);
		
		
// READING PANELS
		readingPanel.add(ReadingEnglishPanel1, "EnglishReandingClass1");
		readingPanel.add(ReadingMathematicsPanel1, "MathematicsReandingClass1");
		readingPanel.add(ReadingPhysicsPanel1, "PhysicsReandingClass1");
		readingPanel.add(ReadingChemistryPanel1, "ChemistryReandingClass1");
		readingPanel.add(ReadingBiologyPanel1, "BiologyReandingClass1");
		readingPanel.add(ReadingGeographyPanel1, "GeographyReandingClass1");
		readingPanel.add(ReadingAgriculturePanel1, "AgricultureReandingClass1");
		readingPanel.add(ReadingComputerPanel1, "ComputerReandingClass1");
		readingPanel.add(ReadingGovernmentPanel1, "GovernmentReandingClass1");
		readingPanel.add(ReadingLiteraturePanel1, "LiteratureReandingClass1");
		readingPanel.add(ReadingCRSPanel1, "CRSReandingClass1");
		readingPanel.add(ReadingCivicPanel1, "CivicReandingClass1");
		readingPanel.add(ReadingEconomicsPanel1, "EconomicsReandingClass1");
		readingPanel.add(ReadingCommercePanel1, "CommerceReandingClass1");
		readingPanel.add(ReadingYorubaPanel1, "YorubaReandingClass1");
		readingPanel.add(ReadingAccountingPanel1, "AccountingReandingClass1");
		readingPanel.add(ReadingMarketingPanel1, "MarketingReandingClass1");
		
		readingPanel.add(ReadingEnglishPanel2, "EnglishReandingClass2");
		readingPanel.add(ReadingMathematicsPanel2, "MathematicsReandingClass2");
		readingPanel.add(ReadingPhysicsPanel2, "PhysicsReandingClass2");
		readingPanel.add(ReadingChemistryPanel2, "ChemistryReandingClass2");
		readingPanel.add(ReadingBiologyPanel2, "BiologyReandingClass2");
		readingPanel.add(ReadingAgriculturePanel2, "AgricultureReandingClass2");
		readingPanel.add(ReadingComputerPanel2, "ComputerReandingClass2");
		readingPanel.add(ReadingGovernmentPanel2, "GovernmentReandingClass2");
		readingPanel.add(ReadingLiteraturePanel2, "LiteratureReandingClass2");
		readingPanel.add(ReadingCRSPanel2, "CRSReandingClass2");
		readingPanel.add(ReadingCivicPanel2, "CivicReandingClass2");
		readingPanel.add(ReadingEconomicsPanel2, "EconomicsReandingClass2");
		readingPanel.add(ReadingCommercePanel2, "CommerceReandingClass2");
		readingPanel.add(ReadingYorubaPanel2, "YorubaReandingClass2");
		readingPanel.add(ReadingAccountingPanel2, "AccountingReandingClass2");
		readingPanel.add(ReadingMarketingPanel2, "MarketingReandingClass2");
		
		readingPanel.add(ReadingEnglishPanel3, "EnglishReandingClass3");
		readingPanel.add(ReadingMathematicsPanel1, "MathematicsReandingClass3");
		readingPanel.add(ReadingPhysicsPanel3, "PhysicsReandingClass3");
		readingPanel.add(ReadingChemistryPanel3, "ChemistryReandingClass3");
		readingPanel.add(ReadingBiologyPanel3, "BiologyReandingClass3");
		readingPanel.add(ReadingAgriculturePanel3, "AgricultureReandingClass3");
		readingPanel.add(ReadingComputerPanel3, "ComputerReandingClass3");
		readingPanel.add(ReadingGovernmentPanel3, "GovernmentReandingClass3");
		readingPanel.add(ReadingLiteraturePanel3, "LiteratureReandingClass3");
		readingPanel.add(ReadingCRSPanel3, "CRSReandingClass3");
		readingPanel.add(ReadingCivicPanel3, "CivicReandingClass3");
		readingPanel.add(ReadingEconomicsPanel3, "EconomicsReandingClass3");
		readingPanel.add(ReadingCommercePanel3, "CommerceReandingClass3");
		readingPanel.add(ReadingYorubaPanel3, "YorubaReandingClass3");
		readingPanel.add(ReadingAccountingPanel3, "AccountingReandingClass3");
		readingPanel.add(ReadingMarketingPanel3, "MarketingReandingClass3");
		
		
// HOME
		masterPanel.add(panel1,"home");
		masterPanel.add(classOnePanel,"c1p");
		masterPanel.add(classTwoPanel,"c2p");
		masterPanel.add(classThreePanel,"c3p");
		masterPanel.add(readingPanel,"rp");
		
		Card.show(masterPanel, "home");
		
		add(masterPanel);
		
	}

	public static void main(String[] args) {
		
		MyClassRoom view = new MyClassRoom();
		view.Frame();
		view.setTitle("My Class Room");
		view.setSize(1000,700);
		view.setLocationRelativeTo(null);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
	
		JOptionPane.showMessageDialog(null,"Saying Hi !\n\nGreetings from your invisible class Teacher\n\n\nYou are welcome\n\n");
	}
	
// BUTTONS:
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource()==class1) {
				Card.show(masterPanel, "c1p");
			}
			else if (e.getSource()==class2) {
				Card.show(masterPanel, "c2p");
			}
			else if (e.getSource()==class3) {
				Card.show(masterPanel, "c3p");
			}
			else if (e.getSource()==mathematics) {
				SubjectCard.show(COTPanel, "Mathematics");
			}
			else if (e.getSource()==english) {
				SubjectCard.show(COTPanel, "English");
			}
			else if (e.getSource()==physics) {
				SubjectCard.show(COTPanel, "Physics");
			}
			else if (e.getSource()==chemistry) {
				SubjectCard.show(COTPanel, "Chemistry");
			}
			else if (e.getSource()==biology) {
				SubjectCard.show(COTPanel, "Biology");
			}
			else if (e.getSource()==geography) {
				SubjectCard.show(COTPanel, "Geology");
			}
			else if (e.getSource()==agriculture) {
				SubjectCard.show(COTPanel, "Agriculture");
			}
			else if (e.getSource()==computer) {
				SubjectCard.show(COTPanel, "Computer");
			}
			else if (e.getSource()==literature) {
				ASubjectCard.show(COATPanel, "Literature");
			}
			else if (e.getSource()==civic) {
				ASubjectCard.show(COATPanel, "Civic");
			}
			else if (e.getSource()==government) {
				ASubjectCard.show(COATPanel, "Government");
			}
			else if (e.getSource()==crs) {
				ASubjectCard.show(COATPanel, "CRS");
			}
			else if (e.getSource()==yoruba) {
				ASubjectCard.show(COATPanel, "Yoruba");
			}
			else if (e.getSource()==marketing) {
				CSubjectCard.show(COCTPanel, "Marketing");
			}
			else if (e.getSource()==accounting) {
				CSubjectCard.show(COCTPanel, "Accounting");
			}
			else if (e.getSource()==economics) {
				CSubjectCard.show(COCTPanel, "Economics");
			}
			else if (e.getSource()==commerce) {
				CSubjectCard.show(COCTPanel, "Commerce");
			}
			else if (e.getSource()==mathematics2) {
				SubjectCard2.show(CTTPanel, "Mathematics");
			}
			else if (e.getSource()==english2) {
				SubjectCard2.show(CTTPanel, "English");
			}
			else if (e.getSource()==physics2) {
				SubjectCard2.show(CTTPanel, "Physics");
			}
			else if (e.getSource()==chemistry2) {
				SubjectCard2.show(CTTPanel, "Chemistry");
			}
			else if (e.getSource()==biology2) {
				SubjectCard2.show(CTTPanel, "Biology");
			}
			else if (e.getSource()==agriculture2) {
				SubjectCard2.show(CTTPanel, "Agriculture");
			}
			else if (e.getSource()==computer2) {
				SubjectCard2.show(CTTPanel, "Computer");
			}
			else if (e.getSource()==literature2) {
				ASubjectCard2.show(CTATPanel, "Literature");
			}
			else if (e.getSource()==civic2) {
				ASubjectCard2.show(CTATPanel, "Civic");
			}
			else if (e.getSource()==government2) {
				ASubjectCard2.show(CTATPanel, "Government");
			}
			else if (e.getSource()==crs2) {
				ASubjectCard2.show(CTATPanel, "CRS");
			}
			else if (e.getSource()==yoruba2) {
				ASubjectCard2.show(CTATPanel, "Yoruba");
			}
			else if (e.getSource()==marketing2) {
				CSubjectCard2.show(CTCTPanel, "Marketing");
			}
			else if (e.getSource()==accounting2) {
				CSubjectCard2.show(CTCTPanel, "Accounting");
			}
			else if (e.getSource()==economics2) {
				CSubjectCard2.show(CTCTPanel, "Economics");
			}
			else if (e.getSource()==commerce2) {
				CSubjectCard2.show(CTCTPanel, "Commerce");
			}
			else if (e.getSource()==mathematics3) {
				SubjectCard3.show(CThTPanel, "Mathematics");
			}
			else if (e.getSource()==english3) {
				SubjectCard3.show(CThTPanel, "English");
			}
			else if (e.getSource()==physics3) {
				SubjectCard3.show(CThTPanel, "Physics");
			}
			else if (e.getSource()==chemistry3) {
				SubjectCard3.show(CThTPanel, "Chemistry");
			}
			else if (e.getSource()==biology3) {
				SubjectCard3.show(CThTPanel, "Biology");
			}
			else if (e.getSource()==agriculture3) {
				SubjectCard3.show(CThTPanel, "Agriculture");
			}
			else if (e.getSource()==computer3) {
				SubjectCard3.show(CThTPanel, "Computer");
			}
			else if (e.getSource()==literature3) {
				ASubjectCard3.show(CThATPanel, "Literature");
			}
			else if (e.getSource()==civic3) {
				ASubjectCard3.show(CThATPanel, "Civic");
			}
			else if (e.getSource()==government3) {
				ASubjectCard3.show(CThATPanel, "Government");
			}
			else if (e.getSource()==crs3) {
				ASubjectCard3.show(CThATPanel, "CRS");
			}
			else if (e.getSource()==yoruba3) {
				ASubjectCard3.show(CThATPanel, "Yoruba");
			}
			else if (e.getSource()==marketing3) {
				CSubjectCard3.show(CThCTPanel, "Marketing");
			}
			else if (e.getSource()==accounting3) {
				CSubjectCard3.show(CThCTPanel, "Accounting");
			}
			else if (e.getSource()==economics3) {
				CSubjectCard3.show(CThCTPanel, "Economics");
			}
			else if (e.getSource()==commerce3) {
				CSubjectCard3.show(CThCTPanel, "Commerce");
			}
			
// BACKS
			else if (e.getSource()==back1) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==Aback1) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==Cback1) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==back2) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==Aback2) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==Cback2) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==back3) {
				Card.show(masterPanel, "home");
			}
			else if (e.getSource()==Aback3) {
				Card.show(masterPanel, "home");
			}else if (e.getSource()==Cback3) {
				Card.show(masterPanel, "home");
			}
// SUBJECTS
			
			
		}
	}
	
// ITEMS:
	class EnglishListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e){
		//ENGLISH 1
			/*
			int item1 = EnglishList.getSelectedIndex();
			if (item1==0) {
				JOptionPane.showMessageDialog(null, "English Aphabet");
			}
			else if (item1==1) {
				JOptionPane.showMessageDialog(null, "Phone people");
			}
			
		//ENGLISH 2
			int item2 = EnglishList2.getSelectedIndex();
			if (item2==0) {
				JOptionPane.showMessageDialog(null, "English Aphabet2");
				
			}
			else if (item2==1) {
				JOptionPane.showMessageDialog(null, "Phone people2");
			}
			
		//ENGLISH 3
			int item3 = EnglishList3.getSelectedIndex();
			if (item3==0) {
				JOptionPane.showMessageDialog(null, "English Aphabet3");
			}
			else if (item3==1) {
				JOptionPane.showMessageDialog(null, "Phone people3");
			}*/
			
			int English1, English2, English3;
			
			English1 = EnglishList.getSelectedIndex();
			switch (English1) {
			
			case 0:JOptionPane.showMessageDialog(null, "English Aphabet1"); break;
			case 1:JOptionPane.showMessageDialog(null, "fone people 1"); break;
			case 2:JOptionPane.showMessageDialog(null, "Revision of common nouns"); break;
			case 4:JOptionPane.showMessageDialog(null, "Uses of capital letter"); break;
			
			}
			
		}
	}
	class MathematicsListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e){
			int item = MathsList.getSelectedIndex();
			if (item==0) {
				JOptionPane.showMessageDialog(null, "English Aphabet");
			}
			else if (item==1) {
				JOptionPane.showMessageDialog(null, "P");
			}
		}
	}
}
