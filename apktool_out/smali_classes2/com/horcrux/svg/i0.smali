.class final enum Lcom/horcrux/svg/i0;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum h:Lcom/horcrux/svg/i0;

.field public static final enum i:Lcom/horcrux/svg/i0;

.field public static final enum j:Lcom/horcrux/svg/i0;

.field public static final enum k:Lcom/horcrux/svg/i0;

.field public static final enum l:Lcom/horcrux/svg/i0;

.field private static final m:Ljava/util/Map;

.field private static final synthetic n:[Lcom/horcrux/svg/i0;


# instance fields
.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    const-string v1, "none"

    .line 4
    .line 5
    const-string v2, "None"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/horcrux/svg/i0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/horcrux/svg/i0;->h:Lcom/horcrux/svg/i0;

    .line 12
    .line 13
    new-instance v0, Lcom/horcrux/svg/i0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "underline"

    .line 17
    .line 18
    const-string v4, "Underline"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/i0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/horcrux/svg/i0;->i:Lcom/horcrux/svg/i0;

    .line 24
    .line 25
    new-instance v0, Lcom/horcrux/svg/i0;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "overline"

    .line 29
    .line 30
    const-string v4, "Overline"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/i0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/horcrux/svg/i0;->j:Lcom/horcrux/svg/i0;

    .line 36
    .line 37
    new-instance v0, Lcom/horcrux/svg/i0;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "line-through"

    .line 41
    .line 42
    const-string v4, "LineThrough"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/i0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/horcrux/svg/i0;->k:Lcom/horcrux/svg/i0;

    .line 48
    .line 49
    new-instance v0, Lcom/horcrux/svg/i0;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "blink"

    .line 53
    .line 54
    const-string v4, "Blink"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/i0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/horcrux/svg/i0;->l:Lcom/horcrux/svg/i0;

    .line 60
    .line 61
    invoke-static {}, Lcom/horcrux/svg/i0;->h()[Lcom/horcrux/svg/i0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lcom/horcrux/svg/i0;->n:[Lcom/horcrux/svg/i0;

    .line 66
    .line 67
    new-instance v0, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lcom/horcrux/svg/i0;->m:Ljava/util/Map;

    .line 73
    .line 74
    invoke-static {}, Lcom/horcrux/svg/i0;->values()[Lcom/horcrux/svg/i0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    array-length v1, v0

    .line 79
    :goto_0
    if-ge v3, v1, :cond_0

    .line 80
    .line 81
    aget-object v2, v0, v3

    .line 82
    .line 83
    sget-object v4, Lcom/horcrux/svg/i0;->m:Ljava/util/Map;

    .line 84
    .line 85
    iget-object v5, v2, Lcom/horcrux/svg/i0;->g:Ljava/lang/String;

    .line 86
    .line 87
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
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
    iput-object p3, p0, Lcom/horcrux/svg/i0;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic h()[Lcom/horcrux/svg/i0;
    .locals 5

    .line 1
    sget-object v0, Lcom/horcrux/svg/i0;->h:Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/i0;->i:Lcom/horcrux/svg/i0;

    .line 4
    .line 5
    sget-object v2, Lcom/horcrux/svg/i0;->j:Lcom/horcrux/svg/i0;

    .line 6
    .line 7
    sget-object v3, Lcom/horcrux/svg/i0;->k:Lcom/horcrux/svg/i0;

    .line 8
    .line 9
    sget-object v4, Lcom/horcrux/svg/i0;->l:Lcom/horcrux/svg/i0;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/horcrux/svg/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static j(Ljava/lang/String;)Lcom/horcrux/svg/i0;
    .locals 3

    .line 1
    sget-object v0, Lcom/horcrux/svg/i0;->m:Ljava/util/Map;

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
    check-cast p0, Lcom/horcrux/svg/i0;

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

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/i0;
    .locals 1

    .line 1
    const-class v0, Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/horcrux/svg/i0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/i0;
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/i0;->n:[Lcom/horcrux/svg/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/horcrux/svg/i0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/horcrux/svg/i0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/i0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
