.class public final Le9/E$b$a;
.super Le9/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/E$b;->f(Lt9/j;Le9/x;J)Le9/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Lt9/j;

.field final synthetic h:Le9/x;

.field final synthetic i:J


# direct methods
.method constructor <init>(Lt9/j;Le9/x;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/E$b$a;->g:Lt9/j;

    .line 2
    .line 3
    iput-object p2, p0, Le9/E$b$a;->h:Le9/x;

    .line 4
    .line 5
    iput-wide p3, p0, Le9/E$b$a;->i:J

    .line 6
    .line 7
    invoke-direct {p0}, Le9/E;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le9/E$b$a;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/E$b$a;->h:Le9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lt9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/E$b$a;->g:Lt9/j;

    .line 2
    .line 3
    return-object v0
.end method
