.class public final enum LC8/N0;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum k:LC8/N0;

.field public static final enum l:LC8/N0;

.field public static final enum m:LC8/N0;

.field private static final synthetic n:[LC8/N0;

.field private static final synthetic o:Lkotlin/enums/EnumEntries;


# instance fields
.field private final g:Ljava/lang/String;

.field private final h:Z

.field private final i:Z

.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LC8/N0;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v6, 0x0

    .line 5
    const-string v1, "INVARIANT"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, ""

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-direct/range {v0 .. v6}, LC8/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LC8/N0;->k:LC8/N0;

    .line 15
    .line 16
    new-instance v1, LC8/N0;

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    const-string v2, "IN_VARIANCE"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const-string v4, "in"

    .line 23
    .line 24
    invoke-direct/range {v1 .. v7}, LC8/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 25
    .line 26
    .line 27
    sput-object v1, LC8/N0;->l:LC8/N0;

    .line 28
    .line 29
    new-instance v2, LC8/N0;

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/4 v8, 0x1

    .line 33
    const-string v3, "OUT_VARIANCE"

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const-string v5, "out"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v8}, LC8/N0;-><init>(Ljava/lang/String;ILjava/lang/String;ZZI)V

    .line 39
    .line 40
    .line 41
    sput-object v2, LC8/N0;->m:LC8/N0;

    .line 42
    .line 43
    invoke-static {}, LC8/N0;->h()[LC8/N0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, LC8/N0;->n:[LC8/N0;

    .line 48
    .line 49
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LC8/N0;->o:Lkotlin/enums/EnumEntries;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LC8/N0;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p4, p0, LC8/N0;->h:Z

    .line 7
    .line 8
    iput-boolean p5, p0, LC8/N0;->i:Z

    .line 9
    .line 10
    iput p6, p0, LC8/N0;->j:I

    .line 11
    .line 12
    return-void
.end method

.method private static final synthetic h()[LC8/N0;
    .locals 3

    .line 1
    sget-object v0, LC8/N0;->k:LC8/N0;

    .line 2
    .line 3
    sget-object v1, LC8/N0;->l:LC8/N0;

    .line 4
    .line 5
    sget-object v2, LC8/N0;->m:LC8/N0;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LC8/N0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LC8/N0;
    .locals 1

    .line 1
    const-class v0, LC8/N0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LC8/N0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LC8/N0;
    .locals 1

    .line 1
    sget-object v0, LC8/N0;->n:[LC8/N0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LC8/N0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC8/N0;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/N0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/N0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
