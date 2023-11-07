| No. | Rank | Risk Description                                           | Category        | Root Cause                              | Triggers                                   | Potential Response                                              | Risk Owner         | Probability | Impact | Risk Response Strategy                                            |
|-----|------|------------------------------------------------------------|-----------------|-----------------------------------------|--------------------------------------------|------------------------------------------------------------------|--------------------|--------------|--------|--------------------------------------------------------------------|
| 1   | 3    | Data Breach                                                | Security        | Insufficient Encryption                 | Unauthorized Access                         | Implement Strong Encryption                                      | Security Team      | 2            | 3      | Mitigate - Enhance Encryption                                       |
| 2   | 2    | User Privacy Concerns                                      | Privacy         | Inadequate Privacy Policies              | Increased User Complaints                    | Review and Update Privacy Policies                               | Legal Team         | 1            | 2      | Mitigate - Educate Users on Privacy Settings                        |
| 3   | 3    | Server Downtime                                            | Technical       | Insufficient Server Capacity             | Increased User Reports                      | Upgrade Server Capacity                                          | IT Team            | 2            | 3      | Accept - Regular Maintenance Scheduled                             |
| 4   | 1    | Inaccurate Pairing                                         | Functionality   | Flawed Matching Algorithm               | Mismatched User Pairs                        | Refine Matching Algorithm                                        | Development Team   | 1            | 1      | Mitigate - Continuous Algorithm Improvement                       |
| 5   | 2    | User-generated Content Violation                           | Content         | Lack of Content Moderation              | Reports of Offensive Content                 | Implement Content Moderation System                             | Moderation Team    | 2            | 2      | Mitigate - Strict Content Review Policies                           |
| 6   | 1    | Feature Misuse                                             | Functionality   | Poor User Guidance                      | Increased Support Tickets                   | Improve User Guides and Tutorials                                 | Support Team       | 1            | 1      | Mitigate - Enhance User Education                                   |
| 7   | 3    | Legal Compliance Issues                                    | Legal           | Inadequate Compliance Procedures         | Legal Notices or Complaints                  | Conduct Legal Audit and Compliance Training                       | Legal Team         | 2            | 3      | Mitigate - Ensure Compliance Standards                             |
| 8   | 3    | API Dependency Issues                                      | Technical       | Unstable Third-party APIs                | Frequent API Downtime, Changes in API Output | Monitor API Health, Have Backup Plans in Place                    | Development Team   | 3            | 3      | Mitigate - Identify Alternative APIs, Error Handling                |
| 9   | 2    | Stakeholder Resistance                                      | Organizational  | Lack of Involvement or Communication    | Negative Feedback, Reduced User Adoption   | Engage Stakeholders Early, Communicate Benefits                  | Project Manager    | 2            | 2      | Mitigate - Provide Training, Address Concerns Promptly             |
| 10  | 2    | Budget Resistance                                            | Financial       | Budget Constraints, Misalignment        | Increased Requests for Additional Funding | Transparent Budget Communication, Prioritize Needs               | Finance Team       | 2            | 2      | Accept - Seek Alternative Funding, Prioritize Features           |
| 11  | 2    | Inadequate User Interface                                    | Design          | Lack of User-Centered Design Principles | User Complaints about Usability             | Conduct User Testing, Redesign UI to Address Feedback             | UX/UI Team         | 2            | 2      | Mitigate - Implement User-Centered Design Principles               |
| 12  | 3    | Technical Issues                                            | Technical       | System Bugs, Integration Failures       | System Downtime, Data Corruption            | Implement Rigorous Testing, Regular System Audits                 | IT Team            | 3            | 3      | Mitigate - Rigorous Testing, Implement Monitoring Tools           |
| 13  | 2    | Users Posting False Information / Trolling                  | User Behavior   | Misleading Game Experiences            | Reports of False or Trolling Content         | Implement User Reporting Mechanisms, Content Moderation Policies | Community Manager  | 2            | 2      | Mitigate - Educate Users, Implement Reporting and Moderation Systems |
| 14  | 3    | Risk of Exploitation for Minors                             | Safety          | Accessibility to Minors                 | Reports of Predatory Behavior                | Implement Strict Age Verification, Educate Users on Online Safety| Safety Team        | 2            | 3      | Mitigate - Strict Age Verification, Implement Robust Safety Measures|
| 15  | 2    | Disagreements Between Users                                | Community       | Differing Game Preferences or Comments   | Reports of User Conflicts                   | Implement Community Guidelines, Mediation Processes               | Community Manager  | 2            | 2      | Mitigate - Facilitate User Mediation, Enforce Community Guidelines  |
| 16  | 2    | Lack of Accessibility Features                               | Accessibility    | Neglecting Inclusive Design Principles  | Reports of Excluded Users with Disabilities | Implement Accessibility Features, Conduct Accessibility Testing  | Accessibility Team  | 2            | 3      | Mitigate - Prioritize Accessibility, Engage with Accessibility Community |
| 17  | 3    | External Platform/API Disruptions                          | Technical       | Changes or Disruptions to External APIs | Reports of Functionality Issues              | Monitor External APIs, Have Contingency Plans                      | Development Team   | 3            | 3      | Mitigate - Monitor API Health, Identify Alternative APIs, Establish Contingency Plans |
| 18  | 3    | Weak Authentication Mechanisms                             | Security        | Lack of Strong Authentication Methods  | Reports of Unauthorized Access              | Implement Multi-Factor Authentication, Regular Security Audits    | Security Team      | 3            | 3      | Mitigate - Enhance Authentication Mechanisms                      |
| 19  | 3    | Algorithmic Bias in User Matching                          | Algorithm       | Inherent Bias in Matching Algorithms    | Reports of Bias or Discrimination             | Implement Bias Detection and Mitigation, Regular Algorithm Audits | Algorithm Team     | 3            | 3      | Mitigate - Continuous Algorithm Monitoring and Improvement       |
| 20  | 3    | Security Consistency Across Gaming Platforms               | Security        | Varied Security Measures Across Platforms | Reports of Security Gaps                     | Implement Unified Security Standards, Regular Security Audits   | Security Team      | 3            | 3      | Mitigate - Establish Unified Security Protocols Across Platforms |





# User Table

| Field         | Field Type      | Type         | Required | Description               | Example                  |
|---------------|-----------------|--------------|----------|---------------------------|--------------------------|
| UserID (PK)   | INT             | Primary Key  | Yes      | Unique identifier         | 1                        |
| FirstName     | VARCHAR(255)    |              | No       | User's first name         | John                     |
| LastName      | VARCHAR(255)    |              | No       | User's last name          | Doe                      |
| Username      | VARCHAR(255)    |              | Yes      | User's username           | johnD                    |
| Email         | VARCHAR(255)    |              | Yes      | User's email              | john@example.com        |
| Password      | VARCHAR(255)    |              | Yes      | Hashed password           | **************          |
| DateJoined    | DATETIME        |              | Yes      | Date of joining           | 2022-01-01 12:00:00     |
| ConsoleChoice | VARCHAR(255)    |              | No       | Game console choice       | PlayStation             |

# IGDB Table

| Field      | Field Type      | Type         | Required | Description               | Example                  |
|------------|-----------------|--------------|----------|---------------------------|--------------------------|
| IGDBID (PK)| INT             | Primary Key  | Yes      | Unique identifier from IGDB | 12345                   |
| Title      | VARCHAR(255)    |              | Yes      | Game title                | The Witcher 3            |
| Genre      | VARCHAR(255)    |              |          | Game genre                | RPG                      |
| Platform   | VARCHAR(255)    |              |          | Game platform             | PC                       |
| ReleaseDate| DATE            |              |          | Release date              | 2015-05-19               |
| Description| TEXT            |              |          | Game description          | Action RPG set in an open fantasy world |
| IGDBRating | FLOAT           |              |          | IGDB rating               | 9.5                      |
| Creator    | VARCHAR(255)    |              |          | Game creator/developer    | CD Projekt Red           |

# UserGame Table

| Field       | Field Type      | Type         | Required | Description               | Example                  |
|-------------|-----------------|--------------|----------|---------------------------|--------------------------|
| UserGameID  | INT             | Primary Key  | Yes      | Unique identifier         | 1                        |
| UserID (FK) | INT             | Foreign Key  | Yes      | References User           | 1                        |
| GameID (FK) | INT             | Foreign Key  | Yes      | References IGDB           | 12345                    |
| Playtime    | INT             |              |          | Total playtime            | 50                       |
| LastPlayed  | DATETIME        |              |          | Last play date            | 2022-02-15 18:45:00      |
| Status      | VARCHAR(255)    |              |          | Game status               | Playing                  |

# Post Table

| Field        | Field Type      | Type         | Required | Description               | Example                  |
|--------------|-----------------|--------------|----------|---------------------------|--------------------------|
| PostID (PK)  | INT             | Primary Key  | Yes      | Unique identifier         | 1                        |
| UserID (FK)  | INT             | Foreign Key  | Yes      | References User           | 1                        |
| GameID (FK)  | INT             | Foreign Key  | Yes      | References IGDB           | 12345                    |
| Title        | VARCHAR(255)    |              | Yes      | Post title                | The Witcher 3 Impressions|
| Content      | TEXT            |              |          | Post content              | Just started playing The Witcher 3 and... |
| CreationDate | DATETIME        |              | Yes      | Creation date             | 2022-02-16 09:15:00     |
| UpdateDate   | DATETIME        |              |          | Last update date          | 2022-02-16 12:30:00     |

# Comment Table

| Field       | Field Type      | Type         | Required | Description               | Example                  |
|-------------|-----------------|--------------|----------|---------------------------|--------------------------|
| CommentID (PK)| INT            | Primary Key  | Yes      | Unique identifier         | 1                        |
| PostID (FK) | INT             | Foreign Key  | Yes      | References Post           | 1                        |
| UserID (FK) | INT             | Foreign Key  | Yes      | References User           | 2                        |
| Content     | TEXT            |              | Yes      | Comment content           | Enjoy the game! It gets even better... |
| CreationDate| DATETIME        |              | Yes      | Creation date             | 2022-02-16 10:00:00     |
| UpdateDate  | DATETIME        |              |          | Last update date          | 2022-02-16 10:30:00     |
