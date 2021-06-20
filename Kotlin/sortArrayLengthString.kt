fun sortArrayLengthString(arr:Array<String>) : Array<String>{
    var i = 0
    while (true) {
        if (i >= arr.size-1-i) break;
        var min = 100; var minIndex = 0
        for (j in 0+i until arr.size-1-i) {
            if (arr[j].length > arr[j+1].length) {
                var save:String = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = save
                if (arr[j].length < min) {
                    min = arr[j].length; minIndex = j
                }
            }
        }
        if (arr[i].length > arr[minIndex].length) {
            var save:String = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = save
        }
        i++
    }
    return arr
}
