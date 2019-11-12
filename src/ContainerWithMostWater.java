public class ContainerWithMostWater {

    public static void main(String[] args) {
        maxWater();
    }

    public static void maxWater()
    {
        //change the array as needed
        int a[] = {1,8,6,2,5,4,8,3,7};
        int a2[] = {1,3,6,2,5,4,8,8,7};
        int area = 0;
        int maxArea = -1;
        for (int i =0;i<a2.length;i++)
        {
            for (int j=1;j<a2.length;j++)
            {
                if (a2[i] >a2[j])
                {
                    area = a2[j]*(Math.abs(i-j));
                }
                else
                {
                    area = a2[i]*(Math.abs(i-j));
                }

                if (maxArea<area)
                {
                    maxArea = area;
                }
            }
        }
        System.out.println("The maximum area of water that can be accomodated is"+""+maxArea);
    }
}
