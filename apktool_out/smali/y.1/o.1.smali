.class public interface abstract Ly/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LF/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LF/A0;->a(Ljava/lang/Object;)LF/A0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ly/o;->a:LF/A0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LF/A0;
    .locals 1

    .line 1
    sget-object v0, Ly/o;->a:LF/A0;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract b(Ljava/util/List;)Ljava/util/List;
.end method
