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
| 2.4          | Administrator       | User List Display and Filter   | Navigate to user list, apply filters, scroll through list.            | List displays and filters correctly.                           |                |       |         |
| 2.5          | Administrator       | Reports on Game Plays          | Generate report on game plays over specified period.                  | Report accurately reflects game plays.                         |                |       |         |
| 2.6          | Administrator       | Reports on Posts               | Generate post activity report for a specified period.                 | Report accurately reflects number of posts.                    |                |       |         |
| 2.7          | Administrator       | Reports on Friend Requests     | Generate report detailing friend request statuses.                    | Report accurately reflects friend request data.                |                |       |         |
| 2.8          | Administrator       | Reports on Game Matches        | Generate report on all gamers matched by game played.                 | Report accurately reflects gamer matches.                      |                |       |         |
| 3.1          | Gamer               | Friend Management              | Manage friends: request, accept, reject, delete.                      | Friend list updates correctly.                                 |                |       |         |
| 3.2          | Gamer               | Play a Game                    | Select a game, play, check history.                                   | Gameplay is recorded in the gamer's history.                   |                |       |         |
| 3.3          | Gamer               | Game Recommendations           | Check recommendations based on profile.                               | Appropriate game recommendations are displayed.                |                |       |         |
| 3.4          | Gamer               | Post Management                | Create, edit, remove posts and check visibility among friends.        | Posts are managed and displayed correctly as per friend status.|                |       |         |
| 3.5          | Gamer               | Commenting and Flagging        | Comment on posts; flag posts/comments as inappropriate.               | Comments are added; flags are recorded and handled.            |                |       |         |
| 3.6          | Gamer               | Feedback on Site               | Provide feedback via feedback form.                                   | Feedback is submitted and recorded.                            |                |       |         |
| 4.1          | Site Administrator  | Game Info Management           | Add, update, delete game information in the database.                 | Game information is correctly updated in the system.           |                |       |         |
| 4.2          | Site Administrator  | Moderate Flagged Content       | Review and act on flagged posts/comments.                             | Flagged content is appropriately moderated.                    |                |       |         |
| 4.3          | Site Administrator  | Announcements Posting          | Post announcements that are visible upon login or in a section.       | Announcements are visible and correct.                         |                |       |         |
| 4.4          | Site Administrator  | View and Manage Feedback       | View and manage feedback submitted by users.                          | Feedback is accessible and can be managed.                     |                |       |         |

## Additional Guidelines
- **Steps**: Should be detailed enough to be repeatable by different testers.
- **Expected Results**: Should describe the ideal outcome to confirm the test passed.
- **Actual Results**: Used during testing to note what actually happened.
- **Grade**: Can be used for qualitative feedback or to give a score based on performance.
- **Working**: "+" if the test passes (meets expected outcome), "-" if the test fails.
