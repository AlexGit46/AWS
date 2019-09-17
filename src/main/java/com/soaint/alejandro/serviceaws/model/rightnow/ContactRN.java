
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactRN {

    private Integer id;
    private String lookupName;
    private String createdTime;
    private String updatedTime;
    private Address address;
    private Banner banner;
    private ChannelUsernames channelUsernames;
    private Object contactType;
    private CRMModules cRMModules;
    private CustomFields customFields;
    private Boolean disabled;
    private Emails emails;
    private Object externalReference;
    private FileAttachments fileAttachments;
    private Object login;
    private MarketingSettings marketingSettings;
    private Name name;
    private NameFurigana nameFurigana;
    private Notes notes;
    private OpenIDAccounts openIDAccounts;
    private Object organization;
    private Object passwordEmailExpirationTime;
    private Object passwordExpirationTime;
    private Phones phones;
    private SalesSettings salesSettings;
    private ServiceSettings serviceSettings;
    private Source source;
    private Object title;
    private List<Link___________> links = null;
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    

    public Integer getId() {
        return id;
    }
    
    

    public ContactRN(Emails emails, Name name) {
		super();
		this.emails = emails;
		this.name = name;
	}



	public ContactRN() {
		super();
	}

	public ContactRN(Integer id, String lookupName, String createdTime, String updatedTime, Address address,
			Banner banner, ChannelUsernames channelUsernames, Object contactType, CRMModules cRMModules,
			CustomFields customFields, Boolean disabled, Emails emails, Object externalReference,
			FileAttachments fileAttachments, Object login, MarketingSettings marketingSettings, Name name,
			NameFurigana nameFurigana, Notes notes, OpenIDAccounts openIDAccounts, Object organization,
			Object passwordEmailExpirationTime, Object passwordExpirationTime, Phones phones,
			SalesSettings salesSettings, ServiceSettings serviceSettings, Source source, Object title,
			List<Link___________> links) {
		super();
		this.id = id;
		this.lookupName = lookupName;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.address = address;
		this.banner = banner;
		this.channelUsernames = channelUsernames;
		this.contactType = contactType;
		this.cRMModules = cRMModules;
		this.customFields = customFields;
		this.disabled = disabled;
		this.emails = emails;
		this.externalReference = externalReference;
		this.fileAttachments = fileAttachments;
		this.login = login;
		this.marketingSettings = marketingSettings;
		this.name = name;
		this.nameFurigana = nameFurigana;
		this.notes = notes;
		this.openIDAccounts = openIDAccounts;
		this.organization = organization;
		this.passwordEmailExpirationTime = passwordEmailExpirationTime;
		this.passwordExpirationTime = passwordExpirationTime;
		this.phones = phones;
		this.salesSettings = salesSettings;
		this.serviceSettings = serviceSettings;
		this.source = source;
		this.title = title;
		this.links = links;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public ChannelUsernames getChannelUsernames() {
        return channelUsernames;
    }

    public void setChannelUsernames(ChannelUsernames channelUsernames) {
        this.channelUsernames = channelUsernames;
    }

    public Object getContactType() {
        return contactType;
    }

    public void setContactType(Object contactType) {
        this.contactType = contactType;
    }

    public CRMModules getCRMModules() {
        return cRMModules;
    }

    public void setCRMModules(CRMModules cRMModules) {
        this.cRMModules = cRMModules;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Emails getEmails() {
        return emails;
    }

    public void setEmails(Emails emails) {
        this.emails = emails;
    }

    public Object getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(Object externalReference) {
        this.externalReference = externalReference;
    }

    public FileAttachments getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(FileAttachments fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    public Object getLogin() {
        return login;
    }

    public void setLogin(Object login) {
        this.login = login;
    }

    public MarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    public void setMarketingSettings(MarketingSettings marketingSettings) {
        this.marketingSettings = marketingSettings;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public NameFurigana getNameFurigana() {
        return nameFurigana;
    }

    public void setNameFurigana(NameFurigana nameFurigana) {
        this.nameFurigana = nameFurigana;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public OpenIDAccounts getOpenIDAccounts() {
        return openIDAccounts;
    }

    public void setOpenIDAccounts(OpenIDAccounts openIDAccounts) {
        this.openIDAccounts = openIDAccounts;
    }

    public Object getOrganization() {
        return organization;
    }

    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    public Object getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    public void setPasswordEmailExpirationTime(Object passwordEmailExpirationTime) {
        this.passwordEmailExpirationTime = passwordEmailExpirationTime;
    }

    public Object getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    public void setPasswordExpirationTime(Object passwordExpirationTime) {
        this.passwordExpirationTime = passwordExpirationTime;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }

    public SalesSettings getSalesSettings() {
        return salesSettings;
    }

    public void setSalesSettings(SalesSettings salesSettings) {
        this.salesSettings = salesSettings;
    }

    public ServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    public void setServiceSettings(ServiceSettings serviceSettings) {
        this.serviceSettings = serviceSettings;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public List<Link___________> getLinks() {
        return links;
    }

    public void setLinks(List<Link___________> links) {
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
