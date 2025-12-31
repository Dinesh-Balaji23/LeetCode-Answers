class MinStack {
public:
    vector<pair<int, int>> s;  // pair<value, minSoFar>
    int tp = -1;

    MinStack() {
    }
    
    void push(int val) {
        int mn;
        if (tp == -1) mn = val;  // first element
        else mn = min(s[tp].second, val);  // min so far
        tp++;
        if (tp < (int)s.size()) s[tp] = {val, mn};
        else s.push_back({val, mn});
    }
    
    void pop() {
        if (tp >= 0) tp--;
    }
    
    int top() {
        return s[tp].first;
    }
    
    int getMin() {
        return s[tp].second;
    }
};