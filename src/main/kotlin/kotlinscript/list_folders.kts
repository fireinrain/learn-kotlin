import java.io.File

// kotlinc -script list_folders.kts <path_to_folder>
// kotlinc -script list_folders.kts

val folders = File(args[0]).listFiles { file ->
    file.isDirectory()
}

folders?.forEach { it -> println(it) }
