.class final LG4/W6;
.super LG4/C6;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final transient j:[Ljava/lang/Object;

.field private final transient k:I

.field private final transient l:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LG4/C6;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG4/W6;->j:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, LG4/W6;->k:I

    .line 7
    .line 8
    iput p3, p0, LG4/W6;->l:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LG4/W6;->l:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, LG4/G1;->a(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LG4/W6;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    add-int/2addr p1, p1

    .line 11
    iget v1, p0, LG4/W6;->k:I

    .line 12
    .line 13
    add-int/2addr p1, v1

    .line 14
    aget-object p1, v0, p1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LG4/W6;->l:I

    .line 2
    .line 3
    return v0
.end method
