package common.plugin.authority.dmo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Transient;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserBasicInfo  implements UserDetails, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int MAXERRORTIMES = 10;
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.id
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_code
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date userBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_telephone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_mobile_phone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userMobilePhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_education_degree
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userEducationDegree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_graduation_school
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userGraduationSchool;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_registration_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userRegistrationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identity_card
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identityCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identity_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identify_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identifyPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identify_address
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identifyAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identify_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date identifyBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identify_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identifySex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.identify_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String identifyAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.create_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.update_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.delete_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Integer deleteFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_email
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_type
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.user_password
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.lock_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Integer lockFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.accountun_freeze_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date accountunFreezeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.password_error_times
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Integer passwordErrorTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_basic_info.last_password_reset_date
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    private Date lastPasswordResetDate;
    
    @Transient
    private Set<GrantedAuthority> grantedAuthorities ;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.id
     *
     * @return the value of t_user_basic_info.id
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.id
     *
     * @param id the value for t_user_basic_info.id
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_code
     *
     * @return the value of t_user_basic_info.user_code
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_code
     *
     * @param userCode the value for t_user_basic_info.user_code
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_name
     *
     * @return the value of t_user_basic_info.user_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_name
     *
     * @param userName the value for t_user_basic_info.user_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_age
     *
     * @return the value of t_user_basic_info.user_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserAge() {
        return userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_age
     *
     * @param userAge the value for t_user_basic_info.user_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_sex
     *
     * @return the value of t_user_basic_info.user_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_sex
     *
     * @param userSex the value for t_user_basic_info.user_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_birthday
     *
     * @return the value of t_user_basic_info.user_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_birthday
     *
     * @param userBirthday the value for t_user_basic_info.user_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_photo
     *
     * @return the value of t_user_basic_info.user_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_photo
     *
     * @param userPhoto the value for t_user_basic_info.user_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_telephone
     *
     * @return the value of t_user_basic_info.user_telephone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_telephone
     *
     * @param userTelephone the value for t_user_basic_info.user_telephone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_mobile_phone
     *
     * @return the value of t_user_basic_info.user_mobile_phone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserMobilePhone() {
        return userMobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_mobile_phone
     *
     * @param userMobilePhone the value for t_user_basic_info.user_mobile_phone
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserMobilePhone(String userMobilePhone) {
        this.userMobilePhone = userMobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_education_degree
     *
     * @return the value of t_user_basic_info.user_education_degree
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserEducationDegree() {
        return userEducationDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_education_degree
     *
     * @param userEducationDegree the value for t_user_basic_info.user_education_degree
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserEducationDegree(String userEducationDegree) {
        this.userEducationDegree = userEducationDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_graduation_school
     *
     * @return the value of t_user_basic_info.user_graduation_school
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserGraduationSchool() {
        return userGraduationSchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_graduation_school
     *
     * @param userGraduationSchool the value for t_user_basic_info.user_graduation_school
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserGraduationSchool(String userGraduationSchool) {
        this.userGraduationSchool = userGraduationSchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_registration_time
     *
     * @return the value of t_user_basic_info.user_registration_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserRegistrationTime() {
        return userRegistrationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_registration_time
     *
     * @param userRegistrationTime the value for t_user_basic_info.user_registration_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserRegistrationTime(String userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identity_card
     *
     * @return the value of t_user_basic_info.identity_card
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identity_card
     *
     * @param identityCard the value for t_user_basic_info.identity_card
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identity_name
     *
     * @return the value of t_user_basic_info.identity_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentityName() {
        return identityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identity_name
     *
     * @param identityName the value for t_user_basic_info.identity_name
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identify_photo
     *
     * @return the value of t_user_basic_info.identify_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentifyPhoto() {
        return identifyPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identify_photo
     *
     * @param identifyPhoto the value for t_user_basic_info.identify_photo
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentifyPhoto(String identifyPhoto) {
        this.identifyPhoto = identifyPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identify_address
     *
     * @return the value of t_user_basic_info.identify_address
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentifyAddress() {
        return identifyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identify_address
     *
     * @param identifyAddress the value for t_user_basic_info.identify_address
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentifyAddress(String identifyAddress) {
        this.identifyAddress = identifyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identify_birthday
     *
     * @return the value of t_user_basic_info.identify_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getIdentifyBirthday() {
        return identifyBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identify_birthday
     *
     * @param identifyBirthday the value for t_user_basic_info.identify_birthday
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentifyBirthday(Date identifyBirthday) {
        this.identifyBirthday = identifyBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identify_sex
     *
     * @return the value of t_user_basic_info.identify_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentifySex() {
        return identifySex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identify_sex
     *
     * @param identifySex the value for t_user_basic_info.identify_sex
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentifySex(String identifySex) {
        this.identifySex = identifySex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.identify_age
     *
     * @return the value of t_user_basic_info.identify_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getIdentifyAge() {
        return identifyAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.identify_age
     *
     * @param identifyAge the value for t_user_basic_info.identify_age
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setIdentifyAge(String identifyAge) {
        this.identifyAge = identifyAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.create_time
     *
     * @return the value of t_user_basic_info.create_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.create_time
     *
     * @param createTime the value for t_user_basic_info.create_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.update_time
     *
     * @return the value of t_user_basic_info.update_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.update_time
     *
     * @param updateTime the value for t_user_basic_info.update_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.delete_flag
     *
     * @return the value of t_user_basic_info.delete_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.delete_flag
     *
     * @param deleteFlag the value for t_user_basic_info.delete_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_email
     *
     * @return the value of t_user_basic_info.user_email
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_email
     *
     * @param userEmail the value for t_user_basic_info.user_email
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_type
     *
     * @return the value of t_user_basic_info.user_type
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_type
     *
     * @param userType the value for t_user_basic_info.user_type
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.user_password
     *
     * @return the value of t_user_basic_info.user_password
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.user_password
     *
     * @param userPassword the value for t_user_basic_info.user_password
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.lock_flag
     *
     * @return the value of t_user_basic_info.lock_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.lock_flag
     *
     * @param lockFlag the value for t_user_basic_info.lock_flag
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.accountun_freeze_time
     *
     * @return the value of t_user_basic_info.accountun_freeze_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getAccountunFreezeTime() {
        return accountunFreezeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.accountun_freeze_time
     *
     * @param accountunFreezeTime the value for t_user_basic_info.accountun_freeze_time
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setAccountunFreezeTime(Date accountunFreezeTime) {
        this.accountunFreezeTime = accountunFreezeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.password_error_times
     *
     * @return the value of t_user_basic_info.password_error_times
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Integer getPasswordErrorTimes() {
        return passwordErrorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.password_error_times
     *
     * @param passwordErrorTimes the value for t_user_basic_info.password_error_times
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setPasswordErrorTimes(Integer passwordErrorTimes) {
        this.passwordErrorTimes = passwordErrorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_basic_info.last_password_reset_date
     *
     * @return the value of t_user_basic_info.last_password_reset_date
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_basic_info.last_password_reset_date
     *
     * @param lastPasswordResetDate the value for t_user_basic_info.last_password_reset_date
     *
     * @mbg.generated Tue Jul 30 13:54:29 CST 2019
     */
    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return this.userPassword;
	}

	@Override
	public String getUsername() {
		return this.userCode;
	}
	//账户是否过期,过期无法验证
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	//指定用户是否被锁定或者解锁,锁定的用户无法进行身份验证
	@Override
	public boolean isAccountNonLocked() {
		if (this.passwordErrorTimes!=null && MAXERRORTIMES <passwordErrorTimes) {
			return false;
		}else if (this.lockFlag != null && this.lockFlag != 0 ) {
			return false;
		}
		return true;
	}
	//指示是否已过期的用户的凭据(密码),过期的凭据防止认证
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	//是否被禁用,禁用的用户不能身份验证
	@Override
	public boolean isEnabled() {
		if (this.deleteFlag != null && this.deleteFlag != 0 ) {
			return false;
		}
		return true;
	}

	public Set<GrantedAuthority> getGrantedAuthorities() {
		return grantedAuthorities;
	}

	public void setGrantedAuthorities(Set<GrantedAuthority> grantedAuthorities) {
		this.grantedAuthorities = grantedAuthorities;
	}
	
}