// Добавьте в конец main()-метода:
String outputPath = "target/tourism-lean-presentation.pptx";
try (FileOutputStream out = new FileOutputStream(outputPath)) {
    ppt.write(out);
}
System.out.println("Презентация сохранена в: " + outputPath);