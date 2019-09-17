
package com.soaint.alejandro.serviceaws.model.servicecloud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactSC {

    private Integer partyId;
    private String partyNumber;
    private Object sourceSystem;
    private Object sourceSystemReferenceValue;
    private Object accountPartyId;
    private Object accountPartyNumber;
    private Object accountSourceSystem;
    private Object accountSourceSystemReferenceValue;
    private Object accountName;
    private Integer personProfileId;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    private Object lastNamePrefix;
    private Object middleName;
    private Object uniqueNameSuffix;
    private String contactName;
    private Object previousLastName;
    private Object secondLastName;
    private Integer ownerPartyId;
    private String ownerPartyNumber;
    private String ownerEmailAddress;
    private String ownerName;
    private String salesProfileNumber;
    private String type;
    private Boolean existingCustomerFlag;
    private Object existingCustomerFlagLastUpdateDate;
    private Boolean namedFlag;
    private Object lastAssignmentDate;
    private Boolean assignmentExceptionFlag;
    private String salesProfileStatus;
    private Object taxpayerIdentificationNumber;
    private Object dateOfBirth;
    private Object placeOfBirth;
    private Object dateOfDeath;
    private Boolean deceasedFlag;
    private Object gender;
    private Object maritalStatus;
    private Object maritalStatusEffectiveDate;
    private Object declaredEthnicity;
    private Object preferredFunctionalCurrency;
    private Object personalIncomeAmount;
    private Boolean headOfHouseholdFlag;
    private Object householdIncomeAmount;
    private Object householdSize;
    private Object salutation;
    private Object salutoryIntroduction;
    private Object title;
    private Object academicTitle;
    private Object initials;
    private Object rentOrOwnIndicator;
    private Object certificationLevel;
    private Object certificationReasonCode;
    private Object comments;
    private Object preferredContactMethod;
    private String favoriteContactFlag;
    private Object department;
    private Object departmentCode;
    private Boolean doNotCallFlag;
    private Boolean doNotContactFlag;
    private Boolean doNotEmailFlag;
    private Boolean doNotMailFlag;
    private Object jobTitle;
    private Object jobTitleCode;
    private Object lastContactDate;
    private Object salesAffinityCode;
    private Object salesBuyingRoleCode;
    private String currencyCode;
    private Object dataCloudStatus;
    private Object lastEnrichmentDate;
    private String partyStatus;
    private String partyType;
    private String createdByModule;
    private String createdBy;
    private String creationDate;
    private String lastUpdateDate;
    private String lastUpdateLogin;
    private String lastUpdatedBy;
    private Object workPhoneContactPointType;
    private Object workPhoneCountryCode;
    private Object workPhoneAreaCode;
    private Object workPhoneNumber;
    private Object workPhoneExtension;
    private Object formattedWorkPhoneNumber;
    private Object rawWorkPhoneNumber;
    private Object mobileContactPointType;
    private Object mobileCountryCode;
    private Object mobileAreaCode;
    private Object mobileNumber;
    private Object mobileExtension;
    private Object formattedMobileNumber;
    private Object rawMobileNumber;
    private Object faxContactPointType;
    private Object faxCountryCode;
    private Object faxAreaCode;
    private Object faxNumber;
    private Object faxExtension;
    private Object formattedFaxNumber;
    private Object rawFaxNumber;
    private Object homePhoneContactPointType;
    private Object homePhoneCountryCode;
    private Object homePhoneAreaCode;
    private Object homePhoneNumber;
    private Object formattedHomePhoneNumber;
    private Object rawHomePhoneNumber;
    private String emailContactPointType;
    private Object emailFormat;
    @JsonProperty("EmailAddress")
    private String emailAddress;
    private Object primaryAddressId;
    private String partyNumberKey;
    private Object sellToPartySiteId;
    private Object classificationCategory;
    private Object classificationCode;
    private Object contactIsPrimaryForAccount;
    private Object nameSuffix;
    private String contactUniqueName;
    private Object recordSet;
    private String sourceObjectType;
    private Object contactRole;
    private Object registrationStatus;
    private Boolean updateFlag;
    private Boolean deleteFlag;
    private Object addressNumber;
    private Object addressElementAttribute1;
    private Object addressElementAttribute2;
    private Object addressElementAttribute3;
    private Object addressElementAttribute4;
    private Object addressElementAttribute5;
    private Object addressLine1;
    private Object addressLine2;
    private Object addressLine3;
    private Object addressLine4;
    private Object building;
    private Object city;
    private Object country;
    private Object county;
    private Object floorNumber;
    private Object postalCode;
    private Object postalPlus4Code;
    private Object province;
    private Object state;
    private Object mailstop;
    private Object addressLinesPhonetic;
    private Object addressType;
    private Object overallPrimaryFormattedPhoneNumber;
    private Object personDEOConstituentTypeC;
    private Object personDEOConstituentTypeCMeaning;
    private Object personDEOACTScoreC;
    private Object personDEOAdviserNameC;
    private Object personDEOAffiliationsC;
    private Object personDEOAffiliationsCMeaning;
    private Boolean personDEOAlumniAssociationMemberC;
    private Object personDEOAttendanceC;
    private Object personDEOCampusVisitDateC;
    private Object personDEOHighSchoolVisitDateC;
    private Object personDEOAwardsC;
    private Object personDEOCoreCourseCompletedC;
    private Object personDEOCoreCourseCompletedCMeaning;
    private Object personDEOCounselorMeetingDateC;
    private Object personDEOCumulativeGPAC;
    private Object personDEOCurrentAcademicYearC;
    private Object personDEOCurrentAcademicYearCMeaning;
    private Object personDEOCurrentSeasonTicketHolderC;
    private Object personDEOCurrentSeasonTicketHolderCMeaning;
    private Object personDEOEmployeeNumberC;
    private Object personDEOEmployerC;
    private Object personDEOEntryTermC;
    private Object personDEOEntryTermCMeaning;
    private Object personDEOFinancialAidStatusC;
    private Object personDEOFinancialAidStatusCMeaning;
    private Boolean personDEOFAFSAAFiledC;
    private Object personDEOGiftClubLevelC;
    private Object personDEOGiftClubLevelCMeaning;
    private Object personDEOGraduationYearC;
    private Object personDEOLastAdvisingDateC;
    private Object personDEOLastCallDateC;
    private Object personDEOLastGiftDateC;
    private Object personDEOLastGiftValueC;
    private String personDEOLastGiftValueCCurrencyCode;
    private Integer personDEOLastGiftValueCCurcyConvRate;
    private Object personDEOLTDGiftsC;
    private String personDEOLTDGiftsCCurrencyCode;
    private Integer personDEOLTDGiftsCCurcyConvRate;
    private Object personDEOLTDAthleticsGiftsC;
    private String personDEOLTDAthleticsGiftsCCurrencyCode;
    private Integer personDEOLTDAthleticsGiftsCCurcyConvRate;
    private Object personDEOManagerC;
    private Boolean personDEOOfficialHighSchoolTranscriptC;
    private Object personDEOOpportunityStatusC;
    private Object personDEOOpportunityStatusCMeaning;
    private Boolean personDEOProbationFlagC;
    private Object personDEOProgramInterestC;
    private Object personDEOProgramInterestCMeaning;
    private Object personDEOProgramTypeC;
    private Object personDEOProgramTypeCMeaning;
    private Object personDEORatingDateC;
    private Object personDEORatingIndicatorC;
    private Object personDEORatingTypeC;
    private Object personDEORatingTypeCMeaning;
    private Object personDEOSATScoreC;
    private Boolean personDEOCampusVisitRegistrationC;
    private Boolean personDEOReferenceLettersC;
    private Object personDEORiskAssessmentScoreC;
    private Boolean personDEOSatisfiedWithFreshmenAdvisingC;
    private Object personDEOStudentIDNumberC;
    private Object personDEOTwitterIDC;
    private Object personDEOWeeklyStudyHoursC;
    private Object personDEOWeeklyStudyHoursCMeaning;
    private Boolean personDEOWatchListC;
    private Boolean personDEOTuitionDepositC;
    private Object personDEOLSSpecialtyC;
    private Object personDEOLSSpecialtyCMeaning;
    private Object personDEOLSRouteC;
    private Object personDEOLSRouteCMeaning;
    private Object personDEOLSCallFrequencyC;
    private Object personDEOLSContactTypeC;
    private Object personDEOLSContactTypeCMeaning;
    private Object personDEOSATScoreTextC;
    private Object personDEOCommerceProfileIDC;
    private Object personDEODaaSFacebookProfileURLC;
    private Object personDEODaaSLinkedInProfileURLC;
    private Object personDEODaaSTwitterHandleC;
    private Object personDEODaaSTwitterFollowersC;
    private Object personDEOEventIdEventtoConstituent;
    private Object personDEOVolunteerRoleC;
    private Object personDEOVolunteerAssignmentC;
    private Object personDEOVolunteerServiceDateC;
    private Object personDEOVolunteerRatingC;
    private Object personDEOCurrentlyReferringC;
    private Object personDEOCurrentSatisfactionLevelC;
    private Object personDEOSpecializationC;
    private Object personDEOSpecialityC;
    private Object personDEOSSNC;
    private String personDEOXSDC;
    private Object personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr;
    private Object salesAccountEORouteC;
    private Object salesAccountEOVisitFreqC;
    private List<Link> links = null;
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public ContactSC(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	

	public ContactSC() {
		super();
	}



	public ContactSC(Integer partyId, String partyNumber, Object sourceSystem, Object sourceSystemReferenceValue,
			Object accountPartyId, Object accountPartyNumber, Object accountSourceSystem,
			Object accountSourceSystemReferenceValue, Object accountName, Integer personProfileId, String firstName,
			String lastName, Object lastNamePrefix, Object middleName, Object uniqueNameSuffix, String contactName,
			Object previousLastName, Object secondLastName, Integer ownerPartyId, String ownerPartyNumber,
			String ownerEmailAddress, String ownerName, String salesProfileNumber, String type,
			Boolean existingCustomerFlag, Object existingCustomerFlagLastUpdateDate, Boolean namedFlag,
			Object lastAssignmentDate, Boolean assignmentExceptionFlag, String salesProfileStatus,
			Object taxpayerIdentificationNumber, Object dateOfBirth, Object placeOfBirth, Object dateOfDeath,
			Boolean deceasedFlag, Object gender, Object maritalStatus, Object maritalStatusEffectiveDate,
			Object declaredEthnicity, Object preferredFunctionalCurrency, Object personalIncomeAmount,
			Boolean headOfHouseholdFlag, Object householdIncomeAmount, Object householdSize, Object salutation,
			Object salutoryIntroduction, Object title, Object academicTitle, Object initials, Object rentOrOwnIndicator,
			Object certificationLevel, Object certificationReasonCode, Object comments, Object preferredContactMethod,
			String favoriteContactFlag, Object department, Object departmentCode, Boolean doNotCallFlag,
			Boolean doNotContactFlag, Boolean doNotEmailFlag, Boolean doNotMailFlag, Object jobTitle,
			Object jobTitleCode, Object lastContactDate, Object salesAffinityCode, Object salesBuyingRoleCode,
			String currencyCode, Object dataCloudStatus, Object lastEnrichmentDate, String partyStatus,
			String partyType, String createdByModule, String createdBy, String creationDate, String lastUpdateDate,
			String lastUpdateLogin, String lastUpdatedBy, Object workPhoneContactPointType, Object workPhoneCountryCode,
			Object workPhoneAreaCode, Object workPhoneNumber, Object workPhoneExtension,
			Object formattedWorkPhoneNumber, Object rawWorkPhoneNumber, Object mobileContactPointType,
			Object mobileCountryCode, Object mobileAreaCode, Object mobileNumber, Object mobileExtension,
			Object formattedMobileNumber, Object rawMobileNumber, Object faxContactPointType, Object faxCountryCode,
			Object faxAreaCode, Object faxNumber, Object faxExtension, Object formattedFaxNumber, Object rawFaxNumber,
			Object homePhoneContactPointType, Object homePhoneCountryCode, Object homePhoneAreaCode,
			Object homePhoneNumber, Object formattedHomePhoneNumber, Object rawHomePhoneNumber,
			String emailContactPointType, Object emailFormat, String emailAddress, Object primaryAddressId,
			String partyNumberKey, Object sellToPartySiteId, Object classificationCategory, Object classificationCode,
			Object contactIsPrimaryForAccount, Object nameSuffix, String contactUniqueName, Object recordSet,
			String sourceObjectType, Object contactRole, Object registrationStatus, Boolean updateFlag,
			Boolean deleteFlag, Object addressNumber, Object addressElementAttribute1, Object addressElementAttribute2,
			Object addressElementAttribute3, Object addressElementAttribute4, Object addressElementAttribute5,
			Object addressLine1, Object addressLine2, Object addressLine3, Object addressLine4, Object building,
			Object city, Object country, Object county, Object floorNumber, Object postalCode, Object postalPlus4Code,
			Object province, Object state, Object mailstop, Object addressLinesPhonetic, Object addressType,
			Object overallPrimaryFormattedPhoneNumber, Object personDEOConstituentTypeC,
			Object personDEOConstituentTypeCMeaning, Object personDEOACTScoreC, Object personDEOAdviserNameC,
			Object personDEOAffiliationsC, Object personDEOAffiliationsCMeaning,
			Boolean personDEOAlumniAssociationMemberC, Object personDEOAttendanceC, Object personDEOCampusVisitDateC,
			Object personDEOHighSchoolVisitDateC, Object personDEOAwardsC, Object personDEOCoreCourseCompletedC,
			Object personDEOCoreCourseCompletedCMeaning, Object personDEOCounselorMeetingDateC,
			Object personDEOCumulativeGPAC, Object personDEOCurrentAcademicYearC,
			Object personDEOCurrentAcademicYearCMeaning, Object personDEOCurrentSeasonTicketHolderC,
			Object personDEOCurrentSeasonTicketHolderCMeaning, Object personDEOEmployeeNumberC,
			Object personDEOEmployerC, Object personDEOEntryTermC, Object personDEOEntryTermCMeaning,
			Object personDEOFinancialAidStatusC, Object personDEOFinancialAidStatusCMeaning,
			Boolean personDEOFAFSAAFiledC, Object personDEOGiftClubLevelC, Object personDEOGiftClubLevelCMeaning,
			Object personDEOGraduationYearC, Object personDEOLastAdvisingDateC, Object personDEOLastCallDateC,
			Object personDEOLastGiftDateC, Object personDEOLastGiftValueC, String personDEOLastGiftValueCCurrencyCode,
			Integer personDEOLastGiftValueCCurcyConvRate, Object personDEOLTDGiftsC,
			String personDEOLTDGiftsCCurrencyCode, Integer personDEOLTDGiftsCCurcyConvRate,
			Object personDEOLTDAthleticsGiftsC, String personDEOLTDAthleticsGiftsCCurrencyCode,
			Integer personDEOLTDAthleticsGiftsCCurcyConvRate, Object personDEOManagerC,
			Boolean personDEOOfficialHighSchoolTranscriptC, Object personDEOOpportunityStatusC,
			Object personDEOOpportunityStatusCMeaning, Boolean personDEOProbationFlagC,
			Object personDEOProgramInterestC, Object personDEOProgramInterestCMeaning, Object personDEOProgramTypeC,
			Object personDEOProgramTypeCMeaning, Object personDEORatingDateC, Object personDEORatingIndicatorC,
			Object personDEORatingTypeC, Object personDEORatingTypeCMeaning, Object personDEOSATScoreC,
			Boolean personDEOCampusVisitRegistrationC, Boolean personDEOReferenceLettersC,
			Object personDEORiskAssessmentScoreC, Boolean personDEOSatisfiedWithFreshmenAdvisingC,
			Object personDEOStudentIDNumberC, Object personDEOTwitterIDC, Object personDEOWeeklyStudyHoursC,
			Object personDEOWeeklyStudyHoursCMeaning, Boolean personDEOWatchListC, Boolean personDEOTuitionDepositC,
			Object personDEOLSSpecialtyC, Object personDEOLSSpecialtyCMeaning, Object personDEOLSRouteC,
			Object personDEOLSRouteCMeaning, Object personDEOLSCallFrequencyC, Object personDEOLSContactTypeC,
			Object personDEOLSContactTypeCMeaning, Object personDEOSATScoreTextC, Object personDEOCommerceProfileIDC,
			Object personDEODaaSFacebookProfileURLC, Object personDEODaaSLinkedInProfileURLC,
			Object personDEODaaSTwitterHandleC, Object personDEODaaSTwitterFollowersC,
			Object personDEOEventIdEventtoConstituent, Object personDEOVolunteerRoleC,
			Object personDEOVolunteerAssignmentC, Object personDEOVolunteerServiceDateC,
			Object personDEOVolunteerRatingC, Object personDEOCurrentlyReferringC,
			Object personDEOCurrentSatisfactionLevelC, Object personDEOSpecializationC, Object personDEOSpecialityC,
			Object personDEOSSNC, String personDEOXSDC,
			Object personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr,
			Object salesAccountEORouteC, Object salesAccountEOVisitFreqC, List<Link> links) {
		super();
		this.partyId = partyId;
		this.partyNumber = partyNumber;
		this.sourceSystem = sourceSystem;
		this.sourceSystemReferenceValue = sourceSystemReferenceValue;
		this.accountPartyId = accountPartyId;
		this.accountPartyNumber = accountPartyNumber;
		this.accountSourceSystem = accountSourceSystem;
		this.accountSourceSystemReferenceValue = accountSourceSystemReferenceValue;
		this.accountName = accountName;
		this.personProfileId = personProfileId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNamePrefix = lastNamePrefix;
		this.middleName = middleName;
		this.uniqueNameSuffix = uniqueNameSuffix;
		this.contactName = contactName;
		this.previousLastName = previousLastName;
		this.secondLastName = secondLastName;
		this.ownerPartyId = ownerPartyId;
		this.ownerPartyNumber = ownerPartyNumber;
		this.ownerEmailAddress = ownerEmailAddress;
		this.ownerName = ownerName;
		this.salesProfileNumber = salesProfileNumber;
		this.type = type;
		this.existingCustomerFlag = existingCustomerFlag;
		this.existingCustomerFlagLastUpdateDate = existingCustomerFlagLastUpdateDate;
		this.namedFlag = namedFlag;
		this.lastAssignmentDate = lastAssignmentDate;
		this.assignmentExceptionFlag = assignmentExceptionFlag;
		this.salesProfileStatus = salesProfileStatus;
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.deceasedFlag = deceasedFlag;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.maritalStatusEffectiveDate = maritalStatusEffectiveDate;
		this.declaredEthnicity = declaredEthnicity;
		this.preferredFunctionalCurrency = preferredFunctionalCurrency;
		this.personalIncomeAmount = personalIncomeAmount;
		this.headOfHouseholdFlag = headOfHouseholdFlag;
		this.householdIncomeAmount = householdIncomeAmount;
		this.householdSize = householdSize;
		this.salutation = salutation;
		this.salutoryIntroduction = salutoryIntroduction;
		this.title = title;
		this.academicTitle = academicTitle;
		this.initials = initials;
		this.rentOrOwnIndicator = rentOrOwnIndicator;
		this.certificationLevel = certificationLevel;
		this.certificationReasonCode = certificationReasonCode;
		this.comments = comments;
		this.preferredContactMethod = preferredContactMethod;
		this.favoriteContactFlag = favoriteContactFlag;
		this.department = department;
		this.departmentCode = departmentCode;
		this.doNotCallFlag = doNotCallFlag;
		this.doNotContactFlag = doNotContactFlag;
		this.doNotEmailFlag = doNotEmailFlag;
		this.doNotMailFlag = doNotMailFlag;
		this.jobTitle = jobTitle;
		this.jobTitleCode = jobTitleCode;
		this.lastContactDate = lastContactDate;
		this.salesAffinityCode = salesAffinityCode;
		this.salesBuyingRoleCode = salesBuyingRoleCode;
		this.currencyCode = currencyCode;
		this.dataCloudStatus = dataCloudStatus;
		this.lastEnrichmentDate = lastEnrichmentDate;
		this.partyStatus = partyStatus;
		this.partyType = partyType;
		this.createdByModule = createdByModule;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateLogin = lastUpdateLogin;
		this.lastUpdatedBy = lastUpdatedBy;
		this.workPhoneContactPointType = workPhoneContactPointType;
		this.workPhoneCountryCode = workPhoneCountryCode;
		this.workPhoneAreaCode = workPhoneAreaCode;
		this.workPhoneNumber = workPhoneNumber;
		this.workPhoneExtension = workPhoneExtension;
		this.formattedWorkPhoneNumber = formattedWorkPhoneNumber;
		this.rawWorkPhoneNumber = rawWorkPhoneNumber;
		this.mobileContactPointType = mobileContactPointType;
		this.mobileCountryCode = mobileCountryCode;
		this.mobileAreaCode = mobileAreaCode;
		this.mobileNumber = mobileNumber;
		this.mobileExtension = mobileExtension;
		this.formattedMobileNumber = formattedMobileNumber;
		this.rawMobileNumber = rawMobileNumber;
		this.faxContactPointType = faxContactPointType;
		this.faxCountryCode = faxCountryCode;
		this.faxAreaCode = faxAreaCode;
		this.faxNumber = faxNumber;
		this.faxExtension = faxExtension;
		this.formattedFaxNumber = formattedFaxNumber;
		this.rawFaxNumber = rawFaxNumber;
		this.homePhoneContactPointType = homePhoneContactPointType;
		this.homePhoneCountryCode = homePhoneCountryCode;
		this.homePhoneAreaCode = homePhoneAreaCode;
		this.homePhoneNumber = homePhoneNumber;
		this.formattedHomePhoneNumber = formattedHomePhoneNumber;
		this.rawHomePhoneNumber = rawHomePhoneNumber;
		this.emailContactPointType = emailContactPointType;
		this.emailFormat = emailFormat;
		this.emailAddress = emailAddress;
		this.primaryAddressId = primaryAddressId;
		this.partyNumberKey = partyNumberKey;
		this.sellToPartySiteId = sellToPartySiteId;
		this.classificationCategory = classificationCategory;
		this.classificationCode = classificationCode;
		this.contactIsPrimaryForAccount = contactIsPrimaryForAccount;
		this.nameSuffix = nameSuffix;
		this.contactUniqueName = contactUniqueName;
		this.recordSet = recordSet;
		this.sourceObjectType = sourceObjectType;
		this.contactRole = contactRole;
		this.registrationStatus = registrationStatus;
		this.updateFlag = updateFlag;
		this.deleteFlag = deleteFlag;
		this.addressNumber = addressNumber;
		this.addressElementAttribute1 = addressElementAttribute1;
		this.addressElementAttribute2 = addressElementAttribute2;
		this.addressElementAttribute3 = addressElementAttribute3;
		this.addressElementAttribute4 = addressElementAttribute4;
		this.addressElementAttribute5 = addressElementAttribute5;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.addressLine4 = addressLine4;
		this.building = building;
		this.city = city;
		this.country = country;
		this.county = county;
		this.floorNumber = floorNumber;
		this.postalCode = postalCode;
		this.postalPlus4Code = postalPlus4Code;
		this.province = province;
		this.state = state;
		this.mailstop = mailstop;
		this.addressLinesPhonetic = addressLinesPhonetic;
		this.addressType = addressType;
		this.overallPrimaryFormattedPhoneNumber = overallPrimaryFormattedPhoneNumber;
		this.personDEOConstituentTypeC = personDEOConstituentTypeC;
		this.personDEOConstituentTypeCMeaning = personDEOConstituentTypeCMeaning;
		this.personDEOACTScoreC = personDEOACTScoreC;
		this.personDEOAdviserNameC = personDEOAdviserNameC;
		this.personDEOAffiliationsC = personDEOAffiliationsC;
		this.personDEOAffiliationsCMeaning = personDEOAffiliationsCMeaning;
		this.personDEOAlumniAssociationMemberC = personDEOAlumniAssociationMemberC;
		this.personDEOAttendanceC = personDEOAttendanceC;
		this.personDEOCampusVisitDateC = personDEOCampusVisitDateC;
		this.personDEOHighSchoolVisitDateC = personDEOHighSchoolVisitDateC;
		this.personDEOAwardsC = personDEOAwardsC;
		this.personDEOCoreCourseCompletedC = personDEOCoreCourseCompletedC;
		this.personDEOCoreCourseCompletedCMeaning = personDEOCoreCourseCompletedCMeaning;
		this.personDEOCounselorMeetingDateC = personDEOCounselorMeetingDateC;
		this.personDEOCumulativeGPAC = personDEOCumulativeGPAC;
		this.personDEOCurrentAcademicYearC = personDEOCurrentAcademicYearC;
		this.personDEOCurrentAcademicYearCMeaning = personDEOCurrentAcademicYearCMeaning;
		this.personDEOCurrentSeasonTicketHolderC = personDEOCurrentSeasonTicketHolderC;
		this.personDEOCurrentSeasonTicketHolderCMeaning = personDEOCurrentSeasonTicketHolderCMeaning;
		this.personDEOEmployeeNumberC = personDEOEmployeeNumberC;
		this.personDEOEmployerC = personDEOEmployerC;
		this.personDEOEntryTermC = personDEOEntryTermC;
		this.personDEOEntryTermCMeaning = personDEOEntryTermCMeaning;
		this.personDEOFinancialAidStatusC = personDEOFinancialAidStatusC;
		this.personDEOFinancialAidStatusCMeaning = personDEOFinancialAidStatusCMeaning;
		this.personDEOFAFSAAFiledC = personDEOFAFSAAFiledC;
		this.personDEOGiftClubLevelC = personDEOGiftClubLevelC;
		this.personDEOGiftClubLevelCMeaning = personDEOGiftClubLevelCMeaning;
		this.personDEOGraduationYearC = personDEOGraduationYearC;
		this.personDEOLastAdvisingDateC = personDEOLastAdvisingDateC;
		this.personDEOLastCallDateC = personDEOLastCallDateC;
		this.personDEOLastGiftDateC = personDEOLastGiftDateC;
		this.personDEOLastGiftValueC = personDEOLastGiftValueC;
		this.personDEOLastGiftValueCCurrencyCode = personDEOLastGiftValueCCurrencyCode;
		this.personDEOLastGiftValueCCurcyConvRate = personDEOLastGiftValueCCurcyConvRate;
		this.personDEOLTDGiftsC = personDEOLTDGiftsC;
		this.personDEOLTDGiftsCCurrencyCode = personDEOLTDGiftsCCurrencyCode;
		this.personDEOLTDGiftsCCurcyConvRate = personDEOLTDGiftsCCurcyConvRate;
		this.personDEOLTDAthleticsGiftsC = personDEOLTDAthleticsGiftsC;
		this.personDEOLTDAthleticsGiftsCCurrencyCode = personDEOLTDAthleticsGiftsCCurrencyCode;
		this.personDEOLTDAthleticsGiftsCCurcyConvRate = personDEOLTDAthleticsGiftsCCurcyConvRate;
		this.personDEOManagerC = personDEOManagerC;
		this.personDEOOfficialHighSchoolTranscriptC = personDEOOfficialHighSchoolTranscriptC;
		this.personDEOOpportunityStatusC = personDEOOpportunityStatusC;
		this.personDEOOpportunityStatusCMeaning = personDEOOpportunityStatusCMeaning;
		this.personDEOProbationFlagC = personDEOProbationFlagC;
		this.personDEOProgramInterestC = personDEOProgramInterestC;
		this.personDEOProgramInterestCMeaning = personDEOProgramInterestCMeaning;
		this.personDEOProgramTypeC = personDEOProgramTypeC;
		this.personDEOProgramTypeCMeaning = personDEOProgramTypeCMeaning;
		this.personDEORatingDateC = personDEORatingDateC;
		this.personDEORatingIndicatorC = personDEORatingIndicatorC;
		this.personDEORatingTypeC = personDEORatingTypeC;
		this.personDEORatingTypeCMeaning = personDEORatingTypeCMeaning;
		this.personDEOSATScoreC = personDEOSATScoreC;
		this.personDEOCampusVisitRegistrationC = personDEOCampusVisitRegistrationC;
		this.personDEOReferenceLettersC = personDEOReferenceLettersC;
		this.personDEORiskAssessmentScoreC = personDEORiskAssessmentScoreC;
		this.personDEOSatisfiedWithFreshmenAdvisingC = personDEOSatisfiedWithFreshmenAdvisingC;
		this.personDEOStudentIDNumberC = personDEOStudentIDNumberC;
		this.personDEOTwitterIDC = personDEOTwitterIDC;
		this.personDEOWeeklyStudyHoursC = personDEOWeeklyStudyHoursC;
		this.personDEOWeeklyStudyHoursCMeaning = personDEOWeeklyStudyHoursCMeaning;
		this.personDEOWatchListC = personDEOWatchListC;
		this.personDEOTuitionDepositC = personDEOTuitionDepositC;
		this.personDEOLSSpecialtyC = personDEOLSSpecialtyC;
		this.personDEOLSSpecialtyCMeaning = personDEOLSSpecialtyCMeaning;
		this.personDEOLSRouteC = personDEOLSRouteC;
		this.personDEOLSRouteCMeaning = personDEOLSRouteCMeaning;
		this.personDEOLSCallFrequencyC = personDEOLSCallFrequencyC;
		this.personDEOLSContactTypeC = personDEOLSContactTypeC;
		this.personDEOLSContactTypeCMeaning = personDEOLSContactTypeCMeaning;
		this.personDEOSATScoreTextC = personDEOSATScoreTextC;
		this.personDEOCommerceProfileIDC = personDEOCommerceProfileIDC;
		this.personDEODaaSFacebookProfileURLC = personDEODaaSFacebookProfileURLC;
		this.personDEODaaSLinkedInProfileURLC = personDEODaaSLinkedInProfileURLC;
		this.personDEODaaSTwitterHandleC = personDEODaaSTwitterHandleC;
		this.personDEODaaSTwitterFollowersC = personDEODaaSTwitterFollowersC;
		this.personDEOEventIdEventtoConstituent = personDEOEventIdEventtoConstituent;
		this.personDEOVolunteerRoleC = personDEOVolunteerRoleC;
		this.personDEOVolunteerAssignmentC = personDEOVolunteerAssignmentC;
		this.personDEOVolunteerServiceDateC = personDEOVolunteerServiceDateC;
		this.personDEOVolunteerRatingC = personDEOVolunteerRatingC;
		this.personDEOCurrentlyReferringC = personDEOCurrentlyReferringC;
		this.personDEOCurrentSatisfactionLevelC = personDEOCurrentSatisfactionLevelC;
		this.personDEOSpecializationC = personDEOSpecializationC;
		this.personDEOSpecialityC = personDEOSpecialityC;
		this.personDEOSSNC = personDEOSSNC;
		this.personDEOXSDC = personDEOXSDC;
		this.personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr = personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr;
		this.salesAccountEORouteC = salesAccountEORouteC;
		this.salesAccountEOVisitFreqC = salesAccountEOVisitFreqC;
		this.links = links;
	}



	public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public Object getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(Object sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Object getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    public void setSourceSystemReferenceValue(Object sourceSystemReferenceValue) {
        this.sourceSystemReferenceValue = sourceSystemReferenceValue;
    }

    public Object getAccountPartyId() {
        return accountPartyId;
    }

    public void setAccountPartyId(Object accountPartyId) {
        this.accountPartyId = accountPartyId;
    }

    public Object getAccountPartyNumber() {
        return accountPartyNumber;
    }

    public void setAccountPartyNumber(Object accountPartyNumber) {
        this.accountPartyNumber = accountPartyNumber;
    }

    public Object getAccountSourceSystem() {
        return accountSourceSystem;
    }

    public void setAccountSourceSystem(Object accountSourceSystem) {
        this.accountSourceSystem = accountSourceSystem;
    }

    public Object getAccountSourceSystemReferenceValue() {
        return accountSourceSystemReferenceValue;
    }

    public void setAccountSourceSystemReferenceValue(Object accountSourceSystemReferenceValue) {
        this.accountSourceSystemReferenceValue = accountSourceSystemReferenceValue;
    }

    public Object getAccountName() {
        return accountName;
    }

    public void setAccountName(Object accountName) {
        this.accountName = accountName;
    }

    public Integer getPersonProfileId() {
        return personProfileId;
    }

    public void setPersonProfileId(Integer personProfileId) {
        this.personProfileId = personProfileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getLastNamePrefix() {
        return lastNamePrefix;
    }

    public void setLastNamePrefix(Object lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Object getUniqueNameSuffix() {
        return uniqueNameSuffix;
    }

    public void setUniqueNameSuffix(Object uniqueNameSuffix) {
        this.uniqueNameSuffix = uniqueNameSuffix;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Object getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(Object previousLastName) {
        this.previousLastName = previousLastName;
    }

    public Object getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(Object secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Integer getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(Integer ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public String getOwnerPartyNumber() {
        return ownerPartyNumber;
    }

    public void setOwnerPartyNumber(String ownerPartyNumber) {
        this.ownerPartyNumber = ownerPartyNumber;
    }

    public String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    public void setOwnerEmailAddress(String ownerEmailAddress) {
        this.ownerEmailAddress = ownerEmailAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSalesProfileNumber() {
        return salesProfileNumber;
    }

    public void setSalesProfileNumber(String salesProfileNumber) {
        this.salesProfileNumber = salesProfileNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getExistingCustomerFlag() {
        return existingCustomerFlag;
    }

    public void setExistingCustomerFlag(Boolean existingCustomerFlag) {
        this.existingCustomerFlag = existingCustomerFlag;
    }

    public Object getExistingCustomerFlagLastUpdateDate() {
        return existingCustomerFlagLastUpdateDate;
    }

    public void setExistingCustomerFlagLastUpdateDate(Object existingCustomerFlagLastUpdateDate) {
        this.existingCustomerFlagLastUpdateDate = existingCustomerFlagLastUpdateDate;
    }

    public Boolean getNamedFlag() {
        return namedFlag;
    }

    public void setNamedFlag(Boolean namedFlag) {
        this.namedFlag = namedFlag;
    }

    public Object getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    public void setLastAssignmentDate(Object lastAssignmentDate) {
        this.lastAssignmentDate = lastAssignmentDate;
    }

    public Boolean getAssignmentExceptionFlag() {
        return assignmentExceptionFlag;
    }

    public void setAssignmentExceptionFlag(Boolean assignmentExceptionFlag) {
        this.assignmentExceptionFlag = assignmentExceptionFlag;
    }

    public String getSalesProfileStatus() {
        return salesProfileStatus;
    }

    public void setSalesProfileStatus(String salesProfileStatus) {
        this.salesProfileStatus = salesProfileStatus;
    }

    public Object getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(Object taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Object placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Object getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Object dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public Boolean getDeceasedFlag() {
        return deceasedFlag;
    }

    public void setDeceasedFlag(Boolean deceasedFlag) {
        this.deceasedFlag = deceasedFlag;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Object getMaritalStatusEffectiveDate() {
        return maritalStatusEffectiveDate;
    }

    public void setMaritalStatusEffectiveDate(Object maritalStatusEffectiveDate) {
        this.maritalStatusEffectiveDate = maritalStatusEffectiveDate;
    }

    public Object getDeclaredEthnicity() {
        return declaredEthnicity;
    }

    public void setDeclaredEthnicity(Object declaredEthnicity) {
        this.declaredEthnicity = declaredEthnicity;
    }

    public Object getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    public void setPreferredFunctionalCurrency(Object preferredFunctionalCurrency) {
        this.preferredFunctionalCurrency = preferredFunctionalCurrency;
    }

    public Object getPersonalIncomeAmount() {
        return personalIncomeAmount;
    }

    public void setPersonalIncomeAmount(Object personalIncomeAmount) {
        this.personalIncomeAmount = personalIncomeAmount;
    }

    public Boolean getHeadOfHouseholdFlag() {
        return headOfHouseholdFlag;
    }

    public void setHeadOfHouseholdFlag(Boolean headOfHouseholdFlag) {
        this.headOfHouseholdFlag = headOfHouseholdFlag;
    }

    public Object getHouseholdIncomeAmount() {
        return householdIncomeAmount;
    }

    public void setHouseholdIncomeAmount(Object householdIncomeAmount) {
        this.householdIncomeAmount = householdIncomeAmount;
    }

    public Object getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(Object householdSize) {
        this.householdSize = householdSize;
    }

    public Object getSalutation() {
        return salutation;
    }

    public void setSalutation(Object salutation) {
        this.salutation = salutation;
    }

    public Object getSalutoryIntroduction() {
        return salutoryIntroduction;
    }

    public void setSalutoryIntroduction(Object salutoryIntroduction) {
        this.salutoryIntroduction = salutoryIntroduction;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(Object academicTitle) {
        this.academicTitle = academicTitle;
    }

    public Object getInitials() {
        return initials;
    }

    public void setInitials(Object initials) {
        this.initials = initials;
    }

    public Object getRentOrOwnIndicator() {
        return rentOrOwnIndicator;
    }

    public void setRentOrOwnIndicator(Object rentOrOwnIndicator) {
        this.rentOrOwnIndicator = rentOrOwnIndicator;
    }

    public Object getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(Object certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public Object getCertificationReasonCode() {
        return certificationReasonCode;
    }

    public void setCertificationReasonCode(Object certificationReasonCode) {
        this.certificationReasonCode = certificationReasonCode;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    public Object getPreferredContactMethod() {
        return preferredContactMethod;
    }

    public void setPreferredContactMethod(Object preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getFavoriteContactFlag() {
        return favoriteContactFlag;
    }

    public void setFavoriteContactFlag(String favoriteContactFlag) {
        this.favoriteContactFlag = favoriteContactFlag;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Object getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Object departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Boolean getDoNotCallFlag() {
        return doNotCallFlag;
    }

    public void setDoNotCallFlag(Boolean doNotCallFlag) {
        this.doNotCallFlag = doNotCallFlag;
    }

    public Boolean getDoNotContactFlag() {
        return doNotContactFlag;
    }

    public void setDoNotContactFlag(Boolean doNotContactFlag) {
        this.doNotContactFlag = doNotContactFlag;
    }

    public Boolean getDoNotEmailFlag() {
        return doNotEmailFlag;
    }

    public void setDoNotEmailFlag(Boolean doNotEmailFlag) {
        this.doNotEmailFlag = doNotEmailFlag;
    }

    public Boolean getDoNotMailFlag() {
        return doNotMailFlag;
    }

    public void setDoNotMailFlag(Boolean doNotMailFlag) {
        this.doNotMailFlag = doNotMailFlag;
    }

    public Object getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Object jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Object getJobTitleCode() {
        return jobTitleCode;
    }

    public void setJobTitleCode(Object jobTitleCode) {
        this.jobTitleCode = jobTitleCode;
    }

    public Object getLastContactDate() {
        return lastContactDate;
    }

    public void setLastContactDate(Object lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    public Object getSalesAffinityCode() {
        return salesAffinityCode;
    }

    public void setSalesAffinityCode(Object salesAffinityCode) {
        this.salesAffinityCode = salesAffinityCode;
    }

    public Object getSalesBuyingRoleCode() {
        return salesBuyingRoleCode;
    }

    public void setSalesBuyingRoleCode(Object salesBuyingRoleCode) {
        this.salesBuyingRoleCode = salesBuyingRoleCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Object getDataCloudStatus() {
        return dataCloudStatus;
    }

    public void setDataCloudStatus(Object dataCloudStatus) {
        this.dataCloudStatus = dataCloudStatus;
    }

    public Object getLastEnrichmentDate() {
        return lastEnrichmentDate;
    }

    public void setLastEnrichmentDate(Object lastEnrichmentDate) {
        this.lastEnrichmentDate = lastEnrichmentDate;
    }

    public String getPartyStatus() {
        return partyStatus;
    }

    public void setPartyStatus(String partyStatus) {
        this.partyStatus = partyStatus;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getCreatedByModule() {
        return createdByModule;
    }

    public void setCreatedByModule(String createdByModule) {
        this.createdByModule = createdByModule;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(String lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Object getWorkPhoneContactPointType() {
        return workPhoneContactPointType;
    }

    public void setWorkPhoneContactPointType(Object workPhoneContactPointType) {
        this.workPhoneContactPointType = workPhoneContactPointType;
    }

    public Object getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    public void setWorkPhoneCountryCode(Object workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    public Object getWorkPhoneAreaCode() {
        return workPhoneAreaCode;
    }

    public void setWorkPhoneAreaCode(Object workPhoneAreaCode) {
        this.workPhoneAreaCode = workPhoneAreaCode;
    }

    public Object getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(Object workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public Object getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    public void setWorkPhoneExtension(Object workPhoneExtension) {
        this.workPhoneExtension = workPhoneExtension;
    }

    public Object getFormattedWorkPhoneNumber() {
        return formattedWorkPhoneNumber;
    }

    public void setFormattedWorkPhoneNumber(Object formattedWorkPhoneNumber) {
        this.formattedWorkPhoneNumber = formattedWorkPhoneNumber;
    }

    public Object getRawWorkPhoneNumber() {
        return rawWorkPhoneNumber;
    }

    public void setRawWorkPhoneNumber(Object rawWorkPhoneNumber) {
        this.rawWorkPhoneNumber = rawWorkPhoneNumber;
    }

    public Object getMobileContactPointType() {
        return mobileContactPointType;
    }

    public void setMobileContactPointType(Object mobileContactPointType) {
        this.mobileContactPointType = mobileContactPointType;
    }

    public Object getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(Object mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public Object getMobileAreaCode() {
        return mobileAreaCode;
    }

    public void setMobileAreaCode(Object mobileAreaCode) {
        this.mobileAreaCode = mobileAreaCode;
    }

    public Object getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Object mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Object getMobileExtension() {
        return mobileExtension;
    }

    public void setMobileExtension(Object mobileExtension) {
        this.mobileExtension = mobileExtension;
    }

    public Object getFormattedMobileNumber() {
        return formattedMobileNumber;
    }

    public void setFormattedMobileNumber(Object formattedMobileNumber) {
        this.formattedMobileNumber = formattedMobileNumber;
    }

    public Object getRawMobileNumber() {
        return rawMobileNumber;
    }

    public void setRawMobileNumber(Object rawMobileNumber) {
        this.rawMobileNumber = rawMobileNumber;
    }

    public Object getFaxContactPointType() {
        return faxContactPointType;
    }

    public void setFaxContactPointType(Object faxContactPointType) {
        this.faxContactPointType = faxContactPointType;
    }

    public Object getFaxCountryCode() {
        return faxCountryCode;
    }

    public void setFaxCountryCode(Object faxCountryCode) {
        this.faxCountryCode = faxCountryCode;
    }

    public Object getFaxAreaCode() {
        return faxAreaCode;
    }

    public void setFaxAreaCode(Object faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }

    public Object getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Object faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Object getFaxExtension() {
        return faxExtension;
    }

    public void setFaxExtension(Object faxExtension) {
        this.faxExtension = faxExtension;
    }

    public Object getFormattedFaxNumber() {
        return formattedFaxNumber;
    }

    public void setFormattedFaxNumber(Object formattedFaxNumber) {
        this.formattedFaxNumber = formattedFaxNumber;
    }

    public Object getRawFaxNumber() {
        return rawFaxNumber;
    }

    public void setRawFaxNumber(Object rawFaxNumber) {
        this.rawFaxNumber = rawFaxNumber;
    }

    public Object getHomePhoneContactPointType() {
        return homePhoneContactPointType;
    }

    public void setHomePhoneContactPointType(Object homePhoneContactPointType) {
        this.homePhoneContactPointType = homePhoneContactPointType;
    }

    public Object getHomePhoneCountryCode() {
        return homePhoneCountryCode;
    }

    public void setHomePhoneCountryCode(Object homePhoneCountryCode) {
        this.homePhoneCountryCode = homePhoneCountryCode;
    }

    public Object getHomePhoneAreaCode() {
        return homePhoneAreaCode;
    }

    public void setHomePhoneAreaCode(Object homePhoneAreaCode) {
        this.homePhoneAreaCode = homePhoneAreaCode;
    }

    public Object getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(Object homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public Object getFormattedHomePhoneNumber() {
        return formattedHomePhoneNumber;
    }

    public void setFormattedHomePhoneNumber(Object formattedHomePhoneNumber) {
        this.formattedHomePhoneNumber = formattedHomePhoneNumber;
    }

    public Object getRawHomePhoneNumber() {
        return rawHomePhoneNumber;
    }

    public void setRawHomePhoneNumber(Object rawHomePhoneNumber) {
        this.rawHomePhoneNumber = rawHomePhoneNumber;
    }

    public String getEmailContactPointType() {
        return emailContactPointType;
    }

    public void setEmailContactPointType(String emailContactPointType) {
        this.emailContactPointType = emailContactPointType;
    }

    public Object getEmailFormat() {
        return emailFormat;
    }

    public void setEmailFormat(Object emailFormat) {
        this.emailFormat = emailFormat;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Object getPrimaryAddressId() {
        return primaryAddressId;
    }

    public void setPrimaryAddressId(Object primaryAddressId) {
        this.primaryAddressId = primaryAddressId;
    }

    public String getPartyNumberKey() {
        return partyNumberKey;
    }

    public void setPartyNumberKey(String partyNumberKey) {
        this.partyNumberKey = partyNumberKey;
    }

    public Object getSellToPartySiteId() {
        return sellToPartySiteId;
    }

    public void setSellToPartySiteId(Object sellToPartySiteId) {
        this.sellToPartySiteId = sellToPartySiteId;
    }

    public Object getClassificationCategory() {
        return classificationCategory;
    }

    public void setClassificationCategory(Object classificationCategory) {
        this.classificationCategory = classificationCategory;
    }

    public Object getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(Object classificationCode) {
        this.classificationCode = classificationCode;
    }

    public Object getContactIsPrimaryForAccount() {
        return contactIsPrimaryForAccount;
    }

    public void setContactIsPrimaryForAccount(Object contactIsPrimaryForAccount) {
        this.contactIsPrimaryForAccount = contactIsPrimaryForAccount;
    }

    public Object getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(Object nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getContactUniqueName() {
        return contactUniqueName;
    }

    public void setContactUniqueName(String contactUniqueName) {
        this.contactUniqueName = contactUniqueName;
    }

    public Object getRecordSet() {
        return recordSet;
    }

    public void setRecordSet(Object recordSet) {
        this.recordSet = recordSet;
    }

    public String getSourceObjectType() {
        return sourceObjectType;
    }

    public void setSourceObjectType(String sourceObjectType) {
        this.sourceObjectType = sourceObjectType;
    }

    public Object getContactRole() {
        return contactRole;
    }

    public void setContactRole(Object contactRole) {
        this.contactRole = contactRole;
    }

    public Object getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(Object registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public Boolean getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(Boolean updateFlag) {
        this.updateFlag = updateFlag;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Object getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Object addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Object getAddressElementAttribute1() {
        return addressElementAttribute1;
    }

    public void setAddressElementAttribute1(Object addressElementAttribute1) {
        this.addressElementAttribute1 = addressElementAttribute1;
    }

    public Object getAddressElementAttribute2() {
        return addressElementAttribute2;
    }

    public void setAddressElementAttribute2(Object addressElementAttribute2) {
        this.addressElementAttribute2 = addressElementAttribute2;
    }

    public Object getAddressElementAttribute3() {
        return addressElementAttribute3;
    }

    public void setAddressElementAttribute3(Object addressElementAttribute3) {
        this.addressElementAttribute3 = addressElementAttribute3;
    }

    public Object getAddressElementAttribute4() {
        return addressElementAttribute4;
    }

    public void setAddressElementAttribute4(Object addressElementAttribute4) {
        this.addressElementAttribute4 = addressElementAttribute4;
    }

    public Object getAddressElementAttribute5() {
        return addressElementAttribute5;
    }

    public void setAddressElementAttribute5(Object addressElementAttribute5) {
        this.addressElementAttribute5 = addressElementAttribute5;
    }

    public Object getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(Object addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Object getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Object getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(Object addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Object getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(Object addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public Object getBuilding() {
        return building;
    }

    public void setBuilding(Object building) {
        this.building = building;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getCounty() {
        return county;
    }

    public void setCounty(Object county) {
        this.county = county;
    }

    public Object getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Object floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public Object getPostalPlus4Code() {
        return postalPlus4Code;
    }

    public void setPostalPlus4Code(Object postalPlus4Code) {
        this.postalPlus4Code = postalPlus4Code;
    }

    public Object getProvince() {
        return province;
    }

    public void setProvince(Object province) {
        this.province = province;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getMailstop() {
        return mailstop;
    }

    public void setMailstop(Object mailstop) {
        this.mailstop = mailstop;
    }

    public Object getAddressLinesPhonetic() {
        return addressLinesPhonetic;
    }

    public void setAddressLinesPhonetic(Object addressLinesPhonetic) {
        this.addressLinesPhonetic = addressLinesPhonetic;
    }

    public Object getAddressType() {
        return addressType;
    }

    public void setAddressType(Object addressType) {
        this.addressType = addressType;
    }

    public Object getOverallPrimaryFormattedPhoneNumber() {
        return overallPrimaryFormattedPhoneNumber;
    }

    public void setOverallPrimaryFormattedPhoneNumber(Object overallPrimaryFormattedPhoneNumber) {
        this.overallPrimaryFormattedPhoneNumber = overallPrimaryFormattedPhoneNumber;
    }

    public Object getPersonDEOConstituentTypeC() {
        return personDEOConstituentTypeC;
    }

    public void setPersonDEOConstituentTypeC(Object personDEOConstituentTypeC) {
        this.personDEOConstituentTypeC = personDEOConstituentTypeC;
    }

    public Object getPersonDEOConstituentTypeCMeaning() {
        return personDEOConstituentTypeCMeaning;
    }

    public void setPersonDEOConstituentTypeCMeaning(Object personDEOConstituentTypeCMeaning) {
        this.personDEOConstituentTypeCMeaning = personDEOConstituentTypeCMeaning;
    }

    public Object getPersonDEOACTScoreC() {
        return personDEOACTScoreC;
    }

    public void setPersonDEOACTScoreC(Object personDEOACTScoreC) {
        this.personDEOACTScoreC = personDEOACTScoreC;
    }

    public Object getPersonDEOAdviserNameC() {
        return personDEOAdviserNameC;
    }

    public void setPersonDEOAdviserNameC(Object personDEOAdviserNameC) {
        this.personDEOAdviserNameC = personDEOAdviserNameC;
    }

    public Object getPersonDEOAffiliationsC() {
        return personDEOAffiliationsC;
    }

    public void setPersonDEOAffiliationsC(Object personDEOAffiliationsC) {
        this.personDEOAffiliationsC = personDEOAffiliationsC;
    }

    public Object getPersonDEOAffiliationsCMeaning() {
        return personDEOAffiliationsCMeaning;
    }

    public void setPersonDEOAffiliationsCMeaning(Object personDEOAffiliationsCMeaning) {
        this.personDEOAffiliationsCMeaning = personDEOAffiliationsCMeaning;
    }

    public Boolean getPersonDEOAlumniAssociationMemberC() {
        return personDEOAlumniAssociationMemberC;
    }

    public void setPersonDEOAlumniAssociationMemberC(Boolean personDEOAlumniAssociationMemberC) {
        this.personDEOAlumniAssociationMemberC = personDEOAlumniAssociationMemberC;
    }

    public Object getPersonDEOAttendanceC() {
        return personDEOAttendanceC;
    }

    public void setPersonDEOAttendanceC(Object personDEOAttendanceC) {
        this.personDEOAttendanceC = personDEOAttendanceC;
    }

    public Object getPersonDEOCampusVisitDateC() {
        return personDEOCampusVisitDateC;
    }

    public void setPersonDEOCampusVisitDateC(Object personDEOCampusVisitDateC) {
        this.personDEOCampusVisitDateC = personDEOCampusVisitDateC;
    }

    public Object getPersonDEOHighSchoolVisitDateC() {
        return personDEOHighSchoolVisitDateC;
    }

    public void setPersonDEOHighSchoolVisitDateC(Object personDEOHighSchoolVisitDateC) {
        this.personDEOHighSchoolVisitDateC = personDEOHighSchoolVisitDateC;
    }

    public Object getPersonDEOAwardsC() {
        return personDEOAwardsC;
    }

    public void setPersonDEOAwardsC(Object personDEOAwardsC) {
        this.personDEOAwardsC = personDEOAwardsC;
    }

    public Object getPersonDEOCoreCourseCompletedC() {
        return personDEOCoreCourseCompletedC;
    }

    public void setPersonDEOCoreCourseCompletedC(Object personDEOCoreCourseCompletedC) {
        this.personDEOCoreCourseCompletedC = personDEOCoreCourseCompletedC;
    }

    public Object getPersonDEOCoreCourseCompletedCMeaning() {
        return personDEOCoreCourseCompletedCMeaning;
    }

    public void setPersonDEOCoreCourseCompletedCMeaning(Object personDEOCoreCourseCompletedCMeaning) {
        this.personDEOCoreCourseCompletedCMeaning = personDEOCoreCourseCompletedCMeaning;
    }

    public Object getPersonDEOCounselorMeetingDateC() {
        return personDEOCounselorMeetingDateC;
    }

    public void setPersonDEOCounselorMeetingDateC(Object personDEOCounselorMeetingDateC) {
        this.personDEOCounselorMeetingDateC = personDEOCounselorMeetingDateC;
    }

    public Object getPersonDEOCumulativeGPAC() {
        return personDEOCumulativeGPAC;
    }

    public void setPersonDEOCumulativeGPAC(Object personDEOCumulativeGPAC) {
        this.personDEOCumulativeGPAC = personDEOCumulativeGPAC;
    }

    public Object getPersonDEOCurrentAcademicYearC() {
        return personDEOCurrentAcademicYearC;
    }

    public void setPersonDEOCurrentAcademicYearC(Object personDEOCurrentAcademicYearC) {
        this.personDEOCurrentAcademicYearC = personDEOCurrentAcademicYearC;
    }

    public Object getPersonDEOCurrentAcademicYearCMeaning() {
        return personDEOCurrentAcademicYearCMeaning;
    }

    public void setPersonDEOCurrentAcademicYearCMeaning(Object personDEOCurrentAcademicYearCMeaning) {
        this.personDEOCurrentAcademicYearCMeaning = personDEOCurrentAcademicYearCMeaning;
    }

    public Object getPersonDEOCurrentSeasonTicketHolderC() {
        return personDEOCurrentSeasonTicketHolderC;
    }

    public void setPersonDEOCurrentSeasonTicketHolderC(Object personDEOCurrentSeasonTicketHolderC) {
        this.personDEOCurrentSeasonTicketHolderC = personDEOCurrentSeasonTicketHolderC;
    }

    public Object getPersonDEOCurrentSeasonTicketHolderCMeaning() {
        return personDEOCurrentSeasonTicketHolderCMeaning;
    }

    public void setPersonDEOCurrentSeasonTicketHolderCMeaning(Object personDEOCurrentSeasonTicketHolderCMeaning) {
        this.personDEOCurrentSeasonTicketHolderCMeaning = personDEOCurrentSeasonTicketHolderCMeaning;
    }

    public Object getPersonDEOEmployeeNumberC() {
        return personDEOEmployeeNumberC;
    }

    public void setPersonDEOEmployeeNumberC(Object personDEOEmployeeNumberC) {
        this.personDEOEmployeeNumberC = personDEOEmployeeNumberC;
    }

    public Object getPersonDEOEmployerC() {
        return personDEOEmployerC;
    }

    public void setPersonDEOEmployerC(Object personDEOEmployerC) {
        this.personDEOEmployerC = personDEOEmployerC;
    }

    public Object getPersonDEOEntryTermC() {
        return personDEOEntryTermC;
    }

    public void setPersonDEOEntryTermC(Object personDEOEntryTermC) {
        this.personDEOEntryTermC = personDEOEntryTermC;
    }

    public Object getPersonDEOEntryTermCMeaning() {
        return personDEOEntryTermCMeaning;
    }

    public void setPersonDEOEntryTermCMeaning(Object personDEOEntryTermCMeaning) {
        this.personDEOEntryTermCMeaning = personDEOEntryTermCMeaning;
    }

    public Object getPersonDEOFinancialAidStatusC() {
        return personDEOFinancialAidStatusC;
    }

    public void setPersonDEOFinancialAidStatusC(Object personDEOFinancialAidStatusC) {
        this.personDEOFinancialAidStatusC = personDEOFinancialAidStatusC;
    }

    public Object getPersonDEOFinancialAidStatusCMeaning() {
        return personDEOFinancialAidStatusCMeaning;
    }

    public void setPersonDEOFinancialAidStatusCMeaning(Object personDEOFinancialAidStatusCMeaning) {
        this.personDEOFinancialAidStatusCMeaning = personDEOFinancialAidStatusCMeaning;
    }

    public Boolean getPersonDEOFAFSAAFiledC() {
        return personDEOFAFSAAFiledC;
    }

    public void setPersonDEOFAFSAAFiledC(Boolean personDEOFAFSAAFiledC) {
        this.personDEOFAFSAAFiledC = personDEOFAFSAAFiledC;
    }

    public Object getPersonDEOGiftClubLevelC() {
        return personDEOGiftClubLevelC;
    }

    public void setPersonDEOGiftClubLevelC(Object personDEOGiftClubLevelC) {
        this.personDEOGiftClubLevelC = personDEOGiftClubLevelC;
    }

    public Object getPersonDEOGiftClubLevelCMeaning() {
        return personDEOGiftClubLevelCMeaning;
    }

    public void setPersonDEOGiftClubLevelCMeaning(Object personDEOGiftClubLevelCMeaning) {
        this.personDEOGiftClubLevelCMeaning = personDEOGiftClubLevelCMeaning;
    }

    public Object getPersonDEOGraduationYearC() {
        return personDEOGraduationYearC;
    }

    public void setPersonDEOGraduationYearC(Object personDEOGraduationYearC) {
        this.personDEOGraduationYearC = personDEOGraduationYearC;
    }

    public Object getPersonDEOLastAdvisingDateC() {
        return personDEOLastAdvisingDateC;
    }

    public void setPersonDEOLastAdvisingDateC(Object personDEOLastAdvisingDateC) {
        this.personDEOLastAdvisingDateC = personDEOLastAdvisingDateC;
    }

    public Object getPersonDEOLastCallDateC() {
        return personDEOLastCallDateC;
    }

    public void setPersonDEOLastCallDateC(Object personDEOLastCallDateC) {
        this.personDEOLastCallDateC = personDEOLastCallDateC;
    }

    public Object getPersonDEOLastGiftDateC() {
        return personDEOLastGiftDateC;
    }

    public void setPersonDEOLastGiftDateC(Object personDEOLastGiftDateC) {
        this.personDEOLastGiftDateC = personDEOLastGiftDateC;
    }

    public Object getPersonDEOLastGiftValueC() {
        return personDEOLastGiftValueC;
    }

    public void setPersonDEOLastGiftValueC(Object personDEOLastGiftValueC) {
        this.personDEOLastGiftValueC = personDEOLastGiftValueC;
    }

    public String getPersonDEOLastGiftValueCCurrencyCode() {
        return personDEOLastGiftValueCCurrencyCode;
    }

    public void setPersonDEOLastGiftValueCCurrencyCode(String personDEOLastGiftValueCCurrencyCode) {
        this.personDEOLastGiftValueCCurrencyCode = personDEOLastGiftValueCCurrencyCode;
    }

    public Integer getPersonDEOLastGiftValueCCurcyConvRate() {
        return personDEOLastGiftValueCCurcyConvRate;
    }

    public void setPersonDEOLastGiftValueCCurcyConvRate(Integer personDEOLastGiftValueCCurcyConvRate) {
        this.personDEOLastGiftValueCCurcyConvRate = personDEOLastGiftValueCCurcyConvRate;
    }

    public Object getPersonDEOLTDGiftsC() {
        return personDEOLTDGiftsC;
    }

    public void setPersonDEOLTDGiftsC(Object personDEOLTDGiftsC) {
        this.personDEOLTDGiftsC = personDEOLTDGiftsC;
    }

    public String getPersonDEOLTDGiftsCCurrencyCode() {
        return personDEOLTDGiftsCCurrencyCode;
    }

    public void setPersonDEOLTDGiftsCCurrencyCode(String personDEOLTDGiftsCCurrencyCode) {
        this.personDEOLTDGiftsCCurrencyCode = personDEOLTDGiftsCCurrencyCode;
    }

    public Integer getPersonDEOLTDGiftsCCurcyConvRate() {
        return personDEOLTDGiftsCCurcyConvRate;
    }

    public void setPersonDEOLTDGiftsCCurcyConvRate(Integer personDEOLTDGiftsCCurcyConvRate) {
        this.personDEOLTDGiftsCCurcyConvRate = personDEOLTDGiftsCCurcyConvRate;
    }

    public Object getPersonDEOLTDAthleticsGiftsC() {
        return personDEOLTDAthleticsGiftsC;
    }

    public void setPersonDEOLTDAthleticsGiftsC(Object personDEOLTDAthleticsGiftsC) {
        this.personDEOLTDAthleticsGiftsC = personDEOLTDAthleticsGiftsC;
    }

    public String getPersonDEOLTDAthleticsGiftsCCurrencyCode() {
        return personDEOLTDAthleticsGiftsCCurrencyCode;
    }

    public void setPersonDEOLTDAthleticsGiftsCCurrencyCode(String personDEOLTDAthleticsGiftsCCurrencyCode) {
        this.personDEOLTDAthleticsGiftsCCurrencyCode = personDEOLTDAthleticsGiftsCCurrencyCode;
    }

    public Integer getPersonDEOLTDAthleticsGiftsCCurcyConvRate() {
        return personDEOLTDAthleticsGiftsCCurcyConvRate;
    }

    public void setPersonDEOLTDAthleticsGiftsCCurcyConvRate(Integer personDEOLTDAthleticsGiftsCCurcyConvRate) {
        this.personDEOLTDAthleticsGiftsCCurcyConvRate = personDEOLTDAthleticsGiftsCCurcyConvRate;
    }

    public Object getPersonDEOManagerC() {
        return personDEOManagerC;
    }

    public void setPersonDEOManagerC(Object personDEOManagerC) {
        this.personDEOManagerC = personDEOManagerC;
    }

    public Boolean getPersonDEOOfficialHighSchoolTranscriptC() {
        return personDEOOfficialHighSchoolTranscriptC;
    }

    public void setPersonDEOOfficialHighSchoolTranscriptC(Boolean personDEOOfficialHighSchoolTranscriptC) {
        this.personDEOOfficialHighSchoolTranscriptC = personDEOOfficialHighSchoolTranscriptC;
    }

    public Object getPersonDEOOpportunityStatusC() {
        return personDEOOpportunityStatusC;
    }

    public void setPersonDEOOpportunityStatusC(Object personDEOOpportunityStatusC) {
        this.personDEOOpportunityStatusC = personDEOOpportunityStatusC;
    }

    public Object getPersonDEOOpportunityStatusCMeaning() {
        return personDEOOpportunityStatusCMeaning;
    }

    public void setPersonDEOOpportunityStatusCMeaning(Object personDEOOpportunityStatusCMeaning) {
        this.personDEOOpportunityStatusCMeaning = personDEOOpportunityStatusCMeaning;
    }

    public Boolean getPersonDEOProbationFlagC() {
        return personDEOProbationFlagC;
    }

    public void setPersonDEOProbationFlagC(Boolean personDEOProbationFlagC) {
        this.personDEOProbationFlagC = personDEOProbationFlagC;
    }

    public Object getPersonDEOProgramInterestC() {
        return personDEOProgramInterestC;
    }

    public void setPersonDEOProgramInterestC(Object personDEOProgramInterestC) {
        this.personDEOProgramInterestC = personDEOProgramInterestC;
    }

    public Object getPersonDEOProgramInterestCMeaning() {
        return personDEOProgramInterestCMeaning;
    }

    public void setPersonDEOProgramInterestCMeaning(Object personDEOProgramInterestCMeaning) {
        this.personDEOProgramInterestCMeaning = personDEOProgramInterestCMeaning;
    }

    public Object getPersonDEOProgramTypeC() {
        return personDEOProgramTypeC;
    }

    public void setPersonDEOProgramTypeC(Object personDEOProgramTypeC) {
        this.personDEOProgramTypeC = personDEOProgramTypeC;
    }

    public Object getPersonDEOProgramTypeCMeaning() {
        return personDEOProgramTypeCMeaning;
    }

    public void setPersonDEOProgramTypeCMeaning(Object personDEOProgramTypeCMeaning) {
        this.personDEOProgramTypeCMeaning = personDEOProgramTypeCMeaning;
    }

    public Object getPersonDEORatingDateC() {
        return personDEORatingDateC;
    }

    public void setPersonDEORatingDateC(Object personDEORatingDateC) {
        this.personDEORatingDateC = personDEORatingDateC;
    }

    public Object getPersonDEORatingIndicatorC() {
        return personDEORatingIndicatorC;
    }

    public void setPersonDEORatingIndicatorC(Object personDEORatingIndicatorC) {
        this.personDEORatingIndicatorC = personDEORatingIndicatorC;
    }

    public Object getPersonDEORatingTypeC() {
        return personDEORatingTypeC;
    }

    public void setPersonDEORatingTypeC(Object personDEORatingTypeC) {
        this.personDEORatingTypeC = personDEORatingTypeC;
    }

    public Object getPersonDEORatingTypeCMeaning() {
        return personDEORatingTypeCMeaning;
    }

    public void setPersonDEORatingTypeCMeaning(Object personDEORatingTypeCMeaning) {
        this.personDEORatingTypeCMeaning = personDEORatingTypeCMeaning;
    }

    public Object getPersonDEOSATScoreC() {
        return personDEOSATScoreC;
    }

    public void setPersonDEOSATScoreC(Object personDEOSATScoreC) {
        this.personDEOSATScoreC = personDEOSATScoreC;
    }

    public Boolean getPersonDEOCampusVisitRegistrationC() {
        return personDEOCampusVisitRegistrationC;
    }

    public void setPersonDEOCampusVisitRegistrationC(Boolean personDEOCampusVisitRegistrationC) {
        this.personDEOCampusVisitRegistrationC = personDEOCampusVisitRegistrationC;
    }

    public Boolean getPersonDEOReferenceLettersC() {
        return personDEOReferenceLettersC;
    }

    public void setPersonDEOReferenceLettersC(Boolean personDEOReferenceLettersC) {
        this.personDEOReferenceLettersC = personDEOReferenceLettersC;
    }

    public Object getPersonDEORiskAssessmentScoreC() {
        return personDEORiskAssessmentScoreC;
    }

    public void setPersonDEORiskAssessmentScoreC(Object personDEORiskAssessmentScoreC) {
        this.personDEORiskAssessmentScoreC = personDEORiskAssessmentScoreC;
    }

    public Boolean getPersonDEOSatisfiedWithFreshmenAdvisingC() {
        return personDEOSatisfiedWithFreshmenAdvisingC;
    }

    public void setPersonDEOSatisfiedWithFreshmenAdvisingC(Boolean personDEOSatisfiedWithFreshmenAdvisingC) {
        this.personDEOSatisfiedWithFreshmenAdvisingC = personDEOSatisfiedWithFreshmenAdvisingC;
    }

    public Object getPersonDEOStudentIDNumberC() {
        return personDEOStudentIDNumberC;
    }

    public void setPersonDEOStudentIDNumberC(Object personDEOStudentIDNumberC) {
        this.personDEOStudentIDNumberC = personDEOStudentIDNumberC;
    }

    public Object getPersonDEOTwitterIDC() {
        return personDEOTwitterIDC;
    }

    public void setPersonDEOTwitterIDC(Object personDEOTwitterIDC) {
        this.personDEOTwitterIDC = personDEOTwitterIDC;
    }

    public Object getPersonDEOWeeklyStudyHoursC() {
        return personDEOWeeklyStudyHoursC;
    }

    public void setPersonDEOWeeklyStudyHoursC(Object personDEOWeeklyStudyHoursC) {
        this.personDEOWeeklyStudyHoursC = personDEOWeeklyStudyHoursC;
    }

    public Object getPersonDEOWeeklyStudyHoursCMeaning() {
        return personDEOWeeklyStudyHoursCMeaning;
    }

    public void setPersonDEOWeeklyStudyHoursCMeaning(Object personDEOWeeklyStudyHoursCMeaning) {
        this.personDEOWeeklyStudyHoursCMeaning = personDEOWeeklyStudyHoursCMeaning;
    }

    public Boolean getPersonDEOWatchListC() {
        return personDEOWatchListC;
    }

    public void setPersonDEOWatchListC(Boolean personDEOWatchListC) {
        this.personDEOWatchListC = personDEOWatchListC;
    }

    public Boolean getPersonDEOTuitionDepositC() {
        return personDEOTuitionDepositC;
    }

    public void setPersonDEOTuitionDepositC(Boolean personDEOTuitionDepositC) {
        this.personDEOTuitionDepositC = personDEOTuitionDepositC;
    }

    public Object getPersonDEOLSSpecialtyC() {
        return personDEOLSSpecialtyC;
    }

    public void setPersonDEOLSSpecialtyC(Object personDEOLSSpecialtyC) {
        this.personDEOLSSpecialtyC = personDEOLSSpecialtyC;
    }

    public Object getPersonDEOLSSpecialtyCMeaning() {
        return personDEOLSSpecialtyCMeaning;
    }

    public void setPersonDEOLSSpecialtyCMeaning(Object personDEOLSSpecialtyCMeaning) {
        this.personDEOLSSpecialtyCMeaning = personDEOLSSpecialtyCMeaning;
    }

    public Object getPersonDEOLSRouteC() {
        return personDEOLSRouteC;
    }

    public void setPersonDEOLSRouteC(Object personDEOLSRouteC) {
        this.personDEOLSRouteC = personDEOLSRouteC;
    }

    public Object getPersonDEOLSRouteCMeaning() {
        return personDEOLSRouteCMeaning;
    }

    public void setPersonDEOLSRouteCMeaning(Object personDEOLSRouteCMeaning) {
        this.personDEOLSRouteCMeaning = personDEOLSRouteCMeaning;
    }

    public Object getPersonDEOLSCallFrequencyC() {
        return personDEOLSCallFrequencyC;
    }

    public void setPersonDEOLSCallFrequencyC(Object personDEOLSCallFrequencyC) {
        this.personDEOLSCallFrequencyC = personDEOLSCallFrequencyC;
    }

    public Object getPersonDEOLSContactTypeC() {
        return personDEOLSContactTypeC;
    }

    public void setPersonDEOLSContactTypeC(Object personDEOLSContactTypeC) {
        this.personDEOLSContactTypeC = personDEOLSContactTypeC;
    }

    public Object getPersonDEOLSContactTypeCMeaning() {
        return personDEOLSContactTypeCMeaning;
    }

    public void setPersonDEOLSContactTypeCMeaning(Object personDEOLSContactTypeCMeaning) {
        this.personDEOLSContactTypeCMeaning = personDEOLSContactTypeCMeaning;
    }

    public Object getPersonDEOSATScoreTextC() {
        return personDEOSATScoreTextC;
    }

    public void setPersonDEOSATScoreTextC(Object personDEOSATScoreTextC) {
        this.personDEOSATScoreTextC = personDEOSATScoreTextC;
    }

    public Object getPersonDEOCommerceProfileIDC() {
        return personDEOCommerceProfileIDC;
    }

    public void setPersonDEOCommerceProfileIDC(Object personDEOCommerceProfileIDC) {
        this.personDEOCommerceProfileIDC = personDEOCommerceProfileIDC;
    }

    public Object getPersonDEODaaSFacebookProfileURLC() {
        return personDEODaaSFacebookProfileURLC;
    }

    public void setPersonDEODaaSFacebookProfileURLC(Object personDEODaaSFacebookProfileURLC) {
        this.personDEODaaSFacebookProfileURLC = personDEODaaSFacebookProfileURLC;
    }

    public Object getPersonDEODaaSLinkedInProfileURLC() {
        return personDEODaaSLinkedInProfileURLC;
    }

    public void setPersonDEODaaSLinkedInProfileURLC(Object personDEODaaSLinkedInProfileURLC) {
        this.personDEODaaSLinkedInProfileURLC = personDEODaaSLinkedInProfileURLC;
    }

    public Object getPersonDEODaaSTwitterHandleC() {
        return personDEODaaSTwitterHandleC;
    }

    public void setPersonDEODaaSTwitterHandleC(Object personDEODaaSTwitterHandleC) {
        this.personDEODaaSTwitterHandleC = personDEODaaSTwitterHandleC;
    }

    public Object getPersonDEODaaSTwitterFollowersC() {
        return personDEODaaSTwitterFollowersC;
    }

    public void setPersonDEODaaSTwitterFollowersC(Object personDEODaaSTwitterFollowersC) {
        this.personDEODaaSTwitterFollowersC = personDEODaaSTwitterFollowersC;
    }

    public Object getPersonDEOEventIdEventtoConstituent() {
        return personDEOEventIdEventtoConstituent;
    }

    public void setPersonDEOEventIdEventtoConstituent(Object personDEOEventIdEventtoConstituent) {
        this.personDEOEventIdEventtoConstituent = personDEOEventIdEventtoConstituent;
    }

    public Object getPersonDEOVolunteerRoleC() {
        return personDEOVolunteerRoleC;
    }

    public void setPersonDEOVolunteerRoleC(Object personDEOVolunteerRoleC) {
        this.personDEOVolunteerRoleC = personDEOVolunteerRoleC;
    }

    public Object getPersonDEOVolunteerAssignmentC() {
        return personDEOVolunteerAssignmentC;
    }

    public void setPersonDEOVolunteerAssignmentC(Object personDEOVolunteerAssignmentC) {
        this.personDEOVolunteerAssignmentC = personDEOVolunteerAssignmentC;
    }

    public Object getPersonDEOVolunteerServiceDateC() {
        return personDEOVolunteerServiceDateC;
    }

    public void setPersonDEOVolunteerServiceDateC(Object personDEOVolunteerServiceDateC) {
        this.personDEOVolunteerServiceDateC = personDEOVolunteerServiceDateC;
    }

    public Object getPersonDEOVolunteerRatingC() {
        return personDEOVolunteerRatingC;
    }

    public void setPersonDEOVolunteerRatingC(Object personDEOVolunteerRatingC) {
        this.personDEOVolunteerRatingC = personDEOVolunteerRatingC;
    }

    public Object getPersonDEOCurrentlyReferringC() {
        return personDEOCurrentlyReferringC;
    }

    public void setPersonDEOCurrentlyReferringC(Object personDEOCurrentlyReferringC) {
        this.personDEOCurrentlyReferringC = personDEOCurrentlyReferringC;
    }

    public Object getPersonDEOCurrentSatisfactionLevelC() {
        return personDEOCurrentSatisfactionLevelC;
    }

    public void setPersonDEOCurrentSatisfactionLevelC(Object personDEOCurrentSatisfactionLevelC) {
        this.personDEOCurrentSatisfactionLevelC = personDEOCurrentSatisfactionLevelC;
    }

    public Object getPersonDEOSpecializationC() {
        return personDEOSpecializationC;
    }

    public void setPersonDEOSpecializationC(Object personDEOSpecializationC) {
        this.personDEOSpecializationC = personDEOSpecializationC;
    }

    public Object getPersonDEOSpecialityC() {
        return personDEOSpecialityC;
    }

    public void setPersonDEOSpecialityC(Object personDEOSpecialityC) {
        this.personDEOSpecialityC = personDEOSpecialityC;
    }

    public Object getPersonDEOSSNC() {
        return personDEOSSNC;
    }

    public void setPersonDEOSSNC(Object personDEOSSNC) {
        this.personDEOSSNC = personDEOSSNC;
    }

    public String getPersonDEOXSDC() {
        return personDEOXSDC;
    }

    public void setPersonDEOXSDC(String personDEOXSDC) {
        this.personDEOXSDC = personDEOXSDC;
    }

    public Object getPersonDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr() {
        return personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr;
    }

    public void setPersonDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr(Object personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr) {
        this.personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr = personDEOExtnHzFuseContactEditLayoutDigitalActivitiesLay1542624245292Expr;
    }

    public Object getSalesAccountEORouteC() {
        return salesAccountEORouteC;
    }

    public void setSalesAccountEORouteC(Object salesAccountEORouteC) {
        this.salesAccountEORouteC = salesAccountEORouteC;
    }

    public Object getSalesAccountEOVisitFreqC() {
        return salesAccountEOVisitFreqC;
    }

    public void setSalesAccountEOVisitFreqC(Object salesAccountEOVisitFreqC) {
        this.salesAccountEOVisitFreqC = salesAccountEOVisitFreqC;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
