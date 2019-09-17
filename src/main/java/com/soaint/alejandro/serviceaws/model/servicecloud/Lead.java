
package com.soaint.alejandro.serviceaws.model.servicecloud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RecordSet",
    "Name",
    "LeadNumber",
    "OwnerPartyName",
    "StatusCode",
    "Rank",
    "SourceCode",
    "CustomerPartyName",
    "ProductGroupName",
    "InventoryItemDescription",
    "CreationDate",
    "RegistrationNumber",
    "PartnerPartyName",
    "RegistrationType",
    "RegistrationStatus",
    "PrimaryContactPartyName",
    "Timeframe",
    "LastUpdateDate",
    "LeadId",
    "CreatedBy",
    "LastUpdatedBy",
    "LastUpdateLogin",
    "ToReassignFlag",
    "Score",
    "CustomerId",
    "BusinessUnitId",
    "PrimaryContactId",
    "Description",
    "RejectByUserId",
    "RejectComment",
    "RejectReasonCode",
    "RetireComment",
    "RetireReasonCode",
    "ReassignComment",
    "ReassignReasonCode",
    "AssignmentStatusCode",
    "ChannelType",
    "OwnerId",
    "PrimaryContactPersonLastName",
    "PrimaryContactCountry",
    "PrimaryInventoryItemId",
    "PrimaryInventoryOrgId",
    "CurrencyCode",
    "LeadAcceptedFlag",
    "PrimaryProductGroupId",
    "PrimaryContactRelationshipId",
    "LeadAging",
    "FormattedPhoneNumber1",
    "ProductGroupDescription",
    "BudgetAmount",
    "BudgetCurrencyCode",
    "BudgetStatus",
    "CustomerNeed",
    "DecisionMakerIdentifiedFlag",
    "Project",
    "QualifiedDate",
    "EstimatedCloseDate",
    "ExpirationDate",
    "ApprovalDate",
    "PartnerId",
    "PartnerType",
    "SalesChannel",
    "PartnerProgramId",
    "AcceptedDate",
    "ProgramName",
    "DealAmount",
    "LastAssignmentDate",
    "ClassCode1",
    "ClassCode2",
    "ClassCode3",
    "ClassCode4",
    "OrganizationType",
    "OrganizationSize",
    "PrimaryContactAddress1",
    "PrimaryContactAddress2",
    "PrimaryContactAddress3",
    "PrimaryContactCity",
    "PrimaryContactCounty",
    "PrimaryContactPersonFirstName",
    "PrimaryContactPersonMiddleName",
    "PrimaryContactPostalCode",
    "PrimaryContactProvince",
    "PrimaryContactState",
    "QualificationScore",
    "PrimaryContactEmailAddress",
    "AcceptedDateTime",
    "ApprovalDateTime",
    "ConvertedDateTime",
    "QualifiedDateTime",
    "RejectedDateTime",
    "RetiredDateTime",
    "JobTitle",
    "CampaignName",
    "PrimaryPhoneAreaCode",
    "PrimaryPhoneCountryCode",
    "PrimaryPhoneNumber",
    "WorkPhoneAreaCode",
    "WorkPhoneCountryCode",
    "WorkPhoneNumber",
    "AddrElementAttribute1",
    "AddrElementAttribute2",
    "AddrElementAttribute3",
    "AddrElementAttribute4",
    "AddrElementAttribute5",
    "Building",
    "AddressLinesPhonetic",
    "FloorNumber",
    "PostalPlus4Code",
    "PrimaryContactAddress4",
    "PrimaryContactCountryName",
    "UpdateFlag",
    "DeleteFlag",
    "AssetId",
    "AssetNumber",
    "ContactFormattedAddress",
    "Latitude",
    "Longitude",
    "Distance",
    "AssetSerialNumber",
    "AccountPartyNumber",
    "ContactPartyNumber",
    "OwnerPartyNumber",
    "PartnerProgramNumber",
    "PartnerCompanyNumber",
    "PrimaryProductGroupReferenceNumber",
    "PrimaryInventoryItemNumber",
    "GSEEloquaScore_c",
    "GSENurture_c",
    "GSESocialId_c",
    "GSESource_c",
    "ACTScore_c",
    "Alumnus_c",
    "CampusRole_c",
    "CampusRole_cMeaning",
    "CurrentAcademicYear_c",
    "CurrentAcademicYear_cMeaning",
    "CurrentGPA_c",
    "DesignationInterest_c",
    "DesignationInterest_cMeaning",
    "EarlyAdmissions_c",
    "EntryTerm_c",
    "EntryTerm_cMeaning",
    "GREScore_c",
    "GMATScore_c",
    "LeadRank_c",
    "LeadRank_cMeaning",
    "InquiryScore_c",
    "InquirySource_c",
    "InquirySource_cMeaning",
    "InternationalStudent_c",
    "I20Form_c",
    "Major_c",
    "Major_cMeaning",
    "ProgramInterest_c",
    "ProgramInterest_cMeaning",
    "Minor_c",
    "Minor_cMeaning",
    "SATScore_c",
    "TransferStudent_c",
    "GiftPotential_c",
    "GiftPotential_cCurrencyCode",
    "GiftPotential_cCurcyConvRate",
    "LSPrimaryCompetitor_Id_c",
    "LSPrimaryCompetitor_c",
    "ProgramType_c",
    "ProgramType_cMeaning",
    "HELeadType_c",
    "HELeadType_cMeaning",
    "SATScoreText_c",
    "Region_c",
    "Country_c",
    "BusinessGroup_c",
    "Practice_c",
    "TargetBidDate_c",
    "TargetContractDate_c",
    "TargetStartDate_c",
    "links"
})
public class Lead {

    @JsonProperty("RecordSet")
    private Object recordSet;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("LeadNumber")
    private String leadNumber;
    @JsonProperty("OwnerPartyName")
    private String ownerPartyName;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("Rank")
    private Object rank;
    @JsonProperty("SourceCode")
    private Object sourceCode;
    @JsonProperty("CustomerPartyName")
    private String customerPartyName;
    @JsonProperty("ProductGroupName")
    private Object productGroupName;
    @JsonProperty("InventoryItemDescription")
    private Object inventoryItemDescription;
    @JsonProperty("CreationDate")
    private String creationDate;
    @JsonProperty("RegistrationNumber")
    private Object registrationNumber;
    @JsonProperty("PartnerPartyName")
    private Object partnerPartyName;
    @JsonProperty("RegistrationType")
    private Object registrationType;
    @JsonProperty("RegistrationStatus")
    private Object registrationStatus;
    @JsonProperty("PrimaryContactPartyName")
    private String primaryContactPartyName;
    @JsonProperty("Timeframe")
    private Object timeframe;
    @JsonProperty("LastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("LeadId")
    private Integer leadId;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("LastUpdatedBy")
    private String lastUpdatedBy;
    @JsonProperty("LastUpdateLogin")
    private String lastUpdateLogin;
    @JsonProperty("ToReassignFlag")
    private Boolean toReassignFlag;
    @JsonProperty("Score")
    private Object score;
    @JsonProperty("CustomerId")
    private Integer customerId;
    @JsonProperty("BusinessUnitId")
    private Integer businessUnitId;
    @JsonProperty("PrimaryContactId")
    private Integer primaryContactId;
    @JsonProperty("Description")
    private Object description;
    @JsonProperty("RejectByUserId")
    private Object rejectByUserId;
    @JsonProperty("RejectComment")
    private Object rejectComment;
    @JsonProperty("RejectReasonCode")
    private Object rejectReasonCode;
    @JsonProperty("RetireComment")
    private Object retireComment;
    @JsonProperty("RetireReasonCode")
    private Object retireReasonCode;
    @JsonProperty("ReassignComment")
    private Object reassignComment;
    @JsonProperty("ReassignReasonCode")
    private Object reassignReasonCode;
    @JsonProperty("AssignmentStatusCode")
    private Object assignmentStatusCode;
    @JsonProperty("ChannelType")
    private Object channelType;
    @JsonProperty("OwnerId")
    private Integer ownerId;
    @JsonProperty("PrimaryContactPersonLastName")
    private String primaryContactPersonLastName;
    @JsonProperty("PrimaryContactCountry")
    private Object primaryContactCountry;
    @JsonProperty("PrimaryInventoryItemId")
    private Object primaryInventoryItemId;
    @JsonProperty("PrimaryInventoryOrgId")
    private Object primaryInventoryOrgId;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("LeadAcceptedFlag")
    private Boolean leadAcceptedFlag;
    @JsonProperty("PrimaryProductGroupId")
    private Object primaryProductGroupId;
    @JsonProperty("PrimaryContactRelationshipId")
    private Integer primaryContactRelationshipId;
    @JsonProperty("LeadAging")
    private Integer leadAging;
    @JsonProperty("FormattedPhoneNumber1")
    private Object formattedPhoneNumber1;
    @JsonProperty("ProductGroupDescription")
    private Object productGroupDescription;
    @JsonProperty("BudgetAmount")
    private Object budgetAmount;
    @JsonProperty("BudgetCurrencyCode")
    private Object budgetCurrencyCode;
    @JsonProperty("BudgetStatus")
    private Object budgetStatus;
    @JsonProperty("CustomerNeed")
    private Object customerNeed;
    @JsonProperty("DecisionMakerIdentifiedFlag")
    private Boolean decisionMakerIdentifiedFlag;
    @JsonProperty("Project")
    private Object project;
    @JsonProperty("QualifiedDate")
    private Object qualifiedDate;
    @JsonProperty("EstimatedCloseDate")
    private Object estimatedCloseDate;
    @JsonProperty("ExpirationDate")
    private Object expirationDate;
    @JsonProperty("ApprovalDate")
    private Object approvalDate;
    @JsonProperty("PartnerId")
    private Object partnerId;
    @JsonProperty("PartnerType")
    private Object partnerType;
    @JsonProperty("SalesChannel")
    private String salesChannel;
    @JsonProperty("PartnerProgramId")
    private Object partnerProgramId;
    @JsonProperty("AcceptedDate")
    private Object acceptedDate;
    @JsonProperty("ProgramName")
    private Object programName;
    @JsonProperty("DealAmount")
    private Object dealAmount;
    @JsonProperty("LastAssignmentDate")
    private Object lastAssignmentDate;
    @JsonProperty("ClassCode1")
    private Object classCode1;
    @JsonProperty("ClassCode2")
    private Object classCode2;
    @JsonProperty("ClassCode3")
    private Object classCode3;
    @JsonProperty("ClassCode4")
    private Object classCode4;
    @JsonProperty("OrganizationType")
    private Object organizationType;
    @JsonProperty("OrganizationSize")
    private Object organizationSize;
    @JsonProperty("PrimaryContactAddress1")
    private Object primaryContactAddress1;
    @JsonProperty("PrimaryContactAddress2")
    private Object primaryContactAddress2;
    @JsonProperty("PrimaryContactAddress3")
    private Object primaryContactAddress3;
    @JsonProperty("PrimaryContactCity")
    private Object primaryContactCity;
    @JsonProperty("PrimaryContactCounty")
    private Object primaryContactCounty;
    @JsonProperty("PrimaryContactPersonFirstName")
    private String primaryContactPersonFirstName;
    @JsonProperty("PrimaryContactPersonMiddleName")
    private Object primaryContactPersonMiddleName;
    @JsonProperty("PrimaryContactPostalCode")
    private Object primaryContactPostalCode;
    @JsonProperty("PrimaryContactProvince")
    private Object primaryContactProvince;
    @JsonProperty("PrimaryContactState")
    private Object primaryContactState;
    @JsonProperty("QualificationScore")
    private Object qualificationScore;
    @JsonProperty("PrimaryContactEmailAddress")
    private String primaryContactEmailAddress;
    @JsonProperty("AcceptedDateTime")
    private Object acceptedDateTime;
    @JsonProperty("ApprovalDateTime")
    private Object approvalDateTime;
    @JsonProperty("ConvertedDateTime")
    private Object convertedDateTime;
    @JsonProperty("QualifiedDateTime")
    private Object qualifiedDateTime;
    @JsonProperty("RejectedDateTime")
    private Object rejectedDateTime;
    @JsonProperty("RetiredDateTime")
    private Object retiredDateTime;
    @JsonProperty("JobTitle")
    private String jobTitle;
    @JsonProperty("CampaignName")
    private Object campaignName;
    @JsonProperty("PrimaryPhoneAreaCode")
    private Object primaryPhoneAreaCode;
    @JsonProperty("PrimaryPhoneCountryCode")
    private Object primaryPhoneCountryCode;
    @JsonProperty("PrimaryPhoneNumber")
    private Object primaryPhoneNumber;
    @JsonProperty("WorkPhoneAreaCode")
    private Object workPhoneAreaCode;
    @JsonProperty("WorkPhoneCountryCode")
    private Object workPhoneCountryCode;
    @JsonProperty("WorkPhoneNumber")
    private Object workPhoneNumber;
    @JsonProperty("AddrElementAttribute1")
    private Object addrElementAttribute1;
    @JsonProperty("AddrElementAttribute2")
    private Object addrElementAttribute2;
    @JsonProperty("AddrElementAttribute3")
    private Object addrElementAttribute3;
    @JsonProperty("AddrElementAttribute4")
    private Object addrElementAttribute4;
    @JsonProperty("AddrElementAttribute5")
    private Object addrElementAttribute5;
    @JsonProperty("Building")
    private Object building;
    @JsonProperty("AddressLinesPhonetic")
    private Object addressLinesPhonetic;
    @JsonProperty("FloorNumber")
    private Object floorNumber;
    @JsonProperty("PostalPlus4Code")
    private Object postalPlus4Code;
    @JsonProperty("PrimaryContactAddress4")
    private Object primaryContactAddress4;
    @JsonProperty("PrimaryContactCountryName")
    private Object primaryContactCountryName;
    @JsonProperty("UpdateFlag")
    private Boolean updateFlag;
    @JsonProperty("DeleteFlag")
    private Boolean deleteFlag;
    @JsonProperty("AssetId")
    private Object assetId;
    @JsonProperty("AssetNumber")
    private Object assetNumber;
    @JsonProperty("ContactFormattedAddress")
    private Object contactFormattedAddress;
    @JsonProperty("Latitude")
    private Object latitude;
    @JsonProperty("Longitude")
    private Object longitude;
    @JsonProperty("Distance")
    private Object distance;
    @JsonProperty("AssetSerialNumber")
    private String assetSerialNumber;
    @JsonProperty("AccountPartyNumber")
    private String accountPartyNumber;
    @JsonProperty("ContactPartyNumber")
    private String contactPartyNumber;
    @JsonProperty("OwnerPartyNumber")
    private String ownerPartyNumber;
    @JsonProperty("PartnerProgramNumber")
    private Object partnerProgramNumber;
    @JsonProperty("PartnerCompanyNumber")
    private Object partnerCompanyNumber;
    @JsonProperty("PrimaryProductGroupReferenceNumber")
    private Object primaryProductGroupReferenceNumber;
    @JsonProperty("PrimaryInventoryItemNumber")
    private Object primaryInventoryItemNumber;
    @JsonProperty("GSEEloquaScore_c")
    private Object gSEEloquaScoreC;
    @JsonProperty("GSENurture_c")
    private Boolean gSENurtureC;
    @JsonProperty("GSESocialId_c")
    private Object gSESocialIdC;
    @JsonProperty("GSESource_c")
    private Object gSESourceC;
    @JsonProperty("ACTScore_c")
    private Object aCTScoreC;
    @JsonProperty("Alumnus_c")
    private Boolean alumnusC;
    @JsonProperty("CampusRole_c")
    private Object campusRoleC;
    @JsonProperty("CampusRole_cMeaning")
    private Object campusRoleCMeaning;
    @JsonProperty("CurrentAcademicYear_c")
    private Object currentAcademicYearC;
    @JsonProperty("CurrentAcademicYear_cMeaning")
    private Object currentAcademicYearCMeaning;
    @JsonProperty("CurrentGPA_c")
    private Object currentGPAC;
    @JsonProperty("DesignationInterest_c")
    private Object designationInterestC;
    @JsonProperty("DesignationInterest_cMeaning")
    private Object designationInterestCMeaning;
    @JsonProperty("EarlyAdmissions_c")
    private Boolean earlyAdmissionsC;
    @JsonProperty("EntryTerm_c")
    private Object entryTermC;
    @JsonProperty("EntryTerm_cMeaning")
    private Object entryTermCMeaning;
    @JsonProperty("GREScore_c")
    private Object gREScoreC;
    @JsonProperty("GMATScore_c")
    private Object gMATScoreC;
    @JsonProperty("LeadRank_c")
    private Object leadRankC;
    @JsonProperty("LeadRank_cMeaning")
    private Object leadRankCMeaning;
    @JsonProperty("InquiryScore_c")
    private Object inquiryScoreC;
    @JsonProperty("InquirySource_c")
    private Object inquirySourceC;
    @JsonProperty("InquirySource_cMeaning")
    private Object inquirySourceCMeaning;
    @JsonProperty("InternationalStudent_c")
    private Boolean internationalStudentC;
    @JsonProperty("I20Form_c")
    private Boolean i20FormC;
    @JsonProperty("Major_c")
    private Object majorC;
    @JsonProperty("Major_cMeaning")
    private Object majorCMeaning;
    @JsonProperty("ProgramInterest_c")
    private Object programInterestC;
    @JsonProperty("ProgramInterest_cMeaning")
    private Object programInterestCMeaning;
    @JsonProperty("Minor_c")
    private Object minorC;
    @JsonProperty("Minor_cMeaning")
    private Object minorCMeaning;
    @JsonProperty("SATScore_c")
    private Object sATScoreC;
    @JsonProperty("TransferStudent_c")
    private Boolean transferStudentC;
    @JsonProperty("GiftPotential_c")
    private Object giftPotentialC;
    @JsonProperty("GiftPotential_cCurrencyCode")
    private String giftPotentialCCurrencyCode;
    @JsonProperty("GiftPotential_cCurcyConvRate")
    private Double giftPotentialCCurcyConvRate;
    @JsonProperty("LSPrimaryCompetitor_Id_c")
    private Object lSPrimaryCompetitorIdC;
    @JsonProperty("LSPrimaryCompetitor_c")
    private Object lSPrimaryCompetitorC;
    @JsonProperty("ProgramType_c")
    private Object programTypeC;
    @JsonProperty("ProgramType_cMeaning")
    private Object programTypeCMeaning;
    @JsonProperty("HELeadType_c")
    private Object hELeadTypeC;
    @JsonProperty("HELeadType_cMeaning")
    private Object hELeadTypeCMeaning;
    @JsonProperty("SATScoreText_c")
    private Object sATScoreTextC;
    @JsonProperty("Region_c")
    private Object regionC;
    @JsonProperty("Country_c")
    private Object countryC;
    @JsonProperty("BusinessGroup_c")
    private Object businessGroupC;
    @JsonProperty("Practice_c")
    private Object practiceC;
    @JsonProperty("TargetBidDate_c")
    private Object targetBidDateC;
    @JsonProperty("TargetContractDate_c")
    private Object targetContractDateC;
    @JsonProperty("TargetStartDate_c")
    private Object targetStartDateC;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RecordSet")
    public Object getRecordSet() {
        return recordSet;
    }

    @JsonProperty("RecordSet")
    public void setRecordSet(Object recordSet) {
        this.recordSet = recordSet;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("LeadNumber")
    public String getLeadNumber() {
        return leadNumber;
    }

    @JsonProperty("LeadNumber")
    public void setLeadNumber(String leadNumber) {
        this.leadNumber = leadNumber;
    }

    @JsonProperty("OwnerPartyName")
    public String getOwnerPartyName() {
        return ownerPartyName;
    }

    @JsonProperty("OwnerPartyName")
    public void setOwnerPartyName(String ownerPartyName) {
        this.ownerPartyName = ownerPartyName;
    }

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("Rank")
    public Object getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(Object rank) {
        this.rank = rank;
    }

    @JsonProperty("SourceCode")
    public Object getSourceCode() {
        return sourceCode;
    }

    @JsonProperty("SourceCode")
    public void setSourceCode(Object sourceCode) {
        this.sourceCode = sourceCode;
    }

    @JsonProperty("CustomerPartyName")
    public String getCustomerPartyName() {
        return customerPartyName;
    }

    @JsonProperty("CustomerPartyName")
    public void setCustomerPartyName(String customerPartyName) {
        this.customerPartyName = customerPartyName;
    }

    @JsonProperty("ProductGroupName")
    public Object getProductGroupName() {
        return productGroupName;
    }

    @JsonProperty("ProductGroupName")
    public void setProductGroupName(Object productGroupName) {
        this.productGroupName = productGroupName;
    }

    @JsonProperty("InventoryItemDescription")
    public Object getInventoryItemDescription() {
        return inventoryItemDescription;
    }

    @JsonProperty("InventoryItemDescription")
    public void setInventoryItemDescription(Object inventoryItemDescription) {
        this.inventoryItemDescription = inventoryItemDescription;
    }

    @JsonProperty("CreationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("CreationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("RegistrationNumber")
    public Object getRegistrationNumber() {
        return registrationNumber;
    }

    @JsonProperty("RegistrationNumber")
    public void setRegistrationNumber(Object registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @JsonProperty("PartnerPartyName")
    public Object getPartnerPartyName() {
        return partnerPartyName;
    }

    @JsonProperty("PartnerPartyName")
    public void setPartnerPartyName(Object partnerPartyName) {
        this.partnerPartyName = partnerPartyName;
    }

    @JsonProperty("RegistrationType")
    public Object getRegistrationType() {
        return registrationType;
    }

    @JsonProperty("RegistrationType")
    public void setRegistrationType(Object registrationType) {
        this.registrationType = registrationType;
    }

    @JsonProperty("RegistrationStatus")
    public Object getRegistrationStatus() {
        return registrationStatus;
    }

    @JsonProperty("RegistrationStatus")
    public void setRegistrationStatus(Object registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    @JsonProperty("PrimaryContactPartyName")
    public String getPrimaryContactPartyName() {
        return primaryContactPartyName;
    }

    @JsonProperty("PrimaryContactPartyName")
    public void setPrimaryContactPartyName(String primaryContactPartyName) {
        this.primaryContactPartyName = primaryContactPartyName;
    }

    @JsonProperty("Timeframe")
    public Object getTimeframe() {
        return timeframe;
    }

    @JsonProperty("Timeframe")
    public void setTimeframe(Object timeframe) {
        this.timeframe = timeframe;
    }

    @JsonProperty("LastUpdateDate")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    @JsonProperty("LastUpdateDate")
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @JsonProperty("LeadId")
    public Integer getLeadId() {
        return leadId;
    }

    @JsonProperty("LeadId")
    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("LastUpdatedBy")
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @JsonProperty("LastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @JsonProperty("LastUpdateLogin")
    public String getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    @JsonProperty("LastUpdateLogin")
    public void setLastUpdateLogin(String lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    @JsonProperty("ToReassignFlag")
    public Boolean getToReassignFlag() {
        return toReassignFlag;
    }

    @JsonProperty("ToReassignFlag")
    public void setToReassignFlag(Boolean toReassignFlag) {
        this.toReassignFlag = toReassignFlag;
    }

    @JsonProperty("Score")
    public Object getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(Object score) {
        this.score = score;
    }

    @JsonProperty("CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("BusinessUnitId")
    public Integer getBusinessUnitId() {
        return businessUnitId;
    }

    @JsonProperty("BusinessUnitId")
    public void setBusinessUnitId(Integer businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @JsonProperty("PrimaryContactId")
    public Integer getPrimaryContactId() {
        return primaryContactId;
    }

    @JsonProperty("PrimaryContactId")
    public void setPrimaryContactId(Integer primaryContactId) {
        this.primaryContactId = primaryContactId;
    }

    @JsonProperty("Description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("RejectByUserId")
    public Object getRejectByUserId() {
        return rejectByUserId;
    }

    @JsonProperty("RejectByUserId")
    public void setRejectByUserId(Object rejectByUserId) {
        this.rejectByUserId = rejectByUserId;
    }

    @JsonProperty("RejectComment")
    public Object getRejectComment() {
        return rejectComment;
    }

    @JsonProperty("RejectComment")
    public void setRejectComment(Object rejectComment) {
        this.rejectComment = rejectComment;
    }

    @JsonProperty("RejectReasonCode")
    public Object getRejectReasonCode() {
        return rejectReasonCode;
    }

    @JsonProperty("RejectReasonCode")
    public void setRejectReasonCode(Object rejectReasonCode) {
        this.rejectReasonCode = rejectReasonCode;
    }

    @JsonProperty("RetireComment")
    public Object getRetireComment() {
        return retireComment;
    }

    @JsonProperty("RetireComment")
    public void setRetireComment(Object retireComment) {
        this.retireComment = retireComment;
    }

    @JsonProperty("RetireReasonCode")
    public Object getRetireReasonCode() {
        return retireReasonCode;
    }

    @JsonProperty("RetireReasonCode")
    public void setRetireReasonCode(Object retireReasonCode) {
        this.retireReasonCode = retireReasonCode;
    }

    @JsonProperty("ReassignComment")
    public Object getReassignComment() {
        return reassignComment;
    }

    @JsonProperty("ReassignComment")
    public void setReassignComment(Object reassignComment) {
        this.reassignComment = reassignComment;
    }

    @JsonProperty("ReassignReasonCode")
    public Object getReassignReasonCode() {
        return reassignReasonCode;
    }

    @JsonProperty("ReassignReasonCode")
    public void setReassignReasonCode(Object reassignReasonCode) {
        this.reassignReasonCode = reassignReasonCode;
    }

    @JsonProperty("AssignmentStatusCode")
    public Object getAssignmentStatusCode() {
        return assignmentStatusCode;
    }

    @JsonProperty("AssignmentStatusCode")
    public void setAssignmentStatusCode(Object assignmentStatusCode) {
        this.assignmentStatusCode = assignmentStatusCode;
    }

    @JsonProperty("ChannelType")
    public Object getChannelType() {
        return channelType;
    }

    @JsonProperty("ChannelType")
    public void setChannelType(Object channelType) {
        this.channelType = channelType;
    }

    @JsonProperty("OwnerId")
    public Integer getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("PrimaryContactPersonLastName")
    public String getPrimaryContactPersonLastName() {
        return primaryContactPersonLastName;
    }

    @JsonProperty("PrimaryContactPersonLastName")
    public void setPrimaryContactPersonLastName(String primaryContactPersonLastName) {
        this.primaryContactPersonLastName = primaryContactPersonLastName;
    }

    @JsonProperty("PrimaryContactCountry")
    public Object getPrimaryContactCountry() {
        return primaryContactCountry;
    }

    @JsonProperty("PrimaryContactCountry")
    public void setPrimaryContactCountry(Object primaryContactCountry) {
        this.primaryContactCountry = primaryContactCountry;
    }

    @JsonProperty("PrimaryInventoryItemId")
    public Object getPrimaryInventoryItemId() {
        return primaryInventoryItemId;
    }

    @JsonProperty("PrimaryInventoryItemId")
    public void setPrimaryInventoryItemId(Object primaryInventoryItemId) {
        this.primaryInventoryItemId = primaryInventoryItemId;
    }

    @JsonProperty("PrimaryInventoryOrgId")
    public Object getPrimaryInventoryOrgId() {
        return primaryInventoryOrgId;
    }

    @JsonProperty("PrimaryInventoryOrgId")
    public void setPrimaryInventoryOrgId(Object primaryInventoryOrgId) {
        this.primaryInventoryOrgId = primaryInventoryOrgId;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("LeadAcceptedFlag")
    public Boolean getLeadAcceptedFlag() {
        return leadAcceptedFlag;
    }

    @JsonProperty("LeadAcceptedFlag")
    public void setLeadAcceptedFlag(Boolean leadAcceptedFlag) {
        this.leadAcceptedFlag = leadAcceptedFlag;
    }

    @JsonProperty("PrimaryProductGroupId")
    public Object getPrimaryProductGroupId() {
        return primaryProductGroupId;
    }

    @JsonProperty("PrimaryProductGroupId")
    public void setPrimaryProductGroupId(Object primaryProductGroupId) {
        this.primaryProductGroupId = primaryProductGroupId;
    }

    @JsonProperty("PrimaryContactRelationshipId")
    public Integer getPrimaryContactRelationshipId() {
        return primaryContactRelationshipId;
    }

    @JsonProperty("PrimaryContactRelationshipId")
    public void setPrimaryContactRelationshipId(Integer primaryContactRelationshipId) {
        this.primaryContactRelationshipId = primaryContactRelationshipId;
    }

    @JsonProperty("LeadAging")
    public Integer getLeadAging() {
        return leadAging;
    }

    @JsonProperty("LeadAging")
    public void setLeadAging(Integer leadAging) {
        this.leadAging = leadAging;
    }

    @JsonProperty("FormattedPhoneNumber1")
    public Object getFormattedPhoneNumber1() {
        return formattedPhoneNumber1;
    }

    @JsonProperty("FormattedPhoneNumber1")
    public void setFormattedPhoneNumber1(Object formattedPhoneNumber1) {
        this.formattedPhoneNumber1 = formattedPhoneNumber1;
    }

    @JsonProperty("ProductGroupDescription")
    public Object getProductGroupDescription() {
        return productGroupDescription;
    }

    @JsonProperty("ProductGroupDescription")
    public void setProductGroupDescription(Object productGroupDescription) {
        this.productGroupDescription = productGroupDescription;
    }

    @JsonProperty("BudgetAmount")
    public Object getBudgetAmount() {
        return budgetAmount;
    }

    @JsonProperty("BudgetAmount")
    public void setBudgetAmount(Object budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    @JsonProperty("BudgetCurrencyCode")
    public Object getBudgetCurrencyCode() {
        return budgetCurrencyCode;
    }

    @JsonProperty("BudgetCurrencyCode")
    public void setBudgetCurrencyCode(Object budgetCurrencyCode) {
        this.budgetCurrencyCode = budgetCurrencyCode;
    }

    @JsonProperty("BudgetStatus")
    public Object getBudgetStatus() {
        return budgetStatus;
    }

    @JsonProperty("BudgetStatus")
    public void setBudgetStatus(Object budgetStatus) {
        this.budgetStatus = budgetStatus;
    }

    @JsonProperty("CustomerNeed")
    public Object getCustomerNeed() {
        return customerNeed;
    }

    @JsonProperty("CustomerNeed")
    public void setCustomerNeed(Object customerNeed) {
        this.customerNeed = customerNeed;
    }

    @JsonProperty("DecisionMakerIdentifiedFlag")
    public Boolean getDecisionMakerIdentifiedFlag() {
        return decisionMakerIdentifiedFlag;
    }

    @JsonProperty("DecisionMakerIdentifiedFlag")
    public void setDecisionMakerIdentifiedFlag(Boolean decisionMakerIdentifiedFlag) {
        this.decisionMakerIdentifiedFlag = decisionMakerIdentifiedFlag;
    }

    @JsonProperty("Project")
    public Object getProject() {
        return project;
    }

    @JsonProperty("Project")
    public void setProject(Object project) {
        this.project = project;
    }

    @JsonProperty("QualifiedDate")
    public Object getQualifiedDate() {
        return qualifiedDate;
    }

    @JsonProperty("QualifiedDate")
    public void setQualifiedDate(Object qualifiedDate) {
        this.qualifiedDate = qualifiedDate;
    }

    @JsonProperty("EstimatedCloseDate")
    public Object getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    @JsonProperty("EstimatedCloseDate")
    public void setEstimatedCloseDate(Object estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }

    @JsonProperty("ExpirationDate")
    public Object getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("ApprovalDate")
    public Object getApprovalDate() {
        return approvalDate;
    }

    @JsonProperty("ApprovalDate")
    public void setApprovalDate(Object approvalDate) {
        this.approvalDate = approvalDate;
    }

    @JsonProperty("PartnerId")
    public Object getPartnerId() {
        return partnerId;
    }

    @JsonProperty("PartnerId")
    public void setPartnerId(Object partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("PartnerType")
    public Object getPartnerType() {
        return partnerType;
    }

    @JsonProperty("PartnerType")
    public void setPartnerType(Object partnerType) {
        this.partnerType = partnerType;
    }

    @JsonProperty("SalesChannel")
    public String getSalesChannel() {
        return salesChannel;
    }

    @JsonProperty("SalesChannel")
    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    @JsonProperty("PartnerProgramId")
    public Object getPartnerProgramId() {
        return partnerProgramId;
    }

    @JsonProperty("PartnerProgramId")
    public void setPartnerProgramId(Object partnerProgramId) {
        this.partnerProgramId = partnerProgramId;
    }

    @JsonProperty("AcceptedDate")
    public Object getAcceptedDate() {
        return acceptedDate;
    }

    @JsonProperty("AcceptedDate")
    public void setAcceptedDate(Object acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    @JsonProperty("ProgramName")
    public Object getProgramName() {
        return programName;
    }

    @JsonProperty("ProgramName")
    public void setProgramName(Object programName) {
        this.programName = programName;
    }

    @JsonProperty("DealAmount")
    public Object getDealAmount() {
        return dealAmount;
    }

    @JsonProperty("DealAmount")
    public void setDealAmount(Object dealAmount) {
        this.dealAmount = dealAmount;
    }

    @JsonProperty("LastAssignmentDate")
    public Object getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    @JsonProperty("LastAssignmentDate")
    public void setLastAssignmentDate(Object lastAssignmentDate) {
        this.lastAssignmentDate = lastAssignmentDate;
    }

    @JsonProperty("ClassCode1")
    public Object getClassCode1() {
        return classCode1;
    }

    @JsonProperty("ClassCode1")
    public void setClassCode1(Object classCode1) {
        this.classCode1 = classCode1;
    }

    @JsonProperty("ClassCode2")
    public Object getClassCode2() {
        return classCode2;
    }

    @JsonProperty("ClassCode2")
    public void setClassCode2(Object classCode2) {
        this.classCode2 = classCode2;
    }

    @JsonProperty("ClassCode3")
    public Object getClassCode3() {
        return classCode3;
    }

    @JsonProperty("ClassCode3")
    public void setClassCode3(Object classCode3) {
        this.classCode3 = classCode3;
    }

    @JsonProperty("ClassCode4")
    public Object getClassCode4() {
        return classCode4;
    }

    @JsonProperty("ClassCode4")
    public void setClassCode4(Object classCode4) {
        this.classCode4 = classCode4;
    }

    @JsonProperty("OrganizationType")
    public Object getOrganizationType() {
        return organizationType;
    }

    @JsonProperty("OrganizationType")
    public void setOrganizationType(Object organizationType) {
        this.organizationType = organizationType;
    }

    @JsonProperty("OrganizationSize")
    public Object getOrganizationSize() {
        return organizationSize;
    }

    @JsonProperty("OrganizationSize")
    public void setOrganizationSize(Object organizationSize) {
        this.organizationSize = organizationSize;
    }

    @JsonProperty("PrimaryContactAddress1")
    public Object getPrimaryContactAddress1() {
        return primaryContactAddress1;
    }

    @JsonProperty("PrimaryContactAddress1")
    public void setPrimaryContactAddress1(Object primaryContactAddress1) {
        this.primaryContactAddress1 = primaryContactAddress1;
    }

    @JsonProperty("PrimaryContactAddress2")
    public Object getPrimaryContactAddress2() {
        return primaryContactAddress2;
    }

    @JsonProperty("PrimaryContactAddress2")
    public void setPrimaryContactAddress2(Object primaryContactAddress2) {
        this.primaryContactAddress2 = primaryContactAddress2;
    }

    @JsonProperty("PrimaryContactAddress3")
    public Object getPrimaryContactAddress3() {
        return primaryContactAddress3;
    }

    @JsonProperty("PrimaryContactAddress3")
    public void setPrimaryContactAddress3(Object primaryContactAddress3) {
        this.primaryContactAddress3 = primaryContactAddress3;
    }

    @JsonProperty("PrimaryContactCity")
    public Object getPrimaryContactCity() {
        return primaryContactCity;
    }

    @JsonProperty("PrimaryContactCity")
    public void setPrimaryContactCity(Object primaryContactCity) {
        this.primaryContactCity = primaryContactCity;
    }

    @JsonProperty("PrimaryContactCounty")
    public Object getPrimaryContactCounty() {
        return primaryContactCounty;
    }

    @JsonProperty("PrimaryContactCounty")
    public void setPrimaryContactCounty(Object primaryContactCounty) {
        this.primaryContactCounty = primaryContactCounty;
    }

    @JsonProperty("PrimaryContactPersonFirstName")
    public String getPrimaryContactPersonFirstName() {
        return primaryContactPersonFirstName;
    }

    @JsonProperty("PrimaryContactPersonFirstName")
    public void setPrimaryContactPersonFirstName(String primaryContactPersonFirstName) {
        this.primaryContactPersonFirstName = primaryContactPersonFirstName;
    }

    @JsonProperty("PrimaryContactPersonMiddleName")
    public Object getPrimaryContactPersonMiddleName() {
        return primaryContactPersonMiddleName;
    }

    @JsonProperty("PrimaryContactPersonMiddleName")
    public void setPrimaryContactPersonMiddleName(Object primaryContactPersonMiddleName) {
        this.primaryContactPersonMiddleName = primaryContactPersonMiddleName;
    }

    @JsonProperty("PrimaryContactPostalCode")
    public Object getPrimaryContactPostalCode() {
        return primaryContactPostalCode;
    }

    @JsonProperty("PrimaryContactPostalCode")
    public void setPrimaryContactPostalCode(Object primaryContactPostalCode) {
        this.primaryContactPostalCode = primaryContactPostalCode;
    }

    @JsonProperty("PrimaryContactProvince")
    public Object getPrimaryContactProvince() {
        return primaryContactProvince;
    }

    @JsonProperty("PrimaryContactProvince")
    public void setPrimaryContactProvince(Object primaryContactProvince) {
        this.primaryContactProvince = primaryContactProvince;
    }

    @JsonProperty("PrimaryContactState")
    public Object getPrimaryContactState() {
        return primaryContactState;
    }

    @JsonProperty("PrimaryContactState")
    public void setPrimaryContactState(Object primaryContactState) {
        this.primaryContactState = primaryContactState;
    }

    @JsonProperty("QualificationScore")
    public Object getQualificationScore() {
        return qualificationScore;
    }

    @JsonProperty("QualificationScore")
    public void setQualificationScore(Object qualificationScore) {
        this.qualificationScore = qualificationScore;
    }

    @JsonProperty("PrimaryContactEmailAddress")
    public String getPrimaryContactEmailAddress() {
        return primaryContactEmailAddress;
    }

    @JsonProperty("PrimaryContactEmailAddress")
    public void setPrimaryContactEmailAddress(String primaryContactEmailAddress) {
        this.primaryContactEmailAddress = primaryContactEmailAddress;
    }

    @JsonProperty("AcceptedDateTime")
    public Object getAcceptedDateTime() {
        return acceptedDateTime;
    }

    @JsonProperty("AcceptedDateTime")
    public void setAcceptedDateTime(Object acceptedDateTime) {
        this.acceptedDateTime = acceptedDateTime;
    }

    @JsonProperty("ApprovalDateTime")
    public Object getApprovalDateTime() {
        return approvalDateTime;
    }

    @JsonProperty("ApprovalDateTime")
    public void setApprovalDateTime(Object approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    @JsonProperty("ConvertedDateTime")
    public Object getConvertedDateTime() {
        return convertedDateTime;
    }

    @JsonProperty("ConvertedDateTime")
    public void setConvertedDateTime(Object convertedDateTime) {
        this.convertedDateTime = convertedDateTime;
    }

    @JsonProperty("QualifiedDateTime")
    public Object getQualifiedDateTime() {
        return qualifiedDateTime;
    }

    @JsonProperty("QualifiedDateTime")
    public void setQualifiedDateTime(Object qualifiedDateTime) {
        this.qualifiedDateTime = qualifiedDateTime;
    }

    @JsonProperty("RejectedDateTime")
    public Object getRejectedDateTime() {
        return rejectedDateTime;
    }

    @JsonProperty("RejectedDateTime")
    public void setRejectedDateTime(Object rejectedDateTime) {
        this.rejectedDateTime = rejectedDateTime;
    }

    @JsonProperty("RetiredDateTime")
    public Object getRetiredDateTime() {
        return retiredDateTime;
    }

    @JsonProperty("RetiredDateTime")
    public void setRetiredDateTime(Object retiredDateTime) {
        this.retiredDateTime = retiredDateTime;
    }

    @JsonProperty("JobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("JobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("CampaignName")
    public Object getCampaignName() {
        return campaignName;
    }

    @JsonProperty("CampaignName")
    public void setCampaignName(Object campaignName) {
        this.campaignName = campaignName;
    }

    @JsonProperty("PrimaryPhoneAreaCode")
    public Object getPrimaryPhoneAreaCode() {
        return primaryPhoneAreaCode;
    }

    @JsonProperty("PrimaryPhoneAreaCode")
    public void setPrimaryPhoneAreaCode(Object primaryPhoneAreaCode) {
        this.primaryPhoneAreaCode = primaryPhoneAreaCode;
    }

    @JsonProperty("PrimaryPhoneCountryCode")
    public Object getPrimaryPhoneCountryCode() {
        return primaryPhoneCountryCode;
    }

    @JsonProperty("PrimaryPhoneCountryCode")
    public void setPrimaryPhoneCountryCode(Object primaryPhoneCountryCode) {
        this.primaryPhoneCountryCode = primaryPhoneCountryCode;
    }

    @JsonProperty("PrimaryPhoneNumber")
    public Object getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    @JsonProperty("PrimaryPhoneNumber")
    public void setPrimaryPhoneNumber(Object primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    @JsonProperty("WorkPhoneAreaCode")
    public Object getWorkPhoneAreaCode() {
        return workPhoneAreaCode;
    }

    @JsonProperty("WorkPhoneAreaCode")
    public void setWorkPhoneAreaCode(Object workPhoneAreaCode) {
        this.workPhoneAreaCode = workPhoneAreaCode;
    }

    @JsonProperty("WorkPhoneCountryCode")
    public Object getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    @JsonProperty("WorkPhoneCountryCode")
    public void setWorkPhoneCountryCode(Object workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    @JsonProperty("WorkPhoneNumber")
    public Object getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    @JsonProperty("WorkPhoneNumber")
    public void setWorkPhoneNumber(Object workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @JsonProperty("AddrElementAttribute1")
    public Object getAddrElementAttribute1() {
        return addrElementAttribute1;
    }

    @JsonProperty("AddrElementAttribute1")
    public void setAddrElementAttribute1(Object addrElementAttribute1) {
        this.addrElementAttribute1 = addrElementAttribute1;
    }

    @JsonProperty("AddrElementAttribute2")
    public Object getAddrElementAttribute2() {
        return addrElementAttribute2;
    }

    @JsonProperty("AddrElementAttribute2")
    public void setAddrElementAttribute2(Object addrElementAttribute2) {
        this.addrElementAttribute2 = addrElementAttribute2;
    }

    @JsonProperty("AddrElementAttribute3")
    public Object getAddrElementAttribute3() {
        return addrElementAttribute3;
    }

    @JsonProperty("AddrElementAttribute3")
    public void setAddrElementAttribute3(Object addrElementAttribute3) {
        this.addrElementAttribute3 = addrElementAttribute3;
    }

    @JsonProperty("AddrElementAttribute4")
    public Object getAddrElementAttribute4() {
        return addrElementAttribute4;
    }

    @JsonProperty("AddrElementAttribute4")
    public void setAddrElementAttribute4(Object addrElementAttribute4) {
        this.addrElementAttribute4 = addrElementAttribute4;
    }

    @JsonProperty("AddrElementAttribute5")
    public Object getAddrElementAttribute5() {
        return addrElementAttribute5;
    }

    @JsonProperty("AddrElementAttribute5")
    public void setAddrElementAttribute5(Object addrElementAttribute5) {
        this.addrElementAttribute5 = addrElementAttribute5;
    }

    @JsonProperty("Building")
    public Object getBuilding() {
        return building;
    }

    @JsonProperty("Building")
    public void setBuilding(Object building) {
        this.building = building;
    }

    @JsonProperty("AddressLinesPhonetic")
    public Object getAddressLinesPhonetic() {
        return addressLinesPhonetic;
    }

    @JsonProperty("AddressLinesPhonetic")
    public void setAddressLinesPhonetic(Object addressLinesPhonetic) {
        this.addressLinesPhonetic = addressLinesPhonetic;
    }

    @JsonProperty("FloorNumber")
    public Object getFloorNumber() {
        return floorNumber;
    }

    @JsonProperty("FloorNumber")
    public void setFloorNumber(Object floorNumber) {
        this.floorNumber = floorNumber;
    }

    @JsonProperty("PostalPlus4Code")
    public Object getPostalPlus4Code() {
        return postalPlus4Code;
    }

    @JsonProperty("PostalPlus4Code")
    public void setPostalPlus4Code(Object postalPlus4Code) {
        this.postalPlus4Code = postalPlus4Code;
    }

    @JsonProperty("PrimaryContactAddress4")
    public Object getPrimaryContactAddress4() {
        return primaryContactAddress4;
    }

    @JsonProperty("PrimaryContactAddress4")
    public void setPrimaryContactAddress4(Object primaryContactAddress4) {
        this.primaryContactAddress4 = primaryContactAddress4;
    }

    @JsonProperty("PrimaryContactCountryName")
    public Object getPrimaryContactCountryName() {
        return primaryContactCountryName;
    }

    @JsonProperty("PrimaryContactCountryName")
    public void setPrimaryContactCountryName(Object primaryContactCountryName) {
        this.primaryContactCountryName = primaryContactCountryName;
    }

    @JsonProperty("UpdateFlag")
    public Boolean getUpdateFlag() {
        return updateFlag;
    }

    @JsonProperty("UpdateFlag")
    public void setUpdateFlag(Boolean updateFlag) {
        this.updateFlag = updateFlag;
    }

    @JsonProperty("DeleteFlag")
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    @JsonProperty("DeleteFlag")
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @JsonProperty("AssetId")
    public Object getAssetId() {
        return assetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(Object assetId) {
        this.assetId = assetId;
    }

    @JsonProperty("AssetNumber")
    public Object getAssetNumber() {
        return assetNumber;
    }

    @JsonProperty("AssetNumber")
    public void setAssetNumber(Object assetNumber) {
        this.assetNumber = assetNumber;
    }

    @JsonProperty("ContactFormattedAddress")
    public Object getContactFormattedAddress() {
        return contactFormattedAddress;
    }

    @JsonProperty("ContactFormattedAddress")
    public void setContactFormattedAddress(Object contactFormattedAddress) {
        this.contactFormattedAddress = contactFormattedAddress;
    }

    @JsonProperty("Latitude")
    public Object getLatitude() {
        return latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("Longitude")
    public Object getLongitude() {
        return longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("Distance")
    public Object getDistance() {
        return distance;
    }

    @JsonProperty("Distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    @JsonProperty("AssetSerialNumber")
    public String getAssetSerialNumber() {
        return assetSerialNumber;
    }

    @JsonProperty("AssetSerialNumber")
    public void setAssetSerialNumber(String assetSerialNumber) {
        this.assetSerialNumber = assetSerialNumber;
    }

    @JsonProperty("AccountPartyNumber")
    public String getAccountPartyNumber() {
        return accountPartyNumber;
    }

    @JsonProperty("AccountPartyNumber")
    public void setAccountPartyNumber(String accountPartyNumber) {
        this.accountPartyNumber = accountPartyNumber;
    }

    @JsonProperty("ContactPartyNumber")
    public String getContactPartyNumber() {
        return contactPartyNumber;
    }

    @JsonProperty("ContactPartyNumber")
    public void setContactPartyNumber(String contactPartyNumber) {
        this.contactPartyNumber = contactPartyNumber;
    }

    @JsonProperty("OwnerPartyNumber")
    public String getOwnerPartyNumber() {
        return ownerPartyNumber;
    }

    @JsonProperty("OwnerPartyNumber")
    public void setOwnerPartyNumber(String ownerPartyNumber) {
        this.ownerPartyNumber = ownerPartyNumber;
    }

    @JsonProperty("PartnerProgramNumber")
    public Object getPartnerProgramNumber() {
        return partnerProgramNumber;
    }

    @JsonProperty("PartnerProgramNumber")
    public void setPartnerProgramNumber(Object partnerProgramNumber) {
        this.partnerProgramNumber = partnerProgramNumber;
    }

    @JsonProperty("PartnerCompanyNumber")
    public Object getPartnerCompanyNumber() {
        return partnerCompanyNumber;
    }

    @JsonProperty("PartnerCompanyNumber")
    public void setPartnerCompanyNumber(Object partnerCompanyNumber) {
        this.partnerCompanyNumber = partnerCompanyNumber;
    }

    @JsonProperty("PrimaryProductGroupReferenceNumber")
    public Object getPrimaryProductGroupReferenceNumber() {
        return primaryProductGroupReferenceNumber;
    }

    @JsonProperty("PrimaryProductGroupReferenceNumber")
    public void setPrimaryProductGroupReferenceNumber(Object primaryProductGroupReferenceNumber) {
        this.primaryProductGroupReferenceNumber = primaryProductGroupReferenceNumber;
    }

    @JsonProperty("PrimaryInventoryItemNumber")
    public Object getPrimaryInventoryItemNumber() {
        return primaryInventoryItemNumber;
    }

    @JsonProperty("PrimaryInventoryItemNumber")
    public void setPrimaryInventoryItemNumber(Object primaryInventoryItemNumber) {
        this.primaryInventoryItemNumber = primaryInventoryItemNumber;
    }

    @JsonProperty("GSEEloquaScore_c")
    public Object getGSEEloquaScoreC() {
        return gSEEloquaScoreC;
    }

    @JsonProperty("GSEEloquaScore_c")
    public void setGSEEloquaScoreC(Object gSEEloquaScoreC) {
        this.gSEEloquaScoreC = gSEEloquaScoreC;
    }

    @JsonProperty("GSENurture_c")
    public Boolean getGSENurtureC() {
        return gSENurtureC;
    }

    @JsonProperty("GSENurture_c")
    public void setGSENurtureC(Boolean gSENurtureC) {
        this.gSENurtureC = gSENurtureC;
    }

    @JsonProperty("GSESocialId_c")
    public Object getGSESocialIdC() {
        return gSESocialIdC;
    }

    @JsonProperty("GSESocialId_c")
    public void setGSESocialIdC(Object gSESocialIdC) {
        this.gSESocialIdC = gSESocialIdC;
    }

    @JsonProperty("GSESource_c")
    public Object getGSESourceC() {
        return gSESourceC;
    }

    @JsonProperty("GSESource_c")
    public void setGSESourceC(Object gSESourceC) {
        this.gSESourceC = gSESourceC;
    }

    @JsonProperty("ACTScore_c")
    public Object getACTScoreC() {
        return aCTScoreC;
    }

    @JsonProperty("ACTScore_c")
    public void setACTScoreC(Object aCTScoreC) {
        this.aCTScoreC = aCTScoreC;
    }

    @JsonProperty("Alumnus_c")
    public Boolean getAlumnusC() {
        return alumnusC;
    }

    @JsonProperty("Alumnus_c")
    public void setAlumnusC(Boolean alumnusC) {
        this.alumnusC = alumnusC;
    }

    @JsonProperty("CampusRole_c")
    public Object getCampusRoleC() {
        return campusRoleC;
    }

    @JsonProperty("CampusRole_c")
    public void setCampusRoleC(Object campusRoleC) {
        this.campusRoleC = campusRoleC;
    }

    @JsonProperty("CampusRole_cMeaning")
    public Object getCampusRoleCMeaning() {
        return campusRoleCMeaning;
    }

    @JsonProperty("CampusRole_cMeaning")
    public void setCampusRoleCMeaning(Object campusRoleCMeaning) {
        this.campusRoleCMeaning = campusRoleCMeaning;
    }

    @JsonProperty("CurrentAcademicYear_c")
    public Object getCurrentAcademicYearC() {
        return currentAcademicYearC;
    }

    @JsonProperty("CurrentAcademicYear_c")
    public void setCurrentAcademicYearC(Object currentAcademicYearC) {
        this.currentAcademicYearC = currentAcademicYearC;
    }

    @JsonProperty("CurrentAcademicYear_cMeaning")
    public Object getCurrentAcademicYearCMeaning() {
        return currentAcademicYearCMeaning;
    }

    @JsonProperty("CurrentAcademicYear_cMeaning")
    public void setCurrentAcademicYearCMeaning(Object currentAcademicYearCMeaning) {
        this.currentAcademicYearCMeaning = currentAcademicYearCMeaning;
    }

    @JsonProperty("CurrentGPA_c")
    public Object getCurrentGPAC() {
        return currentGPAC;
    }

    @JsonProperty("CurrentGPA_c")
    public void setCurrentGPAC(Object currentGPAC) {
        this.currentGPAC = currentGPAC;
    }

    @JsonProperty("DesignationInterest_c")
    public Object getDesignationInterestC() {
        return designationInterestC;
    }

    @JsonProperty("DesignationInterest_c")
    public void setDesignationInterestC(Object designationInterestC) {
        this.designationInterestC = designationInterestC;
    }

    @JsonProperty("DesignationInterest_cMeaning")
    public Object getDesignationInterestCMeaning() {
        return designationInterestCMeaning;
    }

    @JsonProperty("DesignationInterest_cMeaning")
    public void setDesignationInterestCMeaning(Object designationInterestCMeaning) {
        this.designationInterestCMeaning = designationInterestCMeaning;
    }

    @JsonProperty("EarlyAdmissions_c")
    public Boolean getEarlyAdmissionsC() {
        return earlyAdmissionsC;
    }

    @JsonProperty("EarlyAdmissions_c")
    public void setEarlyAdmissionsC(Boolean earlyAdmissionsC) {
        this.earlyAdmissionsC = earlyAdmissionsC;
    }

    @JsonProperty("EntryTerm_c")
    public Object getEntryTermC() {
        return entryTermC;
    }

    @JsonProperty("EntryTerm_c")
    public void setEntryTermC(Object entryTermC) {
        this.entryTermC = entryTermC;
    }

    @JsonProperty("EntryTerm_cMeaning")
    public Object getEntryTermCMeaning() {
        return entryTermCMeaning;
    }

    @JsonProperty("EntryTerm_cMeaning")
    public void setEntryTermCMeaning(Object entryTermCMeaning) {
        this.entryTermCMeaning = entryTermCMeaning;
    }

    @JsonProperty("GREScore_c")
    public Object getGREScoreC() {
        return gREScoreC;
    }

    @JsonProperty("GREScore_c")
    public void setGREScoreC(Object gREScoreC) {
        this.gREScoreC = gREScoreC;
    }

    @JsonProperty("GMATScore_c")
    public Object getGMATScoreC() {
        return gMATScoreC;
    }

    @JsonProperty("GMATScore_c")
    public void setGMATScoreC(Object gMATScoreC) {
        this.gMATScoreC = gMATScoreC;
    }

    @JsonProperty("LeadRank_c")
    public Object getLeadRankC() {
        return leadRankC;
    }

    @JsonProperty("LeadRank_c")
    public void setLeadRankC(Object leadRankC) {
        this.leadRankC = leadRankC;
    }

    @JsonProperty("LeadRank_cMeaning")
    public Object getLeadRankCMeaning() {
        return leadRankCMeaning;
    }

    @JsonProperty("LeadRank_cMeaning")
    public void setLeadRankCMeaning(Object leadRankCMeaning) {
        this.leadRankCMeaning = leadRankCMeaning;
    }

    @JsonProperty("InquiryScore_c")
    public Object getInquiryScoreC() {
        return inquiryScoreC;
    }

    @JsonProperty("InquiryScore_c")
    public void setInquiryScoreC(Object inquiryScoreC) {
        this.inquiryScoreC = inquiryScoreC;
    }

    @JsonProperty("InquirySource_c")
    public Object getInquirySourceC() {
        return inquirySourceC;
    }

    @JsonProperty("InquirySource_c")
    public void setInquirySourceC(Object inquirySourceC) {
        this.inquirySourceC = inquirySourceC;
    }

    @JsonProperty("InquirySource_cMeaning")
    public Object getInquirySourceCMeaning() {
        return inquirySourceCMeaning;
    }

    @JsonProperty("InquirySource_cMeaning")
    public void setInquirySourceCMeaning(Object inquirySourceCMeaning) {
        this.inquirySourceCMeaning = inquirySourceCMeaning;
    }

    @JsonProperty("InternationalStudent_c")
    public Boolean getInternationalStudentC() {
        return internationalStudentC;
    }

    @JsonProperty("InternationalStudent_c")
    public void setInternationalStudentC(Boolean internationalStudentC) {
        this.internationalStudentC = internationalStudentC;
    }

    @JsonProperty("I20Form_c")
    public Boolean getI20FormC() {
        return i20FormC;
    }

    @JsonProperty("I20Form_c")
    public void setI20FormC(Boolean i20FormC) {
        this.i20FormC = i20FormC;
    }

    @JsonProperty("Major_c")
    public Object getMajorC() {
        return majorC;
    }

    @JsonProperty("Major_c")
    public void setMajorC(Object majorC) {
        this.majorC = majorC;
    }

    @JsonProperty("Major_cMeaning")
    public Object getMajorCMeaning() {
        return majorCMeaning;
    }

    @JsonProperty("Major_cMeaning")
    public void setMajorCMeaning(Object majorCMeaning) {
        this.majorCMeaning = majorCMeaning;
    }

    @JsonProperty("ProgramInterest_c")
    public Object getProgramInterestC() {
        return programInterestC;
    }

    @JsonProperty("ProgramInterest_c")
    public void setProgramInterestC(Object programInterestC) {
        this.programInterestC = programInterestC;
    }

    @JsonProperty("ProgramInterest_cMeaning")
    public Object getProgramInterestCMeaning() {
        return programInterestCMeaning;
    }

    @JsonProperty("ProgramInterest_cMeaning")
    public void setProgramInterestCMeaning(Object programInterestCMeaning) {
        this.programInterestCMeaning = programInterestCMeaning;
    }

    @JsonProperty("Minor_c")
    public Object getMinorC() {
        return minorC;
    }

    @JsonProperty("Minor_c")
    public void setMinorC(Object minorC) {
        this.minorC = minorC;
    }

    @JsonProperty("Minor_cMeaning")
    public Object getMinorCMeaning() {
        return minorCMeaning;
    }

    @JsonProperty("Minor_cMeaning")
    public void setMinorCMeaning(Object minorCMeaning) {
        this.minorCMeaning = minorCMeaning;
    }

    @JsonProperty("SATScore_c")
    public Object getSATScoreC() {
        return sATScoreC;
    }

    @JsonProperty("SATScore_c")
    public void setSATScoreC(Object sATScoreC) {
        this.sATScoreC = sATScoreC;
    }

    @JsonProperty("TransferStudent_c")
    public Boolean getTransferStudentC() {
        return transferStudentC;
    }

    @JsonProperty("TransferStudent_c")
    public void setTransferStudentC(Boolean transferStudentC) {
        this.transferStudentC = transferStudentC;
    }

    @JsonProperty("GiftPotential_c")
    public Object getGiftPotentialC() {
        return giftPotentialC;
    }

    @JsonProperty("GiftPotential_c")
    public void setGiftPotentialC(Object giftPotentialC) {
        this.giftPotentialC = giftPotentialC;
    }

    @JsonProperty("GiftPotential_cCurrencyCode")
    public String getGiftPotentialCCurrencyCode() {
        return giftPotentialCCurrencyCode;
    }

    @JsonProperty("GiftPotential_cCurrencyCode")
    public void setGiftPotentialCCurrencyCode(String giftPotentialCCurrencyCode) {
        this.giftPotentialCCurrencyCode = giftPotentialCCurrencyCode;
    }

    @JsonProperty("GiftPotential_cCurcyConvRate")
    public Double getGiftPotentialCCurcyConvRate() {
        return giftPotentialCCurcyConvRate;
    }

    @JsonProperty("GiftPotential_cCurcyConvRate")
    public void setGiftPotentialCCurcyConvRate(Double giftPotentialCCurcyConvRate) {
        this.giftPotentialCCurcyConvRate = giftPotentialCCurcyConvRate;
    }

    @JsonProperty("LSPrimaryCompetitor_Id_c")
    public Object getLSPrimaryCompetitorIdC() {
        return lSPrimaryCompetitorIdC;
    }

    @JsonProperty("LSPrimaryCompetitor_Id_c")
    public void setLSPrimaryCompetitorIdC(Object lSPrimaryCompetitorIdC) {
        this.lSPrimaryCompetitorIdC = lSPrimaryCompetitorIdC;
    }

    @JsonProperty("LSPrimaryCompetitor_c")
    public Object getLSPrimaryCompetitorC() {
        return lSPrimaryCompetitorC;
    }

    @JsonProperty("LSPrimaryCompetitor_c")
    public void setLSPrimaryCompetitorC(Object lSPrimaryCompetitorC) {
        this.lSPrimaryCompetitorC = lSPrimaryCompetitorC;
    }

    @JsonProperty("ProgramType_c")
    public Object getProgramTypeC() {
        return programTypeC;
    }

    @JsonProperty("ProgramType_c")
    public void setProgramTypeC(Object programTypeC) {
        this.programTypeC = programTypeC;
    }

    @JsonProperty("ProgramType_cMeaning")
    public Object getProgramTypeCMeaning() {
        return programTypeCMeaning;
    }

    @JsonProperty("ProgramType_cMeaning")
    public void setProgramTypeCMeaning(Object programTypeCMeaning) {
        this.programTypeCMeaning = programTypeCMeaning;
    }

    @JsonProperty("HELeadType_c")
    public Object getHELeadTypeC() {
        return hELeadTypeC;
    }

    @JsonProperty("HELeadType_c")
    public void setHELeadTypeC(Object hELeadTypeC) {
        this.hELeadTypeC = hELeadTypeC;
    }

    @JsonProperty("HELeadType_cMeaning")
    public Object getHELeadTypeCMeaning() {
        return hELeadTypeCMeaning;
    }

    @JsonProperty("HELeadType_cMeaning")
    public void setHELeadTypeCMeaning(Object hELeadTypeCMeaning) {
        this.hELeadTypeCMeaning = hELeadTypeCMeaning;
    }

    @JsonProperty("SATScoreText_c")
    public Object getSATScoreTextC() {
        return sATScoreTextC;
    }

    @JsonProperty("SATScoreText_c")
    public void setSATScoreTextC(Object sATScoreTextC) {
        this.sATScoreTextC = sATScoreTextC;
    }

    @JsonProperty("Region_c")
    public Object getRegionC() {
        return regionC;
    }

    @JsonProperty("Region_c")
    public void setRegionC(Object regionC) {
        this.regionC = regionC;
    }

    @JsonProperty("Country_c")
    public Object getCountryC() {
        return countryC;
    }

    @JsonProperty("Country_c")
    public void setCountryC(Object countryC) {
        this.countryC = countryC;
    }

    @JsonProperty("BusinessGroup_c")
    public Object getBusinessGroupC() {
        return businessGroupC;
    }

    @JsonProperty("BusinessGroup_c")
    public void setBusinessGroupC(Object businessGroupC) {
        this.businessGroupC = businessGroupC;
    }

    @JsonProperty("Practice_c")
    public Object getPracticeC() {
        return practiceC;
    }

    @JsonProperty("Practice_c")
    public void setPracticeC(Object practiceC) {
        this.practiceC = practiceC;
    }

    @JsonProperty("TargetBidDate_c")
    public Object getTargetBidDateC() {
        return targetBidDateC;
    }

    @JsonProperty("TargetBidDate_c")
    public void setTargetBidDateC(Object targetBidDateC) {
        this.targetBidDateC = targetBidDateC;
    }

    @JsonProperty("TargetContractDate_c")
    public Object getTargetContractDateC() {
        return targetContractDateC;
    }

    @JsonProperty("TargetContractDate_c")
    public void setTargetContractDateC(Object targetContractDateC) {
        this.targetContractDateC = targetContractDateC;
    }

    @JsonProperty("TargetStartDate_c")
    public Object getTargetStartDateC() {
        return targetStartDateC;
    }

    @JsonProperty("TargetStartDate_c")
    public void setTargetStartDateC(Object targetStartDateC) {
        this.targetStartDateC = targetStartDateC;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public Lead() {
		super();
	}

	public Lead(String name, String contactPartyNumber) {
		super();
		this.name = name;
		this.contactPartyNumber = contactPartyNumber;
	}
    
    

}
