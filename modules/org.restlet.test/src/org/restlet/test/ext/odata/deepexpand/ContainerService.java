/**
 * Copyright 2005-2017 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.test.ext.odata.deepexpand;

import org.restlet.ext.odata.Query;

/**
 * Generated by the generator tool for the OData extension for the Restlet
 * framework.<br>
 * 
 * @see <a href="http://localhost:8111/CoopOData.svc/$metadata">Metadata of the
 *      target OData service</a>
 * 
 */
public class ContainerService extends org.restlet.ext.odata.Service {

    /**
     * Constructor.
     * 
     */
    public ContainerService() {
        super("http://localhost:8111/CoopOData.svc");
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Attachment entity)
            throws Exception {
        addEntity("/Attachment", entity);
    }

    /**
     * Creates a query for attachment entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Attachment> createAttachmentQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Attachment.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.JobPosting entity)
            throws Exception {
        addEntity("/JobPosting", entity);
    }

    /**
     * Creates a query for jobPosting entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.JobPosting> createJobPostingQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.JobPosting.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Company entity)
            throws Exception {
        addEntity("/Company", entity);
    }

    /**
     * Creates a query for company entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Company> createCompanyQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Company.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Telephone entity)
            throws Exception {
        addEntity("/Telephone", entity);
    }

    /**
     * Creates a query for telephone entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Telephone> createTelephoneQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Telephone.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Role entity)
            throws Exception {
        addEntity("/Role", entity);
    }

    /**
     * Creates a query for role entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Role> createRoleQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Role.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Branch entity)
            throws Exception {
        addEntity("/Branch", entity);
    }

    /**
     * Creates a query for branch entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Branch> createBranchQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Branch.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Category entity)
            throws Exception {
        addEntity("/Category", entity);
    }

    /**
     * Creates a query for category entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Category> createCategoryQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Category.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.ActivitySector entity)
            throws Exception {
        addEntity("/ActivitySector", entity);
    }

    /**
     * Creates a query for activitySector entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.ActivitySector> createActivitySectorQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.ActivitySector.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Division entity)
            throws Exception {
        addEntity("/Division", entity);
    }

    /**
     * Creates a query for division entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Division> createDivisionQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Division.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.EntityAccess entity)
            throws Exception {
        addEntity("/EntityAccess", entity);
    }

    /**
     * Creates a query for entityAccess entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.EntityAccess> createEntityAccessQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.EntityAccess.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Nationality entity)
            throws Exception {
        addEntity("/Nationality", entity);
    }

    /**
     * Creates a query for nationality entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Nationality> createNationalityQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Nationality.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(org.restlet.test.ext.odata.deepexpand.model.Job entity)
            throws Exception {
        addEntity("/Job", entity);
    }

    /**
     * Creates a query for job entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Job> createJobQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Job.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.JobPostingPart entity)
            throws Exception {
        addEntity("/JobPostingPart", entity);
    }

    /**
     * Creates a query for jobPostingPart entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.JobPostingPart> createJobPostingPartQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.JobPostingPart.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Lesson entity)
            throws Exception {
        addEntity("/Lesson", entity);
    }

    /**
     * Creates a query for lesson entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Lesson> createLessonQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Lesson.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Language entity)
            throws Exception {
        addEntity("/Language", entity);
    }

    /**
     * Creates a query for language entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Language> createLanguageQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Language.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Requirement entity)
            throws Exception {
        addEntity("/Requirement", entity);
    }

    /**
     * Creates a query for requirement entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Requirement> createRequirementQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Requirement.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.InsuranceContract entity)
            throws Exception {
        addEntity("/InsuranceContract", entity);
    }

    /**
     * Creates a query for insuranceContract entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.InsuranceContract> createInsuranceContractQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.InsuranceContract.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Multilingual entity)
            throws Exception {
        addEntity("/Multilingual", entity);
    }

    /**
     * Creates a query for multilingual entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Multilingual> createMultilingualQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Multilingual.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.FinancialSource entity)
            throws Exception {
        addEntity("/FinancialSource", entity);
    }

    /**
     * Creates a query for financialSource entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.FinancialSource> createFinancialSourceQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.FinancialSource.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.JobPartSpecialPayable entity)
            throws Exception {
        addEntity("/JobPartSpecialPayable", entity);
    }

    /**
     * Creates a query for jobPartSpecialPayable entities hosted by this
     * service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.JobPartSpecialPayable> createJobPartSpecialPayableQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.JobPartSpecialPayable.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Location entity)
            throws Exception {
        addEntity("/Location", entity);
    }

    /**
     * Creates a query for location entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Location> createLocationQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Location.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Payment entity)
            throws Exception {
        addEntity("/Payment", entity);
    }

    /**
     * Creates a query for payment entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Payment> createPaymentQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Payment.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Person entity)
            throws Exception {
        addEntity("/Person", entity);
    }

    /**
     * Creates a query for person entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Person> createPersonQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Person.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Professor entity)
            throws Exception {
        addEntity("/Professor", entity);
    }

    /**
     * Creates a query for professor entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Professor> createProfessorQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Professor.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.CompanyPerson entity)
            throws Exception {
        addEntity("/CompanyPerson", entity);
    }

    /**
     * Creates a query for companyPerson entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.CompanyPerson> createCompanyPersonQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.CompanyPerson.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Permission entity)
            throws Exception {
        addEntity("/Permission", entity);
    }

    /**
     * Creates a query for permission entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Permission> createPermissionQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Permission.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Registration entity)
            throws Exception {
        addEntity("/Registration", entity);
    }

    /**
     * Creates a query for registration entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Registration> createRegistrationQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Registration.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Literal entity)
            throws Exception {
        addEntity("/Literal", entity);
    }

    /**
     * Creates a query for literal entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Literal> createLiteralQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Literal.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.JobPostingPartSpecialPayable entity)
            throws Exception {
        addEntity("/JobPostingPartSpecialPayable", entity);
    }

    /**
     * Creates a query for jobPostingPartSpecialPayable entities hosted by this
     * service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.JobPostingPartSpecialPayable> createJobPostingPartSpecialPayableQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.JobPostingPartSpecialPayable.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Student entity)
            throws Exception {
        addEntity("/Student", entity);
    }

    /**
     * Creates a query for student entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Student> createStudentQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Student.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.FacultyUser entity)
            throws Exception {
        addEntity("/FacultyUser", entity);
    }

    /**
     * Creates a query for facultyUser entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.FacultyUser> createFacultyUserQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.FacultyUser.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.AuthenticatedUser entity)
            throws Exception {
        addEntity("/AuthenticatedUser", entity);
    }

    /**
     * Creates a query for authenticatedUser entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.AuthenticatedUser> createAuthenticatedUserQuery(
            String subpath) {
        return createQuery(
                subpath,
                org.restlet.test.ext.odata.deepexpand.model.AuthenticatedUser.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.University entity)
            throws Exception {
        addEntity("/University", entity);
    }

    /**
     * Creates a query for university entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.University> createUniversityQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.University.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Department entity)
            throws Exception {
        addEntity("/Department", entity);
    }

    /**
     * Creates a query for department entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Department> createDepartmentQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Department.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.JobPart entity)
            throws Exception {
        addEntity("/JobPart", entity);
    }

    /**
     * Creates a query for jobPart entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.JobPart> createJobPartQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.JobPart.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Group entity)
            throws Exception {
        addEntity("/Group", entity);
    }

    /**
     * Creates a query for group entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Group> createGroupQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Group.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Invitation entity)
            throws Exception {
        addEntity("/Invitation", entity);
    }

    /**
     * Creates a query for invitation entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Invitation> createInvitationQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Invitation.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Report entity)
            throws Exception {
        addEntity("/Report", entity);
    }

    /**
     * Creates a query for report entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Report> createReportQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Report.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Address entity)
            throws Exception {
        addEntity("/Address", entity);
    }

    /**
     * Creates a query for address entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Address> createAddressQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Address.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.Email entity)
            throws Exception {
        addEntity("/EMail", entity);
    }

    /**
     * Creates a query for email entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.Email> createEmailQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.Email.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.ReportType entity)
            throws Exception {
        addEntity("/ReportType", entity);
    }

    /**
     * Creates a query for reportType entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.ReportType> createReportTypeQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.ReportType.class);
    }

    /**
     * Adds a new entity to the service.
     * 
     * @param entity
     *            The entity to add to the service.
     * @throws Exception
     */
    public void addEntity(
            org.restlet.test.ext.odata.deepexpand.model.CoOp entity)
            throws Exception {
        addEntity("/CoOp", entity);
    }

    /**
     * Creates a query for coOp entities hosted by this service.
     * 
     * @param subpath
     *            The path to this entity relatively to the service URI.
     * @return A query object.
     */
    public Query<org.restlet.test.ext.odata.deepexpand.model.CoOp> createCoOpQuery(
            String subpath) {
        return createQuery(subpath,
                org.restlet.test.ext.odata.deepexpand.model.CoOp.class);
    }

}