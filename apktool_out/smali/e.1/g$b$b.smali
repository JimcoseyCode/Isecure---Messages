.class public final Le/g$b$b;
.super Le/g$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Le/g$b$b;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/g$b$b;

    .line 2
    .line 3
    invoke-direct {v0}, Le/g$b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le/g$b$b;->a:Le/g$b$b;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput v0, Le/g$b$b;->b:I

    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Le/g$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    sget v0, Le/g$b$b;->b:I

    .line 2
    .line 3
    return v0
.end method
