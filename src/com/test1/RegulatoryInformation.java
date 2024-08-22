package com.test1;

public class RegulatoryInformation {
	private Integer safeBanking;
	private String rbiAwarenessCampaign;
	private String bewareOfFicticiousOffer;
	private Integer regulatoryDisclosure;
	private Integer accessInfoCount;
	private String unclaimedDeposits;
	private Integer unclaimedAccountIds;
	private Integer mediaCenter;
	private String formCenter;
	private Integer customerCareNumber;
	private Integer complaintsCount;
	private String complaintsAddressed;
	private String remarks;

	public RegulatoryInformation() {

	}

	public RegulatoryInformation(Integer safeBanking, String rbiAwarenessCampaign, String bewareOfFicticiousOffer,
			Integer regulatoryDisclosure, Integer accessInfoCount, String unclaimedDeposits,
			Integer unclaimedAccountIds, Integer mediaCenter, String formCenter, Integer customerCareNumber,
			Integer complaintsCount, String complaintsAddressed, String remarks) {
		super();
		this.safeBanking = safeBanking;
		this.rbiAwarenessCampaign = rbiAwarenessCampaign;
		this.bewareOfFicticiousOffer = bewareOfFicticiousOffer;
		this.regulatoryDisclosure = regulatoryDisclosure;
		this.accessInfoCount = accessInfoCount;
		this.unclaimedDeposits = unclaimedDeposits;
		this.unclaimedAccountIds = unclaimedAccountIds;
		this.mediaCenter = mediaCenter;
		this.formCenter = formCenter;
		this.customerCareNumber = customerCareNumber;
		this.complaintsCount = complaintsCount;
		this.complaintsAddressed = complaintsAddressed;
		this.remarks = remarks;
	}

	public Integer getSafeBanking() {
		return safeBanking;
	}

	public void setSafeBanking(Integer safeBanking) {
		this.safeBanking = safeBanking;
	}

	public String getRbiAwarenessCampaign() {
		return rbiAwarenessCampaign;
	}

	public void setRbiAwarenessCampaign(String rbiAwarenessCampaign) {
		this.rbiAwarenessCampaign = rbiAwarenessCampaign;
	}

	public String getBewareOfFicticiousOffer() {
		return bewareOfFicticiousOffer;
	}

	public void setBewareOfFicticiousOffer(String bewareOfFicticiousOffer) {
		this.bewareOfFicticiousOffer = bewareOfFicticiousOffer;
	}

	public Integer getRegulatoryDisclosure() {
		return regulatoryDisclosure;
	}

	public void setRegulatoryDisclosure(Integer regulatoryDisclosure) {
		this.regulatoryDisclosure = regulatoryDisclosure;
	}

	public Integer getAccessInfoCount() {
		return accessInfoCount;
	}

	public void setAccessInfoCount(Integer accessInfoCount) {
		this.accessInfoCount = accessInfoCount;
	}

	public String getUnclaimedDeposits() {
		return unclaimedDeposits;
	}

	public void setUnclaimedDeposits(String unclaimedDeposits) {
		this.unclaimedDeposits = unclaimedDeposits;
	}

	public Integer getUnclaimedAccountIds() {
		return unclaimedAccountIds;
	}

	public void setUnclaimedAccountIds(Integer unclaimedAccountIds) {
		this.unclaimedAccountIds = unclaimedAccountIds;
	}

	public Integer getMediaCenter() {
		return mediaCenter;
	}

	public void setMediaCenter(Integer mediaCenter) {
		this.mediaCenter = mediaCenter;
	}

	public String getFormCenter() {
		return formCenter;
	}

	public void setFormCenter(String formCenter) {
		this.formCenter = formCenter;
	}

	public Integer getCustomerCareNumber() {
		return customerCareNumber;
	}

	public void setCustomerCareNumber(Integer customerCareNumber) {
		this.customerCareNumber = customerCareNumber;
	}

	public Integer getComplaintsCount() {
		return complaintsCount;
	}

	public void setComplaintsCount(Integer complaintsCount) {
		this.complaintsCount = complaintsCount;
	}

	public String getComplaintsAddressed() {
		return complaintsAddressed;
	}

	public void setComplaintsAddressed(String complaintsAddressed) {
		this.complaintsAddressed = complaintsAddressed;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
