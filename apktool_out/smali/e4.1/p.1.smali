.class public final synthetic Le4/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le4/M$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LW3/o;


# direct methods
.method public synthetic constructor <init>(JLW3/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Le4/p;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Le4/p;->b:LW3/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, Le4/p;->a:J

    .line 2
    .line 3
    iget-object v2, p0, Le4/p;->b:LW3/o;

    .line 4
    .line 5
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Le4/M;->X(JLW3/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
