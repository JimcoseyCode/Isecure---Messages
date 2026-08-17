.class final enum Lcom/horcrux/svg/s;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum h:Lcom/horcrux/svg/s;

.field public static final enum i:Lcom/horcrux/svg/s;

.field public static final enum j:Lcom/horcrux/svg/s;

.field public static final enum k:Lcom/horcrux/svg/s;

.field public static final enum l:Lcom/horcrux/svg/s;

.field public static final enum m:Lcom/horcrux/svg/s;

.field private static final n:Ljava/util/Map;

.field private static final synthetic o:[Lcom/horcrux/svg/s;


# instance fields
.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/s;

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
    invoke-direct {v0, v2, v3, v1}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/horcrux/svg/s;->h:Lcom/horcrux/svg/s;

    .line 12
    .line 13
    new-instance v0, Lcom/horcrux/svg/s;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "normal"

    .line 17
    .line 18
    const-string v4, "NORMAL"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/horcrux/svg/s;->i:Lcom/horcrux/svg/s;

    .line 24
    .line 25
    new-instance v0, Lcom/horcrux/svg/s;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "multiply"

    .line 29
    .line 30
    const-string v4, "MULTIPLY"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/horcrux/svg/s;->j:Lcom/horcrux/svg/s;

    .line 36
    .line 37
    new-instance v0, Lcom/horcrux/svg/s;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "screen"

    .line 41
    .line 42
    const-string v4, "SCREEN"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/horcrux/svg/s;->k:Lcom/horcrux/svg/s;

    .line 48
    .line 49
    new-instance v0, Lcom/horcrux/svg/s;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "darken"

    .line 53
    .line 54
    const-string v4, "DARKEN"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/horcrux/svg/s;->l:Lcom/horcrux/svg/s;

    .line 60
    .line 61
    new-instance v0, Lcom/horcrux/svg/s;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "lighten"

    .line 65
    .line 66
    const-string v4, "LIGHTEN"

    .line 67
    .line 68
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/horcrux/svg/s;->m:Lcom/horcrux/svg/s;

    .line 72
    .line 73
    invoke-static {}, Lcom/horcrux/svg/s;->h()[Lcom/horcrux/svg/s;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lcom/horcrux/svg/s;->o:[Lcom/horcrux/svg/s;

    .line 78
    .line 79
    new-instance v0, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lcom/horcrux/svg/s;->n:Ljava/util/Map;

    .line 85
    .line 86
    invoke-static {}, Lcom/horcrux/svg/s;->values()[Lcom/horcrux/svg/s;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    array-length v1, v0

    .line 91
    :goto_0
    if-ge v3, v1, :cond_0

    .line 92
    .line 93
    aget-object v2, v0, v3

    .line 94
    .line 95
    sget-object v4, Lcom/horcrux/svg/s;->n:Ljava/util/Map;

    .line 96
    .line 97
    iget-object v5, v2, Lcom/horcrux/svg/s;->g:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
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
    iput-object p3, p0, Lcom/horcrux/svg/s;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic h()[Lcom/horcrux/svg/s;
    .locals 6

    .line 1
    sget-object v0, Lcom/horcrux/svg/s;->h:Lcom/horcrux/svg/s;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/s;->i:Lcom/horcrux/svg/s;

    .line 4
    .line 5
    sget-object v2, Lcom/horcrux/svg/s;->j:Lcom/horcrux/svg/s;

    .line 6
    .line 7
    sget-object v3, Lcom/horcrux/svg/s;->k:Lcom/horcrux/svg/s;

    .line 8
    .line 9
    sget-object v4, Lcom/horcrux/svg/s;->l:Lcom/horcrux/svg/s;

    .line 10
    .line 11
    sget-object v5, Lcom/horcrux/svg/s;->m:Lcom/horcrux/svg/s;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lcom/horcrux/svg/s;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static j(Ljava/lang/String;)Lcom/horcrux/svg/s;
    .locals 3

    .line 1
    sget-object v0, Lcom/horcrux/svg/s;->n:Ljava/util/Map;

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
    check-cast p0, Lcom/horcrux/svg/s;

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
    const-string v2, "Unknown String Value: "

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

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/s;
    .locals 1

    .line 1
    const-class v0, Lcom/horcrux/svg/s;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/horcrux/svg/s;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/s;
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/s;->o:[Lcom/horcrux/svg/s;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/horcrux/svg/s;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/horcrux/svg/s;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/s;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
