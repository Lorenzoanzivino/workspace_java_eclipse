// tree.js
const fs = require("fs");
const path = require("path");

const rootDir = __dirname;
const outputFile = path.join(rootDir, "STRUCTURE.md");

// Cartelle/Files da ignorare
const ignoreList = [
  ".git",
  ".metadata",
  "bin",
  "target",
  ".classpath",
  ".project",
  ".settings",
  ".factorypath",
  ".env",
];

function walk(dir, prefix = "") {
  const entries = fs.readdirSync(dir, { withFileTypes: true });
  let tree = "";

  // Filtra i file da ignorare
  const filtered = entries.filter((entry) => !ignoreList.includes(entry.name));

  filtered.forEach((entry, index) => {
    const isLast = index === filtered.length - 1;
    const pointer = isLast ? "└── " : "├── ";
    tree += prefix + pointer + entry.name + "\n";

    if (entry.isDirectory()) {
      const newPrefix = prefix + (isLast ? "    " : "│   ");
      tree += walk(path.join(dir, entry.name), newPrefix);
    }
  });

  return tree;
}

const treeStr = walk(rootDir);
fs.writeFileSync(outputFile, treeStr, "utf8");
console.log(`Struttura salvata in ${outputFile}`);
