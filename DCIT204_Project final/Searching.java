public class Searching {

    public static int linearSearch(int[] a,int searchKey) {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == searchKey)
                return i;
        }
        return -1;
    }
    public static int jumpSearch(int[] integers, int elementToSearch) {

        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int)(Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }
    public static int linearSearchForString(String[] a,String searchKey) {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i].equals(searchKey))
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] a,int highest,int lowest,int searchKey) {
         if(lowest <= highest) {
            int mid = lowest + (highest - lowest) / 2;
            if (a[mid] == searchKey) {
                return mid;
            }
            if(a[mid] > searchKey){
                    return binarySearch(a,lowest,mid-1,searchKey);
                }
            return binarySearch(a,lowest,mid+1,searchKey);
        }
        return -1;
    }
    public static int binarySearchForString(String[] a,String searchKey) {
        int highest=a.length-1;
        int lowest=0;
        if(lowest<= highest) {
            int mid = lowest + (highest - lowest) / 2;
            int res = searchKey.compareTo(a[mid]);
            if (res > 0){
                lowest = mid + 1;
            }else{
                highest=mid - 1;
            }
        }
        return -1;
    }

}