.class public enum LU7/U$c;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU7/U$c$a;
    }
.end annotation


# static fields
.field public static final enum h:LU7/U$c;

.field public static final enum i:LU7/U$c;

.field public static final enum j:LU7/U$c;

.field public static final enum k:LU7/U$c;

.field private static final synthetic l:[LU7/U$c;

.field private static final synthetic m:Lkotlin/enums/EnumEntries;


# instance fields
.field private final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LU7/U$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "NULL"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, LU7/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LU7/U$c;->h:LU7/U$c;

    .line 11
    .line 12
    new-instance v0, LU7/U$c;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "INDEX"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v0, v2, v3, v1}, LU7/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LU7/U$c;->i:LU7/U$c;

    .line 26
    .line 27
    new-instance v0, LU7/U$c;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    const-string v3, "FALSE"

    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, LU7/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, LU7/U$c;->j:LU7/U$c;

    .line 38
    .line 39
    new-instance v0, LU7/U$c$a;

    .line 40
    .line 41
    const-string v1, "MAP_GET_OR_DEFAULT"

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    invoke-direct {v0, v1, v2}, LU7/U$c$a;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LU7/U$c;->k:LU7/U$c;

    .line 48
    .line 49
    invoke-static {}, LU7/U$c;->h()[LU7/U$c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LU7/U$c;->l:[LU7/U$c;

    .line 54
    .line 55
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, LU7/U$c;->m:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LU7/U$c;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LU7/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final synthetic h()[LU7/U$c;
    .locals 4

    .line 1
    sget-object v0, LU7/U$c;->h:LU7/U$c;

    .line 2
    .line 3
    sget-object v1, LU7/U$c;->i:LU7/U$c;

    .line 4
    .line 5
    sget-object v2, LU7/U$c;->j:LU7/U$c;

    .line 6
    .line 7
    sget-object v3, LU7/U$c;->k:LU7/U$c;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LU7/U$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LU7/U$c;
    .locals 1

    .line 1
    const-class v0, LU7/U$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LU7/U$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LU7/U$c;
    .locals 1

    .line 1
    sget-object v0, LU7/U$c;->l:[LU7/U$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LU7/U$c;

    .line 8
    .line 9
    return-object v0
.end method
