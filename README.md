🚇 Cairo Metro Route Finder

An efficient, Kotlin-based CLI application built to navigate the Cairo Metro network. This project calculates the optimal path between stations, estimates trip duration, and provides dynamic fare pricing.

🚀 Key Features
- **Smart Pathfinding:** Finds the shortest route across all Cairo Metro lines.
- **Fare Calculation:** Dynamic pricing based on the current metro tariff system.
- **Time Estimation:** Provides expected travel time for the journey.
- **Interchange Guidance:** Clear instructions for switching between lines (e.g., Line 1, 2, and 3).
- **Clean Architecture:** Organized code following separation of concerns (Data, Domain, and Presentation layers).

🛠️ Technical Implementation
- **Language:** Kotlin 
- **Data Format:** JSON-based station management using **Gson**.
- **Design Patterns:** Implemented **SOLID Principles** to ensure the code is scalable and maintainable.
- **Logic:** Utilizing efficient algorithms to process station nodes and line transitions.

💻 Sample Output
===================================
=     Cairo Metro Route Finder    =
===================================

Enter start station: Alf Maskan
Enter end station: El-Malek El-Saleh

Route:
-----------------------------------
• Alf Maskan (LINE_3)
• Heliopolis Square (LINE_3)
• Haroun (LINE_3)
• Al-Ahram (LINE_3)
• Koleyet El-Banat (LINE_3)
• Stadium (LINE_3)
• Fair Zone (LINE_3)
• Abbassia (LINE_3)
• Abdou Pasha (LINE_3)
• El Geish (LINE_3)
• Bab El Shaaria (LINE_3)
• Attaba (LINE_3)
• Nasser (LINE_3)
{{{{ -> Take direction towards Helwan  <- }}}}
• Sadat (LINE_1)
• Saad Zaghloul (LINE_1)
• Al-Sayeda Zeinab (LINE_1)
• El-Malek El-Saleh (LINE_1)

-----------------------------------
Stations: 17
Time: 54 min
Fare: 15 EGP



📁 Project Structure
src/data: Handles data sources (JSON) and repositories.

src/domain: Contains business logic and entities.

src/di: Dependency Injection setup (AppModule).

src/presentation: CLI UI and user interaction.

🎓 About
This project was developed during Week 4 of the Digilians (Digital Pioneers) initiative. It reflects a commitment to deep technical specialization, focusing on clean code, algorithms, and mobile development foundations.

Developed with by [Amira Abdel-fatah]
