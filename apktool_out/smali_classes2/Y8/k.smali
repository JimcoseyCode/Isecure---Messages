.class final LY8/k;
.super LR8/J;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final i:LY8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY8/k;

    .line 2
    .line 3
    invoke-direct {v0}, LY8/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY8/k;->i:LY8/k;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/J;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public J0(Ln7/j;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, LY8/c;->o:LY8/c;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, p2, v0, v1}, LY8/f;->P0(Ljava/lang/Runnable;ZZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public K0(Ln7/j;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, LY8/c;->o:LY8/c;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, v0, v0}, LY8/f;->P0(Ljava/lang/Runnable;ZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public M0(ILjava/lang/String;)LR8/J;
    .locals 1

    .line 1
    invoke-static {p1}, LW8/m;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, LY8/j;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p2}, LW8/m;->b(LR8/J;Ljava/lang/String;)LR8/J;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-super {p0, p1, p2}, LR8/J;->M0(ILjava/lang/String;)LR8/J;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
