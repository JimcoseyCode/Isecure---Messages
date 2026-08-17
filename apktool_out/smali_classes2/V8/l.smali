.class final LV8/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ln7/f;


# static fields
.field public static final g:LV8/l;

.field private static final h:Ln7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV8/l;

    .line 2
    .line 3
    invoke-direct {v0}, LV8/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV8/l;->g:LV8/l;

    .line 7
    .line 8
    sget-object v0, Ln7/k;->g:Ln7/k;

    .line 9
    .line 10
    sput-object v0, LV8/l;->h:Ln7/j;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getContext()Ln7/j;
    .locals 1

    .line 1
    sget-object v0, LV8/l;->h:Ln7/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
