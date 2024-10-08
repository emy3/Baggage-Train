# 🐉 **Baggage-Train a D&D Management Application** 🎲

## **Project Description**
The **D&D Management Application** is a simple Java-based console application designed to help Dungeon Masters and players manage their characters' details, attributes, inventory, and spells. This tool provides a quick way to create, view, and update character information, making campaign management easier. The application is intended for both beginners and enthusiasts who want to streamline their D&D sessions.

## **Table of Contents**
1. [Features](#features) ✨
2. [Requirements](#requirements) 📋
3. [Installation](#installation) ⚙️
4. [Usage](#usage) 📖
5. [Project Structure](#project-structure) 🗂️
6. [Contributing](#contributing) 🤝
7. [Future Enhancements](#future-enhancements) 🚀

## **Features** ✨
- **Character Management** 👤
    - Create, view, edit, and delete character profiles.
    - Store character attributes such as Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma.

- **Inventory Management** 📦
    - Add, view, and remove items from a character's inventory.
    - Track item details like name, type, and quantity.

- **Spell Management** ✨
    - Add and view character spells.
    - Store spell details such as name, level, and description.

## **Requirements** 📋
- Java 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse) or command line to compile and run the program

## **Installation** ⚙️
1. Clone the repository:
   ```bash
   git clone [https://github.com/yourusername/dnd-management-application.git](https://github.com/emy3/Baggage-Train.git)
   ```
2. Open the project in your preferred IDE or navigate to the project directory via terminal.
3. Compile the source files:
   ```bash
   javac -d bin src/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin Main
   ```

## **Usage** 📖
Once you start the application, you will be greeted with a menu like the following:

```
Welcome to the D&D Management System! 🎉

1. Create Character
2. View Character
3. Edit Character
4. Delete Character
5. Manage Inventory
6. Manage Spells
7. Exit
```

Choose an option by entering the corresponding number. You can perform various operations like creating new characters, viewing and updating attributes, managing inventory, and handling spells.

## **Project Structure** 🗂️
```
DND-Management-Application/
├── src/
│   ├── Main.java             # Entry point of the application
│   ├── Character.java        # Character class for storing player attributes
│   ├── Attribute.java        # Attributes (Strength, Dexterity, etc.)
│   ├── Inventory.java        # Inventory management class
│   └── Spell.java            # Spell management class
├── bin/                      # Compiled Java bytecode files
├── README.md                 # Project documentation
└── .gitignore                # Git ignore file
```

## **Contributing** 🤝
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## **Future Enhancements** 🚀
- Implement a GUI using JavaFX or Swing for a more user-friendly interface.
- Add campaign tracking for Dungeon Masters.
- Include combat simulations and turn management.
- Store data in a database instead of plain text files.

## **License** 📄
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

![Alt](https://repobeats.axiom.co/api/embed/111349f6851246f653a62104b3bb863f9cf2da42.svg "Repobeats analytics image")
