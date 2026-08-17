.class final enum Lcom/horcrux/svg/r;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum h:Lcom/horcrux/svg/r;

.field public static final enum i:Lcom/horcrux/svg/r;

.field public static final enum j:Lcom/horcrux/svg/r;

.field public static final enum k:Lcom/horcrux/svg/r;

.field private static final l:Ljava/util/Map;

.field private static final synthetic m:[Lcom/horcrux/svg/r;


# instance fields
.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/r;

    .line 2
    .line 3
    const-string v1, "unknown"

    .line 4
    .line 5
    const-string v2, "UNKNOWN"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/horcrux/svg/r;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/horcrux/svg/r;->h:Lcom/horcrux/svg/r;

    .line 12
    .line 13
    new-instance v0, Lcom/horcrux/svg/r;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "duplicate"

    .line 17
    .line 18
    const-string v4, "DUPLICATE"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/r;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/horcrux/svg/r;->i:Lcom/horcrux/svg/r;

    .line 24
    .line 25
    new-instance v0, Lcom/horcrux/svg/r;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "wrap"

    .line 29
    .line 30
    const-string v4, "WRAP"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/r;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/horcrux/svg/r;->j:Lcom/horcrux/svg/r;

    .line 36
    .line 37
    new-instance v0, Lcom/horcrux/svg/r;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "none"

    .line 41
    .line 42
    const-string v4, "NONE"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/r;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/horcrux/svg/r;->k:Lcom/horcrux/svg/r;

    .line 48
    .line 49
    invoke-static {}, Lcom/horcrux/svg/r;->h()[Lcom/horcrux/svg/r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/horcrux/svg/r;->m:[Lcom/horcrux/svg/r;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/horcrux/svg/r;->l:Ljava/util/Map;

    .line 61
    .line 62
    invoke-static {}, Lcom/horcrux/svg/r;->values()[Lcom/horcrux/svg/r;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    array-length v1, v0

    .line 67
    :goto_0
    if-ge v3, v1, :cond_0

    .line 68
    .line 69
    aget-object v2, v0, v3

    .line 70
    .line 71
    sget-object v4, Lcom/horcrux/svg/r;->l:Ljava/util/Map;

    .line 72
    .line 73
    iget-object v5, v2, Lcom/horcrux/svg/r;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/horcrux/svg/r;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic h()[Lcom/horcrux/svg/r;
    .locals 4

    .line 1
    sget-object v0, Lcom/horcrux/svg/r;->h:Lcom/horcrux/svg/r;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/r;->i:Lcom/horcrux/svg/r;

    .line 4
    .line 5
    sget-object v2, Lcom/horcrux/svg/r;->j:Lcom/horcrux/svg/r;

    .line 6
    .line 7
    sget-object v3, Lcom/horcrux/svg/r;->k:Lcom/horcrux/svg/r;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/horcrux/svg/r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static j(Ljava/lang/String;)Lcom/horcrux/svg/r;
    .locals 3

    .line 1
    sget-object v0, Lcom/horcrux/svg/r;->l:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/horcrux/svg/r;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Unknown \'edgeMode\' Value: "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/r;
    .locals 1

    .line 1
    const-class v0, Lcom/horcrux/svg/r;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/horcrux/svg/r;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/r;->m:[Lcom/horcrux/svg/r;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/horcrux/svg/r;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/horcrux/svg/r;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/r;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
