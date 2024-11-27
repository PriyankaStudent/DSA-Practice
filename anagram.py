import sys
input = sys.stdin.read

def minimize_sum(T, test_cases):
    results = []
    for t in range(T):
        N = test_cases[t][0]
        A = test_cases[t][1]

        # Process the array
        for i in range(1, N - 1):
            if A[i - 1] + A[i + 1] == 4:
                A[i] = 4 - A[i]  # Toggle A[i] to minimize it

        # Append the sum of the array
        results.append(str(sum(A)))  # Convert to string for efficient output joining

    return results


# Input Handling
data = input().split()
T = int(data[0])

index = 1
test_cases = []
for _ in range(T):
    N = int(data[index])
    index += 1
    A = list(map(int, data[index:index + N]))
    index += N
    test_cases.append((N, A))

# Solve
results = minimize_sum(T, test_cases)

# Output the results efficiently
sys.stdout.write("\n".join(results) + "\n")
