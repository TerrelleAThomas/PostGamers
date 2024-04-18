# Game Track Application Testing Manual

## Test Cases

| Test Case ID | User Role           | Description                    | Steps                                                                 | Expected Results                                              | Actual Results | Grade | Working |
|--------------|---------------------|--------------------------------|-----------------------------------------------------------------------|---------------------------------------------------------------|----------------|-------|---------|
| 1.1          | All Users           | Account Creation               | Navigate to Sign-Up, enter details, submit.                           | Confirmation of account creation.                             |                |       |         |
| 1.2          | All Users           | User Sign-In                   | Go to Sign-In page, enter credentials, submit.                        | User is directed to their role-specific dashboard.            |                |       |         |
| 1.3          | All Users           | Data Visibility                | Sign in, browse available data.                                       | Data displayed matches user privileges.                       |                |       |         |
| 2.1          | Administrator       | Search/Browse for a User       | Navigate to user management, use filters, view details.               | Correct user details are displayed.                            |                |       |         |
| 2.2          | Administrator       | Activate/Deactivate User       | Select user, toggle activation status, confirm.                       | User status is updated as expected.                            |                |       |         |
| 2.3          | Administrator       | Direct Messaging               | Select user, send message, check database.                            | Message is recorded and visible to recipient.                  |                |       |         |
| 3.1          | Gamer               | Friend Requests                | Manage friends: request, accept, reject, delete.                      | Friend list updates correctly.                                 |                |       |         |
| 3.2          | Gamer               | Play a Game                    | Select a game, play, check history.                                   | Gameplay is recorded in the gamer's history.                   |                |       |         |
| 3.3          | Gamer               | Game Recommendations           | Check recommendations based on profile.                               | Appropriate game recommendations are displayed.                |                |       |         |
| 4.1          | Site Administrator  | Add/Update/Delete Game Info    | Manage game info in database.                                         | Game list is correctly updated.                                |                |       |         |
| 4.2          | Site Administrator  | Content Moderation             | Review and act on flagged posts/comments.                             | Inappropriate content is handled as per policy.                |                |       |         |
| 4.3          | Site Administrator  | Post Announcements             | Create and post an announcement.                                      | Announcement is visible to gamers on login/announcements area. |                |       |         |

## Additional Guidelines
- **Steps**: Should be detailed enough to be repeatable by different testers.
- **Expected Results**: Should describe the ideal outcome to confirm the test passed.
- **Actual Results**: Used during testing to note what actually happened.
- **Grade**: Can be used for qualitative feedback or to give a score based on performance.
- **Working**: "+" if the test passes (meets expected outcome), "-" if the test fails.
